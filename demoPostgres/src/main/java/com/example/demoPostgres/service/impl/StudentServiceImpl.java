package com.example.demoPostgres.service.impl;

import com.example.demoPostgres.entity.Student;
import com.example.demoPostgres.repository.StudentRepository;
import com.example.demoPostgres.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student getStudent(int id) {
        Optional<Student> optionalStudent = studentRepository.findById(id);
        return (optionalStudent.isPresent())?optionalStudent.get():null;
    }

    @Override
    public List<Student> getStudentName(String firstName){
       List<Student> listOfStudents = studentRepository.findByFirstName(firstName);
        return listOfStudents.isEmpty()?null:listOfStudents;
    }

    @Override
    public List<Student> getStudentFirstAndLastName(String firstName , String lastName){
        List<Student> listOfStudents = studentRepository.findByFirstNameAndLastName(firstName,lastName);
        return listOfStudents.isEmpty()?null:listOfStudents;
    }

    @Override
    public int getStudentCount(String firstName){
        return studentRepository.countStudent(firstName);
    }

    @Override
    public Student saveStudent(Student student) {
        return  studentRepository.save(student);
    }

    @Override
    public void deleteStudent(int id) {
        studentRepository.deleteById(id);

    }
}
