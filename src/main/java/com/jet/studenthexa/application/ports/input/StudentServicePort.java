package com.jet.studenthexa.application.ports.input;

import com.jet.studenthexa.domain.model.Student;

import java.util.List;

public interface StudentServicePort {
    Student findById(Long id);
    List<Student> findAll();
    Student save(Student student);
    Student update(Long id, Student student);
    void deleteById(Long id);
}
