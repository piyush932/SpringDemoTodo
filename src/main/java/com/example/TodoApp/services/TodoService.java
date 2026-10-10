package com.example.TodoApp.services;

import com.example.TodoApp.repositories.ITodoRepository;
import com.example.TodoApp.repositories.InMemoryTodoRepository;
import com.example.TodoApp.schema.Todo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

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

    public Todo createTodo(Todo todo) {

        long maxId = todoRepository.findAll().stream()
                .map(Todo::getId)
                .filter(Objects::nonNull)
                .filter(id -> id.matches("\\d+"))
                .mapToLong(Long::parseLong)
                .max()
                .orElse(0L);

        String newTodoId = String.valueOf(maxId + 1);

        todo.setId(newTodoId);

        return todoRepository.save(todo);
    }

}
