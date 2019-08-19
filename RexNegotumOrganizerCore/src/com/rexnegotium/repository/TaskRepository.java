package com.rexnegotium.repository;

import java.util.List;

import com.rexnegotium.model.Task;

/**
 * ��������� ��������� ��������� �������, ������� ��������� ���� ���������.
 * 
 * @author Ivan Senchukov
 *
 */
public interface TaskRepository {

	/**
	 * ���������� ��� ��������� ������� Task
	 * ���� ��� �� ������ - ���������� ������ ����.
	 * 
	 * todo - ����� ���������� �������������� �������� ��� ������ ������ ������������
	 *  
	 * @return
	 */
	public List<Task> getAll();

}
