package com.nishaka.nmj.Application.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/list")
    public String getStudent() {
        return "Student List";
    }

    @PostMapping("/add")
    public String addStudent(){
        return "Student Added";
    }
}
