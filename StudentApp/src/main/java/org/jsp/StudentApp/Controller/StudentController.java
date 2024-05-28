package org.jsp.StudentApp.Controller;

import java.util.Optional;

import org.jsp.StudentApp.Service.StudentService;
import org.jsp.StudentApp.dto.Student;
import org.jsp.StudentApp.exception.IdNotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@Autowired
	private StudentService service;


	//	@PostMapping("/student/save")
	//	public void userSave(@RequestBody Student student) {
	//		service.studentSave(student);
	//	}


	//	@GetMapping("/student/find/id")
	//	public void findById(@RequestParam int id) {
	//		service.findById(id);
	//	}

	//	@GetMapping("/student/find/{id}")
	//	public Student findId(@PathVariable int id) {
	//		return service.findById(id);
	//	}

	@GetMapping("/student/find/{id}")
	public Optional<Student> findId(@PathVariable int id) throws IdNotFound {
		Optional<Student> opt = service.findById(id);
		if(opt.isEmpty()) {
			throw new IdNotFound();
		//	return null;
		}else {
			return opt;
		}}
		
		
		@PutMapping("/student/update/{id}")
		public Student updateId(@RequestBody Student Student, @PathVariable int id) {
			return service.updatebyId(Student, id);
		}
	
		@DeleteMapping("/student/update/{id}")
		public void delete( @PathVariable int id) {
			 service.delete(id);
		}
}
