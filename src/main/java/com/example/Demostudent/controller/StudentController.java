package com.example.Demostudent.controller;

import com.example.Demostudent.model.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class StudentController {

    @GetMapping(path = "/Students/{studentId}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Student> getStudent(@PathVariable long studentId)
    {
        Student std=new Student("Sanket","Mishra","Kalyan (E)");
        return new ResponseEntity<>(std, HttpStatus.OK);
    }
}
