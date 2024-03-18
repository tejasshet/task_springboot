package com.example.TejasRestAssignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.TejasRestAssignment.entity.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {
    
      

}

