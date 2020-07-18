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
		taskDAO.save(new Task("Go shopping", "Go shopping", "TO_DO"));
		taskDAO.save(new Task("Work", "Work", "IN_PROGRESS"));
		taskDAO.save(new Task("Play the guitar", "Play the guitar", "DONE"));
		
	}

}
