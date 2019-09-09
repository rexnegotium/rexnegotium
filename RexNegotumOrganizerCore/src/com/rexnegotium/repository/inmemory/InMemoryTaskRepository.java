package com.rexnegotium.repository.inmemory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.rexnegotium.config.factories.RepositoryFactory;
import com.rexnegotium.model.Task;
import com.rexnegotium.repository.TaskRepository;

/**
 * Хранилище задач, которое мы будем использовать для тестов.
 * Инициализируется при первом обращении тестовыми данными
 * 
 * @author Ivan Senchukov
 *
 */
public class InMemoryTaskRepository implements TaskRepository {

	private Map<Integer, Task> entryMap;
	
	/** 
	 * Создаёт экземпляр репозитория и наполняет его тестовыми данными
	 * 
	 * Вызывать этот конструктор в боевом коде не следует
	 * Пользуйтесь методом RepositoryFactory.getInstanceOfTaskRepository()
	 */
	public InMemoryTaskRepository() {
		entryMap = new ConcurrentHashMap();
		refreshRepository();
	}
	
	/**
	 * todo - создать полность сформированные тестовые задания здесь
	 * 
	 */
	public void refreshRepository() {
		entryMap.put(10000, new Task()); // это тестовый код, если тут что-то сломается - можно удалять.
		entryMap.put(10001, new Task()); // это тестовый код, если тут что-то сломается - можно удалять.
	}
	
	@Override
	public List<Task> getAll() {
		List<Task> allTasks = new ArrayList();
		
		for (Map.Entry<Integer, Task> taskEntry : entryMap.entrySet()) {
			allTasks.add(taskEntry.getValue());
		}
		
		return allTasks;
	}

}
