package uk.ac.belfastmet.todolist.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import uk.ac.belfastmet.todolist.domain.ToDoList;



@Repository
public interface TaskRepository extends CrudRepository<ToDoList, Long> {

}
