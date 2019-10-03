package com.rexnegotium.controller;

import java.util.List;

import com.rexnegotium.model.Task;
import com.rexnegotium.service.TaskService;

public class TaskController {

    private TaskService taskService;

    public TaskController() {
        System.out.println("Initializint TaskController...");

        taskService = new TaskService();

        System.out.println("TaskController initialized!");
    }

    public List<Task> getAll() {
        return taskService.getAll();
    }

    public Task createTask(Task task) {
        return taskService.create(task);
    }

    public Task findTaskById(Integer id) throws Exception {
        return taskService.findTaskById(id);
    }
}
