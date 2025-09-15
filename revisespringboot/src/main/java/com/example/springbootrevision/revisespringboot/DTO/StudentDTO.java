package com.example.springbootrevision.revisespringboot.DTO;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StudentDTO {
    private long id;
    private String name;
    private String email;
}
