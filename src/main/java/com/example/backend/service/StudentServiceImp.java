package com.example.backend.service;

import java.util.Optional;
import java.util.List;
import com.example.backend.Repository.StudentRepository;
import com.example.backend.entity.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImp implements StudentService {
    @Autowired

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
        Optional<Students> optionalStudent = studentRepository.findById(studentId);
        return optionalStudent.get();
    }

    @Override
    public Students updateStudent(Long id,Students student) {
        Optional<Students> ot = studentRepository.findById(id);
        if(ot.isPresent()){
            Students t=ot.get();
            t.setId(id);
            t.setNom(student.getNom());
            t.setPrenom(student.getPrenom());
            t.setDatedenaissance(student.getDatedenaissance());
            t.setAdr(student.getAdr());
            t.setVille(student.getVille());
            Students updatedstudent = studentRepository.save(t);
            return updatedstudent;
        }
        return null;
    }

    @Override
    public void deleteStudent(Long studentId) {
        studentRepository.deleteById(studentId);
    }
    
}