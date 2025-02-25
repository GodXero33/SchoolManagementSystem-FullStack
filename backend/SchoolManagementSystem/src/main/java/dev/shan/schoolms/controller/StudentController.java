package dev.shan.schoolms.controller;

import dev.shan.schoolms.service.custom.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/api/student")
@RequiredArgsConstructor
public class StudentController {
	private final StudentService studentService;
}
