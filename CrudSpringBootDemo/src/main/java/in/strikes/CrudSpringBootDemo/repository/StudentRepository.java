package in.strikes.CrudSpringBootDemo.repository;

import in.strikes.CrudSpringBootDemo.entity.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentRepository {
    public Student saveStudent(Student student){
        System.out.println("Inside repo");
        Student s1 = new Student();
        s1.setName("Saurabh");
        s1.setAge(3);
        s1.setEmail("dbjlbad7qwdb");
        s1.setRollNo(273678);
        s1.setSubject("DSA");
        return s1;
    }
}
