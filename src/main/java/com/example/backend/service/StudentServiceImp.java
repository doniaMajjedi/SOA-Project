package com.example.backend.service;

import java.util.Optional;
import java.util.List;
import com.example.backend.Repository.StudentRepository;
import com.example.backend.entity.Students;

public class StudentServiceImp implements StudentService {

    private StudentRepository studentRepository;

    @Override
    public List<Students> getAllStudents() {

            return (List<Students>)studentRepository.findAll();
    }

    @Override
    public Students getStudentById(Long studentId) {
        Optional<Students> optionalStudent = studentRepository.findById(studentId);
        return optionalStudent.get();
    }

    @Override
    public Students updateStudent(Students student) {
        Students t = studentRepository.findById(student.getId()).get();
        t.setNom(student.getNom());
        t.setPrenom(student.getPrenom());
        t.setDatedenaissance(student.getDatedenaissance());
        t.setAdr(student.getAdr());
        t.setVille(student.getVille());
        Students updatedstudent = studentRepository.save(t);
        return updatedstudent;
    }

    @Override
    public void deleteStudent(Long studentId) {
        studentRepository.deleteById(studentId);
    }
    
}