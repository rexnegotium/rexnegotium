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
	private Integer mapId = 10000;
    private static int idSequence = 10000;

    private static int getNextId() {
        return idSequence++;
    }

	/** 
	 * Создаёт экземпляр репозитория и наполняет его тестовыми данными
	 * 
	 * Вызывать этот конструктор в боевом коде не следует
	 * Пользуйтесь методом RepositoryFactory.getInstanceOfTaskRepository()
	 */
	public InMemoryTaskRepository() {
		entryMap = new ConcurrentHashMap();
	}

	/**
	 * todo - создать полность сформированные тестовые задания здесь
	 * 
	 */

	@Override
	public List<Task> getAll() {
		List<Task> allTasks = new ArrayList();
		
		for (Map.Entry<Integer, Task> taskEntry : entryMap.entrySet()) {
			allTasks.add(taskEntry.getValue());
		}
		
		return allTasks;
	}

	@Override
	public void saveOne(Task task) {
		entryMap.put(getNextNumber(),task);
		System.out.println("Task saved...");
	}

	@Override
	public Task newTask() {
		return new Task();
	}

	private Integer getNextNumber(){
		return mapId++;
	}

	public Integer getMapId() {
		return mapId;
	}


}
