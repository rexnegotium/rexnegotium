package com.rexnegotium.repository.inmemory;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.rexnegotium.model.Task;
import com.rexnegotium.repository.TaskRepository;

/**
 * Хранилище задач, которое мы будем использовать для тестов.
 * Инициализируется при первом обращении тестовыми данными
 *
 * @author Ivan Senchukov
 */
public class InMemoryTaskRepository implements TaskRepository {

    private Map<Integer, Task> entryMap;
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
		refreshRepository();
	}

	public void refreshRepository() {

		int firstTaskId = 10000;
		int secondTaskId = 100001;

		Task firstTask = new Task("Head First Java", null, LocalDateTime.of(2019, 6, 1, 0,0), null, true);
		firstTask.setId(firstTaskId);
		Task secondTask = new Task("Head First Design Patterns", null, LocalDateTime.of(2019, 6, 1, 0,0), null, true);
		secondTask.setId(secondTaskId);

		entryMap.put(firstTaskId, firstTask);
		entryMap.put(secondTaskId, secondTask);
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
    public Task create(Task task) {
        int id = getNextId();
        task.setId(id);
        entryMap.put(id, task);
        System.out.println("Task saved...");
        return task;
    }

    @Override
    public Task findTaskById(Integer id) throws Exception {
        // todo - логгировать нахождение таска.
        Task foundTask = entryMap.get(id);
        if ((foundTask != null) && !(foundTask.getId().equals(id))) {
            // todo - перенести исключение в RepositoryException
            throw new Exception();
        }
        return foundTask;
    }
}

