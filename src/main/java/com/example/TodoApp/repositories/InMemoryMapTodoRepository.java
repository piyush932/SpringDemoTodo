package com.example.TodoApp.repositories;

import com.example.TodoApp.repositories.ITodoRepository;
import com.example.TodoApp.schema.Todo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class InMemoryMapTodoRepository implements ITodoRepository {

    private Map<String, Todo> todos = new HashMap<>();


    public List<Todo> findAll() {
        return new ArrayList<Todo>(todos.values());
    }

}
