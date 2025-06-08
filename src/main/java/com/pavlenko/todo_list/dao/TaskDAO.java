package com.pavlenko.todo_list.dao;

import com.pavlenko.todo_list.entity.Task;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class TaskDAO {

    private final SessionFactory sessionFactory;

    @Autowired
    public TaskDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Transactional
    public List<Task> getAllTasks() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Task", Task.class).getResultList();
    }
}
