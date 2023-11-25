package com.example.academiaspring.Service.ServiceImp;

import com.example.academiaspring.Entity.TaskEntity;
import com.example.academiaspring.Repository.TaskRepository;
import com.example.academiaspring.Service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImp implements TaskService {

    @Autowired
    TaskRepository repository;

    @Override
    public void addTask(TaskEntity task) {

        repository.save(task);
    }

    @Override
    public Optional<TaskEntity> findById(int id) {
        return repository.findById(id);
    }

    @Override
    public List<TaskEntity> findAll() {
        return repository.findAll();
    }

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }
}
