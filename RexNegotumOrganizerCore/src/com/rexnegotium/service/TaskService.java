package com.rexnegotium.service;

import java.util.List;

import com.rexnegotium.config.factories.RepositoryFactory;
import com.rexnegotium.model.Task;
import com.rexnegotium.repository.TaskRepository;

public class TaskService {
	
	private TaskRepository taskRepository;
	
	public TaskService() {
		// ����� getInstance.. ������� ��� � ���,
		// ��� ������ ����� ������ ����� ���������� 
		// ���� � ��� �� ������ TaskRepository
		taskRepository = RepositoryFactory.getInstanceOfTaskRepository();
	}
	
	public List<Task> getAll() {
		return taskRepository.getAll();
	}

}
