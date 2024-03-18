package com.example.TejasRestAssignment.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.TejasRestAssignment.entity.Task;
import com.example.TejasRestAssignment.repository.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService {
	
	@Autowired
	private TaskRepository taskRepository;
	
	//to add task
	public Task addTask(Task task) {
		return taskRepository.save(task);
	}

}
