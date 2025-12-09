package ca.sheridancollege.wenzh.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ca.sheridancollege.wenzh.domain.Student;
import ca.sheridancollege.wenzh.services.StudentService;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping(value = {"", "/"})
    public List<Student> getAllStudents() {
        return studentService.findAll();
    }

    @PostMapping(value = {"", "/"})
    public Student saveStudent(@RequestBody Student student) {
        return studentService.save(student);
    }
}