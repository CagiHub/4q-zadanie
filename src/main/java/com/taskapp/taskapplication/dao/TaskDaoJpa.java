package com.taskapp.taskapplication.dao;

import com.taskapp.taskapplication.Task;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@ApplicationScoped
public class TaskDaoJpa implements TaskDao<Task> {

    @PersistenceContext
    private EntityManager em;

    public TaskDaoJpa() {
    }

    @Override
    public Task getById(Integer id) {
        em.getTransaction().begin();
        Task task = em.find(Task.class, id);
        em.getTransaction().commit();
        return task;
    }

    @Override
    public List<Task> getAll() {
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT e FROM Task e", Task.class);
        em.getTransaction().commit();
        return query.getResultList();
    }

    @Override
    public void insert(Task task) {
        em.getTransaction().begin();
        em.persist(task);
        em.getTransaction().commit();
    }

    @Override
    public void update(Task task){
        em.getTransaction().begin();
        em.merge(task);
        em.getTransaction().commit();
    }

    @Override
    public void delete(Task task) {
        em.getTransaction().begin();
        if (!em.contains(task)) {
            task = em.merge(task);
        }
        em.remove(task);
        em.getTransaction().commit();
    }

}
