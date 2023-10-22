package com.example.backend.controller;


import java.util.List;

import com.example.backend.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.backend.entity.Students;
import com.example.backend.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping()
    public ResponseEntity<Students> createStudent(@RequestBody Students student){

        Students s= studentService.createStudent(student);
        return new ResponseEntity<>(s, HttpStatus.OK);
    }
    // build get user by id REST API
    @GetMapping("/{id}")
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
    @PutMapping("/{id}")
    public ResponseEntity<Students> updateStudent(@PathVariable("id") Long studentId,@RequestBody Students student){
        Students updated = studentService.updateStudent(studentId,student);
        return new ResponseEntity<>(updated, HttpStatus.OK);
    }

    // Build Delete User REST API
   // Delete operation
   @DeleteMapping("/{id}")
   public String deleteStudent(@PathVariable("id") Long studentId)
   {
       studentService.deleteStudent(studentId);
       return "Deleted Successfully";
   }

}
