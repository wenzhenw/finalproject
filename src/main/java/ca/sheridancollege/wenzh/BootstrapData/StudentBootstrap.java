package ca.sheridancollege.wenzh.BootstrapData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ca.sheridancollege.wenzh.domain.Student;
import ca.sheridancollege.wenzh.services.StudentService;

@Component
public class StudentBootstrap implements CommandLineRunner {

    @Autowired
    private StudentService studentService;

    @Override
    public void run(String... args) throws Exception {
        Student s1 = new Student("Sally", 21, 12345, "Trafalgar", 3);
        Student s2 = new Student("Jaspreet", 20, 13857, "Davis", 2);
        Student s3 = new Student("Xiao", 22, 46483, "HMC", 4);
        studentService.save(s1);
        studentService.save(s2);
        studentService.save(s3);
    }
}