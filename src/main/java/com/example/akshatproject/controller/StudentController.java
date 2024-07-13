package com.example.akshatproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping; // Missing import
import org.springframework.web.bind.annotation.PostMapping; // Correct import
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.akshatproject.Student;
import com.example.akshatproject.rep.StudentRepository;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/")
    public ResponseEntity<?> getStudents() { // Return type should be List<Student>
        return ResponseEntity.ok(this.studentRepository.findAll()); // Added semicolon
    }

    @PostMapping("/") // Fixed typo here
    public ResponseEntity<?> addStudent(@RequestBody Student student) {
        Student savedStudent = this.studentRepository.save(student);
        return ResponseEntity.ok(savedStudent);
    }
}
