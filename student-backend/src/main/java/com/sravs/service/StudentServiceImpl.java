package com.sravs.service;

import com.sravs.model.Student;
import com.sravs.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepo studentRepo;
    @Override
    public Student saveStudent(Student student) {
        return  studentRepo.save(student);
    }

    @Override
    public List<Student> getStudent() {
        return studentRepo.findAll();
    }
}
