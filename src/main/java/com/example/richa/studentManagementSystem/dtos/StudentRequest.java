package com.example.richa.studentManagementSystem.dtos;

import com.example.richa.studentManagementSystem.model.DEPARTMENT;
import com.example.richa.studentManagementSystem.model.Gender;
import com.example.richa.studentManagementSystem.model.Student;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentRequest {

    @NotBlank
    private String name;

    @NotNull
    private Long rollNumber;

    @NotBlank
    @Email
    private String email;

    @NotNull
    private Gender gender;


    private DEPARTMENT department;

    public Student to(){
        return Student.builder()
                .name(this.name)
                .email(this.email)
                .rollNumber(this.rollNumber)
                .gender(this.gender)
                .department(this.department)
                .build();
    }

}
