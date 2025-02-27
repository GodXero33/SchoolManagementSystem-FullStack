package dev.shan.schoolms.controller;

import dev.shan.schoolms.dto.Student;
import dev.shan.schoolms.response.StudentResponse;
import dev.shan.schoolms.service.custom.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/api/student")
@RequiredArgsConstructor
public class StudentController {
	private final StudentService studentService;

	@GetMapping("/get-all")
	public ResponseEntity<Map<String, Object>> getAll () {
		return StudentResponse.getAllStudents(true, this.studentService.getAll());
	}
}
