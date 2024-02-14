package com.sravs.controller;

import com.sravs.model.Student;
import com.sravs.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("student")
public class StudentController {
    @Autowired
    StudentServiceImpl studentService;

    @PostMapping("add")
    public String add(@RequestBody Student student) {
        studentService.saveStudent(student);
        return "New Student Added";
    }

    @GetMapping("getAll")
    public List<Student> getStudent() {
        return studentService.getStudent();

    }

}
