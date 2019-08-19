package com.rexnegotium.config.factories;

import com.rexnegotium.repository.TaskRepository;
import com.rexnegotium.repository.inmemory.InMemoryTaskRepository;

public class RepositoryFactory {

	private static TaskRepository taskRepository;
	
	/**
	 * ������ ���������� ������������ ��������� TaskRepository
	 * 
	 * @return
	 */
	public static TaskRepository getInstanceOfTaskRepository() {
		
		if (taskRepository == null) {
			// ������ �� ����� ������������ InMemoryTaskRepository
			// � �������� ������ ������������ ������ ����������
			// ����� �� ��� ������� � ������� ���� ���������
			taskRepository = new InMemoryTaskRepository();
		}
		
		return taskRepository;
	}

}
