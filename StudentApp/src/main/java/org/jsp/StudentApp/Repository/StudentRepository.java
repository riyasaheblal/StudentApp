package org.jsp.StudentApp.Repository;

import org.jsp.StudentApp.dto.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student, Integer> {
 // Student findById(int id);
}
