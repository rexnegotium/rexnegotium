package com.rexnegotium.config.factories;

import com.rexnegotium.repository.TaskRepository;
import com.rexnegotium.repository.UserRepository;
import com.rexnegotium.repository.inmemory.InMemoryTaskRepository;
import com.rexnegotium.repository.inmemory.InMemoryUserRepository;

public class RepositoryFactory {

	private static TaskRepository taskRepository;
	private static UserRepository userRepository;
	
	/**
	 * Всегда возвращает единственный экземпляр TaskRepository
	 * 
	 * @return
	 */
	public static TaskRepository getInstanceOfTaskRepository() {
		
		if (taskRepository == null) {
			// сейчас мы будем пользоваться InMemoryTaskRepository
			// в будующем сможем использовать другие реализации
			// меняя их как плагины с помощью этой настройки
			taskRepository = new InMemoryTaskRepository();
		}
		
		return taskRepository;
	}

    public static UserRepository getInstanceOfUserRepository() {

		if (userRepository == null) {
			userRepository = new InMemoryUserRepository();
		}
		return userRepository;
    }
}
