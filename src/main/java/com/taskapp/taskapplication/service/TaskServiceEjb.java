package com.taskapp.taskapplication.service;

import com.taskapp.taskapplication.Task;
import com.taskapp.taskapplication.dao.TaskDaoJpa;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class TaskServiceEjb implements TaskService<Task>{

    @Inject
    private TaskDaoJpa dao;

    public TaskServiceEjb() {
    }

    @Override
    public Task getById(Integer id) {
        return dao.getById(id);
    }

    @Override
    public List getAll() {
        return dao.getAll();
    }

    @Override
    public void insert(Task task) {
        dao.insert(task);
    }

    @Override
    public void update(Task task) {
        dao.update(task);
    }

    @Override
    public void delete(Integer id) {
        dao.delete(dao.getById(id));
    }
}
