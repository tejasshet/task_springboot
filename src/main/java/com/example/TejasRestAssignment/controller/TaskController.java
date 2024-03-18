package com.example.TejasRestAssignment.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.TejasRestAssignment.entity.Task;
import com.example.TejasRestAssignment.service.TaskService;

@RestController
@RequestMapping("/tasks")
public class TaskController {

	@Autowired
	private TaskService taskService;
	
	//constructor
	@Autowired
	public TaskController(TaskService taskService) {
		this.taskService = taskService;
	}
	
    @PostMapping(name = "/addtask")
    public Task addTask(@RequestBody Task task) {
    	return taskService.addTask(task);
    }
}
