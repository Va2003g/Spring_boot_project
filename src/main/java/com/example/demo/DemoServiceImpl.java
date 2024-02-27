package com.example.demoapplication;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {
    private List<Student> students = new ArrayList<>();
    private Long idCounter = 1L;

    @Override
    public Long addStudent(Student student) {
        student.setId(idCounter++);
        students.add(student);
        return student.getId();
    }

    @Override
    public List<Student> getAllStudentsByUniversity(String university) {
        List<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getUniversity().equals(university)) {
                result.add(student);
            }
        }
        return result;
    }

    @Override
    public Student getStudentById(Long id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }
}
