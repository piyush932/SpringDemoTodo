package com.example.TodoApp.repositories;

import com.example.TodoApp.schema.Todo;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//@Repository
//@Profile("dev")
@Repository("inMemoryTodoRepository")
public class InMemoryTodoRepository implements ITodoRepository {
    private final List<Todo> todos = new ArrayList<>(Arrays.asList(
            new Todo("1", "Buy groceries"),
            new Todo("2", "Buy groceries"),
            new Todo("3", "Buy groceries")
    ));

    public List<Todo> findAll() {
        return todos;
    }
}
