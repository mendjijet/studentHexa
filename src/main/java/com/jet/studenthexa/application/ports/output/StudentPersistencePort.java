package com.jet.studenthexa.application.ports.output;

import com.jet.studenthexa.domain.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentPersistencePort {
    Optional<Student> findById(Long id);
    List<Student> findAll();
    Student save(Student student);
    void deleteById(Long id);
}
