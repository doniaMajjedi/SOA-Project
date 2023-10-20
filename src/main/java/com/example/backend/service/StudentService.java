package com.example.backend.service;

import java.util.List;

import com.example.backend.entity.Students;

public interface StudentService {


    List<Students> getAllStudents();
    Students getStudentById(Long studentId);
    Students updateStudent(Students student);
    void deleteStudent(Long studentId); 
}