package com.example.springbootrevision.revisespringboot.repository;

import com.example.springbootrevision.revisespringboot.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
}
