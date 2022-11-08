package com.spring.restapi.springrest.services;

//import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.restapi.springrest.dao.TaskDao;
import com.spring.restapi.springrest.entities.Tasks;

@Service
public class TaskServiceImpl implements TaskService {

	@Autowired
	private TaskDao taskDao;
	
	//List<Tasks> list;
	
//	public TaskServiceImpl()
//	{
//		list = new ArrayList<>();
//		list.add(new Tasks(6546,"Getting Dairy"));
//		list.add(new Tasks(5455,"Watering the plants"));
//		list.add(new Tasks(3232, "Buying Vegetables"));
//	}
	
	@Override
	public List<Tasks> displayList() {
		
//		return list;
		return taskDao.findAll();
	}
	
	public void addTask(Tasks task)
	{
//		list.add(task);
		taskDao.save(task);
	}
	
	public Tasks displayTask(long taskId)
	{
//		Tasks t = null;	
//		for(int i=0;i<list.size();i++)
//		{
//			if(list.get(i).getId()== taskId)
//				t = list.get(i);
//		}
//		return t;
		
		Tasks t1 = taskDao.getById(taskId);
		return t1;
	}
	
	public void updateTask(Tasks task)
	{
//		int ind = (int)task.getId();
//		for(int i=0;i<list.size();i++)
//		{
//			if(list.get(i).getId()==ind)
//				list.get(i).setTaskName(task.getTaskName());
//		}
		taskDao.save(task);
	}
	
	public void deleteTask(long taskId) 
	{
//		for(int i=0;i<list.size();i++)
//		{
//			if(list.get(i).getId()==taskId)
//			{
//				list.remove(i);
//			}
//				
//		}
		Tasks t1 = taskDao.getById(taskId);
		taskDao.delete(t1);
	}

}
