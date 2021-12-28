package com.marinel.model;

import lombok.NonNull;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class TodoData {

    // == fields ==
    private static int idValue = 1;

    // == I use List to store the data in-memory ==
    private static List<TodoItem> items = new ArrayList<>();

    // == add some dummy data using the addItem method, so it set the id field ==
    // == to use only LocalDate.now() , change the string deadline in TodoItem with LocalDate ==
    public TodoData() {
        addItem(new TodoItem("Mercedes", "Masina a fost achizitionata cu pretul de 25500 Euro si are pret de vânzare de 27750 Euro.", LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
        addItem(new TodoItem("Bmw", "Masina a fost achizitionata cu pretul de 16500 Euro si are pret de vânzare de 19750 Euro.", LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
        addItem(new TodoItem("Audi", "Masina a fost achizitionata cu pretul de 22500 Euro si are pret de vânzare de 24750 Euro.", LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
        addItem(new TodoItem("Jeep", "Masina a fost achizitionata cu pretul de 16500 Euro si are pret de vânzare de 17750 Euro.", LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
        addItem(new TodoItem("Land Rover", "Masina a fost achizitionata cu pretul de 6500 Euro si are pret de vânzare de 7750 Euro.", LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
        addItem(new TodoItem("Rubicon", "Masina a fost achizitionata cu pretul de 21500 Euro si are pret de vânzare de 23700 Euro.", LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
        addItem(new TodoItem("Opel", "Masina a fost achizitionata cu pretul de 5500 Euro si are pret de vânzare de 7550 Euro.", LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
        addItem(new TodoItem("Renault", "Masina a fost achizitionata cu pretul de 4500 Euro si are pret de vânzare de 5350 Euro.", LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
    }

    // == add some functionality to the class like CRUD operations (create,read,update,delete) items ==

    // == get items from the list ==
    public List<TodoItem> getItems() {
        return Collections.unmodifiableList(items);
    }

    // == add items to the list ==
    // == use of @NonNull lombok annotation to replace the if() null test for argument toADD ==
    public void addItem(@NonNull TodoItem toAdd) {
        toAdd.setId(idValue);
        items.add(toAdd);
        idValue++;
    }

    // == remove items from the list using ListIterator ==
    public void removeItem(int id) {
        ListIterator<TodoItem> itemIterator = items.listIterator();

        while (itemIterator.hasNext()) {
            TodoItem item = itemIterator.next();

            if (item.getId() == id) {
                itemIterator.remove();
                break;
            }
        }
    }

    // == get an item based on this ID ==
    public TodoItem getItem(int id) {
        for (TodoItem item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    // == update an item ==
    public void updateItem(@NonNull TodoItem toUpdate) {
        ListIterator<TodoItem> itemIterator = items.listIterator();

        while (itemIterator.hasNext()) {
            TodoItem item = itemIterator.next();

            if (item.equals(toUpdate)) {
                itemIterator.set(toUpdate);
                break;
            }
        }
    }
}
