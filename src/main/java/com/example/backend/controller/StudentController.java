package com.example.backend.controller;


import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.entity.Students;
import com.example.backend.service.StudentService;

@RestController
@RequestMapping("/api/v1/studentcontroller")
public class StudentController {

    private StudentService studentService;

    // build get user by id REST API
    @GetMapping("{id}")
    public ResponseEntity<Students> getStudentById(@PathVariable("id") Long studentId){
        
        Students student = studentService.getStudentById(studentId);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    // Build Get All Users REST API
    @GetMapping
    public ResponseEntity<List<Students>> getAllStudents(){

        List<Students> students = studentService.getAllStudents();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    // Build Update User REST API
    @PutMapping("{id}")
    public ResponseEntity<Students> updateStudent(@PathVariable("id") Long studentId,@RequestBody Students student){
        Students updated = studentService.updateStudent(student);
        return new ResponseEntity<>(updated, HttpStatus.OK);
    }

    // Build Delete User REST API
   // Delete operation
   @DeleteMapping("/departments/{id}")
   public String deleteStudent(@PathVariable("id")
                                      Long studentId)
   {
       studentService.deleteStudent(studentId);
       return "Deleted Successfully";
   }

}
