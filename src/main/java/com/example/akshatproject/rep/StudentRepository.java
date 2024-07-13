package com.example.akshatproject.rep;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.akshatproject.Student;

public interface StudentRepository extends MongoRepository<Student, String>{

}
