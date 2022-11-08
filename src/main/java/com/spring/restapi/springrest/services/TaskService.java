package com.spring.restapi.springrest.services;

import java.util.List;

import com.spring.restapi.springrest.entities.Tasks;

public interface TaskService {
	
	public List<Tasks> displayList();
	
	public void addTask(Tasks task);
	
	public Tasks displayTask(long taskId);

	public void updateTask(Tasks task);
	
	public void deleteTask(long taskId);

}
