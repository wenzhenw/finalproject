package ca.sheridancollege.wenzh.services;

import java.util.List;
import java.util.Optional;

import ca.sheridancollege.wenzh.domain.Student;

public interface StudentService {
    List<Student> findAll();
    Optional<Student> findById(Long id);
    Optional<Student> findByName(String name);
    Student save(Student student);
}