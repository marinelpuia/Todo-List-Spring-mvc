package com.marinel.service;

import com.marinel.model.TodoData;
import com.marinel.model.TodoItem;

public interface TodoItemService {


    void addItem(TodoItem toAdd);
    void removeItem(int id);
    TodoItem getItem(int id);
    void updateItem(TodoItem toUpdate);
    TodoData getData();
}
