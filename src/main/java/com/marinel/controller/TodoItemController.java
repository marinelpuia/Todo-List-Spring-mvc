package com.marinel.controller;

import com.marinel.model.TodoData;
import com.marinel.model.TodoItem;
import com.marinel.service.TodoItemService;
import com.marinel.util.AttributeNames;
import com.marinel.util.Mappings;
import com.marinel.util.ViewNames;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Slf4j
@Controller
public class TodoItemController {

    // this class will contain request methods for TodoItem class
    // this class need to annotated as a controller

    private final TodoItemService todoItemService;

    // == constructors ==
    @Autowired
    public TodoItemController(TodoItemService todoItemService) {
        this.todoItemService = todoItemService;
    }

    @ModelAttribute
    public TodoData todoData() {
        return todoItemService.getData();
    }

    // == create the handler methods for the items to see the task in the table ==
    @GetMapping(Mappings.ITEMS) // http:// localhost:8080/todo-list/items
    public String items() {
        return ViewNames.ITEMS_LIST;
    }

    // == method to add and edit an existing item ==
    @GetMapping(Mappings.ADD_ITEM)
    public String addEditItem(@RequestParam(required = false, defaultValue = "-1") int id, Model model) {

        log.info("editing id = {}", id);
        TodoItem todoItem = todoItemService.getItem(id);

        if (todoItem == null) {
            todoItem = new TodoItem("", "", LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        }

        model.addAttribute(AttributeNames.TODO_ITEM, todoItem);
        return ViewNames.ADD_ITEM;
    }

    // == method to add item to the table ==
    @PostMapping(Mappings.ADD_ITEM)
    public String processItem(@ModelAttribute(AttributeNames.TODO_ITEM) TodoItem todoItem) {
        log.info("todoItem from form = {}", todoItem);

        if (todoItem.getId() == 0) {
            todoItemService.addItem(todoItem);
        } else {
            todoItemService.updateItem(todoItem);
        }

        return "redirect:/" + Mappings.ITEMS;
    }

    // == method to delete item ==
    @GetMapping(Mappings.DELETE_ITEM)
    public String deleteItem(@RequestParam int id) {
        log.info("Deleting item with id = {}", id);
        todoItemService.removeItem(id);
        return "redirect:/" + Mappings.ITEMS;
    }

    // == method for view single item ==
    @GetMapping(Mappings.VIEW_ITEM)
    public String viewItem(@RequestParam() int id, Model model) {
        log.info("Viewing single item id ={}", id);
        TodoItem todoItem = todoItemService.getItem(id);
        model.addAttribute(AttributeNames.TODO_ITEM, todoItem);
        return ViewNames.VIEW_ITEM;
    }
}
