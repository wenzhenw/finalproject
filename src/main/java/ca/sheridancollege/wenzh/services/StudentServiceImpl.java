package ca.sheridancollege.wenzh.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ca.sheridancollege.wenzh.domain.Student;
import ca.sheridancollege.wenzh.repositories.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> findById(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public Optional<Student> findByName(String name) {
        return studentRepository.findByName(name);
    }

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }
}