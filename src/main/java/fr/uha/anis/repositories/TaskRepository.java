package fr.uha.anis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.uha.anis.entities.Task;
@Repository
public interface TaskRepository extends CrudRepository<Task, Long>{
Task getById(Long id);
}
