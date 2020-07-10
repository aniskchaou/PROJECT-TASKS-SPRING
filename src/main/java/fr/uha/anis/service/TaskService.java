package fr.uha.anis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.uha.anis.entities.Task;
import fr.uha.anis.repositories.TaskRepository;
@Service
public class TaskService {

	@Autowired
	TaskRepository  taskRepository;
	
	public Task saveOrUpdate(Task task)
	{
		if(task.getStatus()==null||task.getStatus().equals(""))
		{
			task.setStatus("TODO");
		}
		return taskRepository.save(task);
	}
	
	public Iterable<Task> findAll()
	{
		return taskRepository.findAll();
	}
	
	public Task findById(Long id)
	{
		return taskRepository.getById(id);
	}
	
	public void delete(Long id)
	{
		Task task=findById(id);
		taskRepository.delete(task);
	}
}
