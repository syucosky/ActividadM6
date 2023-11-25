package com.example.academiaspring.Service;


import com.example.academiaspring.Entity.TaskEntity;
import java.util.List;
import java.util.Optional;


public interface TaskService {

    public void addTask(TaskEntity task);

    public Optional<TaskEntity> findById(int id);

    public List<TaskEntity> findAll();

    public void deleteById(int id);

}
