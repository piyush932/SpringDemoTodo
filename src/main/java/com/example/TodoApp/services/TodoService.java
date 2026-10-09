package com.example.TodoApp.services;

import com.example.TodoApp.repositories.ITodoRepository;
import com.example.TodoApp.repositories.InMemoryTodoRepository;
import com.example.TodoApp.schema.Todo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@AllArgsConstructor
public class TodoService {

    private ITodoRepository todoRepository;

    public TodoService(@Qualifier("inMemoryMapTodoRepository") ITodoRepository _todoRepository) { // Todo: try to fetch the string value from env variable
        this.todoRepository = _todoRepository;
    }

    public List<Todo> getAllTodos() {
        // some algo to be exec
        return todoRepository.findAll();

    }

}
