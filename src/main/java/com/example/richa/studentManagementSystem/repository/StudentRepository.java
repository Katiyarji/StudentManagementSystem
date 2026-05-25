package com.example.richa.studentManagementSystem.repository;

import com.example.richa.studentManagementSystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
