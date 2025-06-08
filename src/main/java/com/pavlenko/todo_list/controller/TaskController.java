package com.pavlenko.todo_list.controller;

import com.pavlenko.todo_list.dao.TaskDAO;
import com.pavlenko.todo_list.entity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/")
public class TaskController {

    private final TaskDAO taskDAO;

    @Autowired
    public TaskController(TaskDAO taskDAO) {
        this.taskDAO = taskDAO;
    }

    @GetMapping
    public ModelAndView showAllTasks(ModelAndView modelAndView) {
        List<Task> allTasks = taskDAO.getAllTasks();
        modelAndView.addObject("tasks", allTasks);
        modelAndView.setViewName("all-tasks");
        return modelAndView;
    }
}
