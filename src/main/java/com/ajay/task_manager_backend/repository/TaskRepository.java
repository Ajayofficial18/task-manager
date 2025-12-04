package com.ajay.task_manager_backend.repository;

import com.ajay.task_manager_backend.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> {
}
