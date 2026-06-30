package in.strikes.CrudSpringBootDemo.controller;

import in.strikes.CrudSpringBootDemo.entity.Student;
import in.strikes.CrudSpringBootDemo.service.StudentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/create")
    public Student createStudent(@RequestBody Student studentBody){
        System.out.println("Inside controller");
        Student student = studentService.createStudent(studentBody);
        System.out.println("Exiting controller");
        return student;
    }
}
