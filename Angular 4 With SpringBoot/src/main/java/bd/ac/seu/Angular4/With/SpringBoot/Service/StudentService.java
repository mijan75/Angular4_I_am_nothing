package bd.ac.seu.Angular4.With.SpringBoot.Service;

import bd.ac.seu.Angular4.With.SpringBoot.Controller.StudentController;
import bd.ac.seu.Angular4.With.SpringBoot.Model.Student;
import bd.ac.seu.Angular4.With.SpringBoot.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;


    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    public Student getStudent(String id) {
        return this.studentRepository.findOne(id);
    }

    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

    public void deleteStudent(String id) {
        studentRepository.delete(id);
    }

    public void updateStudent(Student student) {
        studentRepository.save(student);
    }
}
