package com.rexnegotium.config.factories;

import com.rexnegotium.repository.TaskRepository;
import com.rexnegotium.repository.inmemory.InMemoryTaskRepository;

public class RepositoryFactory {

	private static TaskRepository taskRepository;
	
	/**
	 * ¬сегда возвращает единственный экземпл€р TaskRepository
	 * 
	 * @return
	 */
	public static TaskRepository getInstanceOfTaskRepository() {
		
		if (taskRepository == null) {
			// сейчас мы будем пользоватьс€ InMemoryTaskRepository
			// в будующем сможем использовать другие реализации
			// мен€€ их как плагины с помощью этой настройки
			taskRepository = new InMemoryTaskRepository();
		}
		
		return taskRepository;
	}

}
