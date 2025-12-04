package com.ajay.task_manager_backend.service;

import com.ajay.task_manager_backend.entity.Task;
import java.util.List;

public interface TaskService {
    Task createTask(Task task);
    List<Task> getAllTasks();
    void deleteTask(Long id);
}
