package com.nishaka.nmj.Application.controllers;

import com.nishaka.nmj.Domain.entity.Student;
import com.nishaka.nmj.External.repository.StudentRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
@AllArgsConstructor
@Data
@Getter
@Setter
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/list")
    public Student getStudent() {
        Optional<Student> student=studentRepository.findById(2001);
        if (student.isPresent()){
            return student.get();
        }else{
            return new Student();
        }

    }

    @PostMapping("/add")
    public String addStudent(){
        return "Student Added";
    }
}
