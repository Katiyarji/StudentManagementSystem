package com.example.richa.studentManagementSystem.controller;

import com.example.richa.studentManagementSystem.dtos.StudentRequest;
import com.example.richa.studentManagementSystem.dtos.StudentResponse;
import com.example.richa.studentManagementSystem.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    StudentService studentService;

    //    Creating Student
    @PostMapping
    public Integer createStudent(@Valid @RequestBody StudentRequest studentRequest) {

        return this.studentService.createStudent(studentRequest);
    }

    //    Fetching student By Id
    @GetMapping("/{id}")
    public StudentResponse getStudentByid(@PathVariable("id") Integer studentId) {

        return this.studentService.getStudentByid(studentId);
    }

    //   Fetching all students
    @GetMapping
    public List<StudentResponse> getAllStudents(){
        return this.studentService.getAllStudents();
    }
    //    Deleting Student By Id
    @DeleteMapping("/{id}")
    public void deleteStudentById(@PathVariable("id") Integer studentId){
         this.studentService.deleteStudentById(studentId);
    }
}
