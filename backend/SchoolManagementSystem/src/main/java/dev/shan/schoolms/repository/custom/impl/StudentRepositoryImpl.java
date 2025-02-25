package dev.shan.schoolms.repository.custom.impl;

import dev.shan.schoolms.entity.StudentEntity;
import dev.shan.schoolms.repository.custom.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepositoryImpl implements StudentRepository {
	@Override
	public StudentEntity add (StudentEntity entity) {
		return null;
	}

	@Override
	public StudentEntity update (StudentEntity entity) {
		return null;
	}

	@Override
	public boolean delete (StudentEntity entity) {
		return false;
	}

	@Override
	public boolean delete (Integer id) {
		return false;
	}

	@Override
	public StudentEntity find (Integer id) {
		return null;
	}

	@Override
	public List<StudentEntity> findAll () {
		return List.of();
	}

	@Override
	public List<StudentEntity> findByFieldName (String fieldName, Object findValue) {
		return List.of();
	}
}
