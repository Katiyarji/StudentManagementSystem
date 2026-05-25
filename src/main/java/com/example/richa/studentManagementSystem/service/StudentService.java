package com.example.richa.studentManagementSystem.service;

import com.example.richa.studentManagementSystem.dtos.StudentRequest;
import com.example.richa.studentManagementSystem.dtos.StudentResponse;
import com.example.richa.studentManagementSystem.model.Student;
import com.example.richa.studentManagementSystem.repository.StudentRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public Integer createStudent(@Valid StudentRequest studentRequest) {

        Student student = studentRequest.to();
        student = this.studentRepository.save(student);

        return student.getId();
    }

    public StudentResponse getStudentByid(Integer studentId) {
        Student student = this.studentRepository.findById(studentId)
                .orElse(null);

        return student == null ? null : StudentResponse.from(student);
    }

    public List<StudentResponse> getAllStudents() {
        List<Student> students=this.studentRepository.findAll();
        return students.stream()
                .map(StudentResponse::from)
                .collect(Collectors.toList());
    }

    public void deleteStudentById(Integer studentId) {
        this.studentRepository.deleteById(studentId);
    }
}
