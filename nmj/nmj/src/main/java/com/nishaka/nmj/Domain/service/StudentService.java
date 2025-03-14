package com.nishaka.nmj.Domain.service;

import com.nishaka.nmj.Application.dto.StudentGeneralDto;
import com.nishaka.nmj.Domain.entity.Student;
import com.nishaka.nmj.External.repository.StudentRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    // Manually add the constructor
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public ResponseEntity<StudentGeneralDto> getStudent(Integer id) {
        StudentGeneralDto studentGeneralDto = new StudentGeneralDto();
        Optional<Student> optionalStudent = studentRepository.findById(id);

        if (optionalStudent.isPresent()) {
            Student student = optionalStudent.get();
            studentGeneralDto.setId(student.getId());
            studentGeneralDto.setName(student.getName());
            studentGeneralDto.setGrade(student.getGrade());
            return ResponseEntity.ok(studentGeneralDto);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}