package com.example.backend.service;

import java.util.List;

import com.example.backend.entity.Students;

public interface StudentService {

    Students createStudent(Students student);

    List<Students> getAllStudents();
    Students getStudentById(Long studentId);
    Students updateStudent(Long id,Students student);
    void deleteStudent(Long studentId);
}