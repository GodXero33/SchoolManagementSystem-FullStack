package dev.shan.schoolms.service.custom.impl;

import dev.shan.schoolms.dto.Student;
import dev.shan.schoolms.entity.StudentEntity;
import dev.shan.schoolms.repository.custom.StudentRepository;
import dev.shan.schoolms.service.custom.StudentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Primary
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
	private final StudentRepository studentRepository;
	private final ModelMapper modelMapper;

	@Override
	public List<Student> getAll () {
		final List<StudentEntity> studentEntityList = this.studentRepository.findAll();
		final List<Student> studentList = new ArrayList<>();

		studentEntityList.forEach(studentEntity -> studentList.add(this.modelMapper.map(studentEntity, Student.class)));

		return studentList;
	}
}
