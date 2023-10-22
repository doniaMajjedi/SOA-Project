package com.example.backend.service;

import java.util.Optional;
import java.util.List;

import com.example.backend.Repository.StudentRepository;
import com.example.backend.entity.Students;

public class StudentsServiceImp implements StudentsService{
     private StudentRepository studentRepository;

    @Override
    public Students createStudent(Students student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Students> getAllStudents() {

            return (List<Students>)studentRepository.findAll();
    }

    @Override
    public Students getStudentById(Long studentId) {
        Optional <Students> optionalUser = studentRepository.findById(studentId);
        return optionalUser.get();
    }

    @Override
    public Students updateStudent(Students student) {
        Students s = studentRepository.findById(student.getId()).get();
        s.setNom(student.getNom());
        s.setPrenom(student.getPrenom());
        s.setDatedenaissance(student.getDatedenaissance());
        s.setAdr(student.getAdr());
        s.setVille(student.getVille());
        Students updatedStudent = studentRepository.save(s);
        return updatedStudent;
    }

    @Override
    public void deleteStudent(Long studentId) {
        studentRepository.deleteById(studentId);
    }

}