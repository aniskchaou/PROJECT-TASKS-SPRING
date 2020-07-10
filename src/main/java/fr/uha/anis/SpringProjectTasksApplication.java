package fr.uha.anis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import fr.uha.anis.entities.Task;
import fr.uha.anis.repositories.TaskRepository;
import fr.uha.anis.service.TaskService;

@SpringBootApplication
public class SpringProjectTasksApplication {

	@Autowired
	TaskService taskService;
	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringProjectTasksApplication.class, args);
		TaskRepository taskDAO =  ctx.getBean(TaskRepository.class);
		taskDAO.save(new Task("task 1", "task 1", "TO_DO"));
		taskDAO.save(new Task("task 2", "task 2", "TO_DO"));
		taskDAO.save(new Task("task 3", "task 3", "TO_DO"));
		taskDAO.save(new Task("task 4", "task 4", "TO_DO"));
		taskDAO.save(new Task("task 5", "task 5", "IN_PROGRESS"));
		taskDAO.save(new Task("task 6", "task 6", "DONE"));
		
	}

}
