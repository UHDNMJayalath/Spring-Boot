package com.nishaka.nmj.Application.controllers;

import com.nishaka.nmj.Domain.entity.Student;
import com.nishaka.nmj.External.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
@AllArgsConstructor
public class StudentController {

    private final StudentRepository studentRepository;
    @GetMapping("/list")
    public List<Student> getStudent() {
        return studentRepository.findAll();

    }

    @PostMapping("/add")
    public String addStudent(){
        return "Student Added";
    }
}
