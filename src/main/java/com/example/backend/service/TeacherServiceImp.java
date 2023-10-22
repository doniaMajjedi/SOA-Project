package com.example.backend.service;

import java.util.List;
import java.util.Optional;

import com.example.backend.Repository.TeacherRepository;
import com.example.backend.entity.Teacher;

public class TeacherServiceImp implements TeacherService {

    private TeacherRepository teacherRepository;

    @Override
    public Teacher createTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    @Override
    public List<Teacher> getAllTeachers() {

            return (List<Teacher>)teacherRepository.findAll();
    }

    @Override
    public Teacher getTeacherById(Long teacherId) {
        Optional<Teacher> optionalUser = teacherRepository.findById(teacherId);
        return optionalUser.get();
    }

    @Override
    public Teacher updateTeacher(Teacher teacher) {
        Teacher t = teacherRepository.findById(teacher.getId()).get();
        t.setNom(teacher.getNom());
        t.setPrenom(teacher.getPrenom());
        t.setDatedenaissance(teacher.getDatedenaissance());
        t.setAdr(teacher.getAdr());
        t.setVille(teacher.getVille());
        Teacher updatedUser = teacherRepository.save(t);
        return updatedUser;
    }

    @Override
    public void deleteTeacher(Long teacherId) {
        teacherRepository.deleteById(teacherId);
    }
    
}