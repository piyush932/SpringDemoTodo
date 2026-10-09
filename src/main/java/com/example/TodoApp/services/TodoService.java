package com.example.TodoApp.services;

import com.example.TodoApp.repositories.TodoRepository;
import com.example.TodoApp.schema.Todo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TodoService {

    private TodoRepository todoRepository;
    public List<Todo> getAllTodos() {
        // some algo to be exec
        return todoRepository.findAll();

    }

}
