package com.kabarak.clearance.controller;

import com.kabarak.clearance.repository.department.CourseRepository;
import com.kabarak.clearance.model.department.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value="/api/course")
public class CourseController {
    @Autowired
    CourseRepository courseRepository;
//
//    @PostMapping("/save")
//    public Object  saveOrUpdate (@Valid @RequestBody SaveStudentRequest saveStudentRequest){
//        return studentService.saveOrUpdate(saveStudentRequest);
//    }
//    @GetMapping("/findbyid/{id}")
//    public Object findById (@PathVariable Long id){
//        return studentService.findById(id);
//    }
    @GetMapping("/list")
    public List<Course> findAll(){
        return courseRepository.findAll();
    }
//    @DeleteMapping("/deletebyid/{id}")
//    public GeneralResponse deleteById(@PathVariable Long id){
//        return  studentService.deleteById(id);
//    }
}


