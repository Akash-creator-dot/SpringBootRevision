//package com.example.springbootrevision.revisespringboot.service.implementations;
//
//import com.example.springbootrevision.revisespringboot.DTO.StudentDTO;
//import com.example.springbootrevision.revisespringboot.entity.Student;
//import com.example.springbootrevision.revisespringboot.repository.StudentRepository;
//import com.example.springbootrevision.revisespringboot.service.StudentService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//@RequiredArgsConstructor
//public class StudentServiceImplementations implements StudentService {
//    private final StudentRepository studentRepository;
//    @Override
//    public List<StudentDTO> getAllStudent() {
//        List<Student> students = studentRepository.findAll();
//        return students.stream().
//                map(student -> new StudentDTO(student.getId(), student.getName(),student.getEmail())).toList();
//    }
//
//    @Override
//    public StudentDTO getStudentById(Long id) {
//        Student student=studentRepository.findById(id).orElseThrow(()->new IllegalArgumentException("No Student found with id: "+id));;
//        return new StudentDTO(student.getId(), student.getName(), student.getEmail());
//    }
//}
