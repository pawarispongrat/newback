package sit.int210.studentproj.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sit.int210.studentproj.entities.Student;

public interface StudentRepository extends JpaRepository <Student, String>{
}
