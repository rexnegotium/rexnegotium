package com.rexnegotium.repository;

import java.util.List;

import com.rexnegotium.model.Task;

/**
 * Интерфейс описывает поведение классов, которые реализуют этот интерфейс.
 * 
 * @author Ivan Senchukov
 *
 */
public interface TaskRepository {

	/**
	 * Возвращает все доступные объекты Task
	 * Если нет ни одного - возвращает пустой лист.
	 * 
	 * todo - после реализации аутентификации выводить все задачи одного пользователя
	 *  
	 * @return
	 */
	public List<Task> getAll();

}
