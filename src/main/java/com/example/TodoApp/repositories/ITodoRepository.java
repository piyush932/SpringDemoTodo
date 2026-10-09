package com.example.TodoApp.repositories;

import com.example.TodoApp.schema.Todo;

import java.util.List;

public interface ITodoRepository {
    List<Todo> findAll();
}
