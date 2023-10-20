package com.example.backend.service;

import java.util.List;

import com.example.backend.entity.Teacher;

public interface TeacherService {
    Teacher createTeacher(Teacher teacher);

    List<Teacher> getAllTeachers();
    Teacher getTeacherById(Long teacherId);
    Teacher updateTeacher(Teacher teacher);

    void deleteTeacher(Long teacherId);   
}