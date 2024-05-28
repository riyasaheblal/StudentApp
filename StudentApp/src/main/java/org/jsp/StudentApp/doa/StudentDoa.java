package org.jsp.StudentApp.doa;

import java.util.Optional;

import org.jsp.StudentApp.Repository.StudentRepository;
import org.jsp.StudentApp.dto.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDoa {
	
	@Autowired
	private StudentRepository repository;
	
	public void studentSave(Student student) {
		repository.save(student);
	}

	
//	public Student findById(int id) {
//	//	repository.findById(id);
//		return repository.findById(id);
//	}
	
	
	public Optional<Student> findById(int id) {
		
		return repository.findById(id);
	}
	
	
	public Student update(Student student, int id) {
		student.setSid(id);
		return repository.save(student);
		
	}
	
	public void Delete( int id) {
		
		 repository.deleteById(id);
		
	}
}
