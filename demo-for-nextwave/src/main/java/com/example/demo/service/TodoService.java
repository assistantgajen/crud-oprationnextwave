package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Todo;

public interface TodoService {
    List<Todo> getAllTodos();

    Todo createTodo(Todo todo);

    Todo getTodoById(Long id);

    Todo updateTodoById(Long id, Todo todo);

    void deleteTodoById(Long id);
}

