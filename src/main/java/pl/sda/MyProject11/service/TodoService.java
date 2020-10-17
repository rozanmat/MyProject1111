package pl.sda.MyProject11.service;

import pl.sda.MyProject11.entity.Todo;

import java.util.List;

public interface TodoService {

    List<Todo> getAll();

    List<Todo> getAllCompleted();

    Todo addTodo(String name);

    void completeTodo(Long id);
}

