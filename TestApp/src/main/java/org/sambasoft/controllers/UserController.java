package org.sambasoft.controllers;

import java.util.List;

import org.sambasoft.entities.Student;
import org.sambasoft.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="http://localhost:4200", allowedHeaders="*")
public class UserController {
	@Autowired
    private UserRepository userRepository;

	@GetMapping("/student")
	public List<Student> getStudents() {
		return userRepository.findAll();
	}

	@GetMapping("/student/{id}")
	public Student getStudent(@PathVariable Long id) {
		return userRepository.findOne(id);
	}

	@DeleteMapping("/student/{id}")
	public boolean deleteStudent(@PathVariable Long id) {
		userRepository.delete(id);
		return true;
	}

	@PutMapping("/student")
	public Student updateStudent(@RequestBody Student user) {
		return userRepository.save(user);
	}

	@PostMapping("/student")
	public Student createStudent(@RequestBody Student user) {
		return userRepository.save(user);
	}

}
