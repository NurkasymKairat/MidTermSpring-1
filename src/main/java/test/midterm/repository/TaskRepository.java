package test.midterm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import test.midterm.entity.TaskEntity;


@Repository
public interface TaskRepository extends JpaRepository<TaskEntity, Long> {
}
