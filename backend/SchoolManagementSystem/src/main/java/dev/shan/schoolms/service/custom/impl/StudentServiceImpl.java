package dev.shan.schoolms.service.custom.impl;

import dev.shan.schoolms.repository.custom.StudentRepository;
import dev.shan.schoolms.service.custom.StudentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
	private final StudentRepository studentRepository;
	private final ModelMapper modelMapper;
}
