package com.marinel.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

// i use lombok to eliminate a long boilerplate code
// @Data = lombok annotation for getter setter and other methods
@Data
@EqualsAndHashCode(of = "id") // for multiple fields use {"id", "title"}
public class TodoItem {


    // == fields ==
    private int id;
    private String title;
    private String details;
    private String deadLine;
    //private LocalDate deadLine; TodoItemController line 55 need change if I use LocalDate instead of String

    // == constructor ==
    public TodoItem(String title, String details, String deadLine) {
        this.title = title;
        this.details = details;
        this.deadLine =  deadLine;
    }
}
