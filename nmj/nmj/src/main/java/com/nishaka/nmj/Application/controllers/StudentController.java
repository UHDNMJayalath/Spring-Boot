package com.nishaka.nmj.Application.controllers;

import com.nishaka.nmj.Application.dto.StudentGeneralDto;
import com.nishaka.nmj.Domain.service.StudentService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
@AllArgsConstructor
@Data
public class StudentController {

    private StudentService studentService;

    @GetMapping("/getStudent")
    public ResponseEntity<StudentGeneralDto> getStudent(@RequestParam Integer id) {
        return studentService.getStudent(id);
    }

}
