package com.example.backend.service;

import java.util.List;

import com.example.backend.entity.Students;

public interface StudentsService {

    Students createStudent(Students student);
    List<Students> getAllStudents();
    Students getStudentById(Long studentId);
    Students updateStudent(Students student);

    void deleteStudent(Long studentId);   
    
}