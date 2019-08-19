package com.rexnegotium.repository.inmemory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.rexnegotium.config.factories.RepositoryFactory;
import com.rexnegotium.model.Task;
import com.rexnegotium.repository.TaskRepository;

/**
 * ��������� �����, ������� �� ����� ������������ ��� ������.
 * ���������������� ��� ������ ��������� ��������� �������
 * 
 * @author Ivan Senchukov
 *
 */
public class InMemoryTaskRepository implements TaskRepository {

	private Map<Integer, Task> entryMap;
	
	/** 
	 * ������ ��������� ����������� � ��������� ��� ��������� �������
	 * 
	 * �������� ���� ����������� � ������ ���� �� �������
	 * ����������� ������� RepositoryFactory.getInstanceOfTaskRepository()
	 */
	public InMemoryTaskRepository() {
		entryMap = new ConcurrentHashMap();
		refreshRepository();
	}
	
	/**
	 * todo - ������� �������� �������������� �������� ������� �����
	 * 
	 */
	public void refreshRepository() {
		entryMap.put(10000, new Task()); // ��� �������� ���, ���� ��� ���-�� ��������� - ����� �������.
		entryMap.put(10001, new Task()); // ��� �������� ���, ���� ��� ���-�� ��������� - ����� �������.
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
