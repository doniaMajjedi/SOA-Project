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

import com.example.backend.entity.Teacher;
import com.example.backend.service.TeacherService;

@RestController
@RequestMapping("/api/v1/teachercontroller")
public class TeacherController {

    private TeacherService teacherService;

    // build get user by id REST API
    @GetMapping("{id}")
    public ResponseEntity<Teacher> getTeacherById(@PathVariable("id") Long teacherId){
        
        Teacher teacher = teacherService.getTeacherById(teacherId);
        return new ResponseEntity<>(teacher, HttpStatus.OK);
    }

    // Build Get All Users REST API
    @GetMapping
    public ResponseEntity<List<Teacher>> getAllTeachers(){

        List<Teacher> teachers = teacherService.getAllTeachers();
        return new ResponseEntity<>(teachers, HttpStatus.OK);
    }

    // Build Update User REST API
    @PutMapping("{id}")
    public ResponseEntity<Teacher> updateTeacher(@PathVariable("id") Long teacherId,@RequestBody Teacher teacher){
        Teacher updatedteacher = teacherService.updateTeacher(teacher);
        return new ResponseEntity<>(updatedteacher, HttpStatus.OK);
    }

    // Build Delete User REST API
   // Delete operation
   @DeleteMapping("/departments/{id}")
   public String deleteTeacher(@PathVariable("id")
                                      Long teacherId)
   {
       teacherService.deleteTeacher(teacherId);
       return "Deleted Successfully";
   }

}
