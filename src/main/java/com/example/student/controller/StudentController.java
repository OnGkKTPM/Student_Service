package com.example.student.controller;

import com.example.student.VO.ResponseTempleteVO;
import com.example.student.entity.Student;
import com.example.student.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("students")
public class StudentController {
    @Autowired
    private StudentServiceImpl studentService;

    @PostMapping("/")
    public Student saveStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    @GetMapping("/{id}")
    public ResponseTempleteVO getStudentWithDepartment(@PathVariable("id") Long id){
        return studentService.getStudentWithDepartment(id);
    }
}
