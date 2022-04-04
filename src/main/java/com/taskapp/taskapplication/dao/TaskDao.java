package com.taskapp.taskapplication.dao;

import com.taskapp.taskapplication.Task;

import java.util.List;

public interface TaskDao<T> {

    Task getById(Integer id);

    List<T> getAll();

    void insert(T t);

    void update(T t);

    void delete(T t);
}
