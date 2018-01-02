package bd.ac.seu.Angular4.With.SpringBoot.Controller;

import bd.ac.seu.Angular4.With.SpringBoot.Model.Student;
import bd.ac.seu.Angular4.With.SpringBoot.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "/students")
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping()
    public void saveStudent(@RequestBody Student student){
        studentService.saveStudent(student);
    }

    @PutMapping()
    public void updateStudent(@RequestBody Student student){
        studentService.updateStudent(student);
    }

    @GetMapping()
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }


    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable("id") String id){
        studentService.deleteStudent(id);
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable("id") String id){
        return studentService.getStudent(id);
    }


}
