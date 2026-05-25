package com.example.richa.studentManagementSystem.dtos;

import com.example.richa.studentManagementSystem.model.DEPARTMENT;
import com.example.richa.studentManagementSystem.model.Gender;
import com.example.richa.studentManagementSystem.model.Student;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentResponse {

    private Integer id;

    private String name;

    private Long rollNumber;

    private String email;

    private Gender gender;

    private DEPARTMENT department;

    private Date createdOn;

    private Date updatedOn;

    public static StudentResponse from(Student student) {
        return StudentResponse.builder()
                .id(student.getId())
                .name(student.getName())
                .rollNumber(student.getRollNumber())
                .email(student.getEmail())
                .gender(student.getGender())
                .department(student.getDepartment())
                .createdOn(student.getCreatedOn())
                .updatedOn(student.getUpdatedOn())
                .build();
    }
}
