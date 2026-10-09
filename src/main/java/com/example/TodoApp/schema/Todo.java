package com.example.TodoApp.schema;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Todo {
    private String id;
    private String content;
}
