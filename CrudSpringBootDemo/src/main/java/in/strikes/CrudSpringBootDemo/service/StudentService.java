package in.strikes.CrudSpringBootDemo.service;

import in.strikes.CrudSpringBootDemo.entity.Student;
import in.strikes.CrudSpringBootDemo.repository.StudentRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student studentReq){
        // business logic
        // store data
        System.out.println("Inside service");
        Student studentRes = studentRepository.saveStudent(studentReq);
        System.out.println("Exiting service");
        return studentRes;
    }

    // 1. End point listen (/app/student POST)

    // 2. Business logic

    // 3. Interact with DB to store data

    // 4.
}
