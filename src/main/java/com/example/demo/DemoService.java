package com.example.demoapplication;

import java.util.List;

public interface DemoService {
    Long addStudent(Student student);
    List<Student> getAllStudentsByUniversity(String university);
    Student getStudentById(Long id);
}
