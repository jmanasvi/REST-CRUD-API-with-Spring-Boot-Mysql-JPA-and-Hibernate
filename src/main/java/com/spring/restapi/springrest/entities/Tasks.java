package com.spring.restapi.springrest.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Tasks {

	@Id
	private long id;
	private String taskName;

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public Tasks(long id, String taskName) {
		super();
		this.id = id;
		this.taskName = taskName;
	}
	
	public Tasks()
	{
	}
	
}
