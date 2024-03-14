package com.springdemo.demo.rest;

import com.springdemo.demo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    // define endpoint for "/students" - return a list of students
    @GetMapping("/students")
    public List<Student> getStudents() {
        List<Student> theStudents = new ArrayList<>();
        theStudents.add(new Student("Quang", "Nguyen"));
        theStudents.add(new Student("Mama", "wdwd"));
        theStudents.add(new Student("rtr", "wdwd"));

        return theStudents;
    }
}
