package com.spring.restapi.springrest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.restapi.springrest.entities.Tasks;
import com.spring.restapi.springrest.services.TaskService;

@RestController
public class Controllers {
	
	@Autowired
	private TaskService interfaceObj;
	
	@GetMapping("/tasks")
	public List<Tasks> displayTasks()
	{
		return this.interfaceObj.displayList();
	}
	
	@GetMapping("/tasks/{taskId}")
	public Tasks displayTask(@PathVariable long taskId)
	{
		return this.interfaceObj.displayTask(taskId);
	}
	
	@PostMapping(path = "/tasks")
	public String addTask(@RequestBody Tasks task)
	{
		this.interfaceObj.addTask(task);
		return "Task added succesfully";
	}
	
	@PutMapping(path = "/tasks")
	public String updateTask(@RequestBody Tasks task)
	{
		this.interfaceObj.updateTask(task);
		return "Task Updated";
	}
	
	@DeleteMapping(path = "/tasks/{taskId}")
	public String deleteTask(@PathVariable long taskId)
	{
		this.interfaceObj.deleteTask(taskId);
		return "Task Deleted";
	}
	

}
