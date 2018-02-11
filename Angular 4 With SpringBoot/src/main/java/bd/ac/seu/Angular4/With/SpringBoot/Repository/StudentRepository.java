package bd.ac.seu.Angular4.With.SpringBoot.Repository;

import bd.ac.seu.Angular4.With.SpringBoot.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends JpaRepository<Student, String> {
    public Student findByName(String name);
    public Student findByCgpaGreaterThan(double cgpa);
}
