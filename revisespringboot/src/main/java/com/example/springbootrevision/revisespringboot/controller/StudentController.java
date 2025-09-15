package com.example.springbootrevision.revisespringboot.controller;

import com.example.springbootrevision.revisespringboot.DTO.StudentDTO;
import com.example.springbootrevision.revisespringboot.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/student")
    public List<StudentDTO> getStudent() {
    return studentService.getAllStudent();
    }
    @GetMapping("/student/{id}")
    public StudentDTO getStudentById(@PathVariable Long id){
        return studentService.getStudentById(id);
    }
}
