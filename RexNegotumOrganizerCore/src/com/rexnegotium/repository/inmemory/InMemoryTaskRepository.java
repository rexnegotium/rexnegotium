package com.rexnegotium.repository.inmemory;

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
     * <p>
     * Вызывать этот конструктор в боевом коде не следует
     * Пользуйтесь методом RepositoryFactory.getInstanceOfTaskRepository()
     */
    public InMemoryTaskRepository() {
        entryMap = new ConcurrentHashMap();
    }

    /**
     * todo - создать полность сформированные тестовые задания здесь
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
    public Task newTask() {
        return new Task();
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
        // как вернуть таск в мейн?
        System.out.println("Task found...");
        Task foundTask = entryMap.get(id);
        if ((foundTask == null) && !(foundTask.getId().equals(id)) && !(entryMap.containsKey(id))) {
            throw new Exception();
        }
        return foundTask;
    }
}

