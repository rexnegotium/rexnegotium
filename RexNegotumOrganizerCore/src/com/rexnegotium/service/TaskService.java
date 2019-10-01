package com.rexnegotium.service;

import java.util.List;
import com.rexnegotium.config.factories.RepositoryFactory;
import com.rexnegotium.model.Task;
import com.rexnegotium.repository.TaskRepository;

public class TaskService {
	
	private TaskRepository taskRepository;
	
	public TaskService() {
		// фраза getInstance.. говорит нам о том,
		// что данный метод всегда будет возвращать 
		// один и тот же объект TaskRepository
		taskRepository = RepositoryFactory.getInstanceOfTaskRepository();
	}
	
	public List<Task> getAll() {
		return taskRepository.getAll();
	}

    /**
	 *obryvalka */
	public Task create(Task task) {
		return taskRepository.create(task);
	}

    public Task findTaskById(Integer id) throws Exception {
        return taskRepository.findTaskById(id);
    }
}
