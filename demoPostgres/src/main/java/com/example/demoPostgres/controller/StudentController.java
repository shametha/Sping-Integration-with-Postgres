package com.example.demoPostgres.controller;
import com.example.demoPostgres.entity.Student;

import com.example.demoPostgres.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/student") // gives the linkas http://localhost::8800/student
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping(value = "/{id}")
    public Student getStudent(@PathVariable("id") int id) {
        return studentService.getStudent(id);
    }

    @GetMapping(value = "/first/{firstName}")
    public List<Student> getStudentName(@PathVariable("firstName") String firstName) {
        return studentService.getStudentName(firstName);
    }

    @GetMapping(value = "/firstNameCount/{firstName}")
    public int getStudentCount(@PathVariable("firstName") String firstName) {
        return studentService.getStudentCount(firstName);
    }

    @GetMapping(value = "/firstAndLastName/{firstName}/{lastName}")
    public List<Student> getStudentFirstAndLastName(@PathVariable("firstName") String firstName , @PathVariable("lastName") String lastName) {
        return studentService.getStudentFirstAndLastName(firstName,lastName);
    }

    @PostMapping
    public Student saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @DeleteMapping
    public void deleteStudent(@PathVariable("id") int id) { // path variable will map the id coming from the request header and pass to the parameter
        studentService.deleteStudent(id);

    }
}
