package com.example.demoPostgres.service;

import com.example.demoPostgres.entity.Student;

import java.util.List;

public interface StudentService {

    Student getStudent(int id);
    Student saveStudent(Student student);
    List<Student> getStudentName(String firstName);
    List<Student> getStudentFirstAndLastName(String firstName, String lastName);
    int getStudentCount(String firstName);
    void deleteStudent(int id);

}
