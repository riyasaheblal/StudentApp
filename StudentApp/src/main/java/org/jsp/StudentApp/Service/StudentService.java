package org.jsp.StudentApp.Service;

import java.util.Optional;

import org.jsp.StudentApp.doa.StudentDoa;
import org.jsp.StudentApp.dto.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService  {

	
	@Autowired
	private StudentDoa doa;
	
	public void studentSave(Student student) {
		doa.studentSave(student);
	}
	
//	public Student findById(int id) {
//		return doa.findById(id);
//	}
	
	
	public Optional<Student> findById(int id) {
		return doa.findById(id);
	}
	
	public Student updatebyId(Student student, int id) {
		return doa.update(student, id);
	}
	
	public void delete(int id) {
		doa.Delete(id);
	}
}
