package com.taskapp.taskapplication.service;

import com.taskapp.taskapplication.Task;

import java.util.List;

public interface TaskService<T> {
    Task getById(Integer id);

    List<T> getAll();

    void insert(T t);

    void update(T t);

    void delete(Integer id);
}
