package dev.shan.schoolms.repository.custom.impl;

import dev.shan.schoolms.entity.StudentEntity;
import dev.shan.schoolms.repository.custom.StudentRepository;
import dev.shan.schoolms.util.CrudUtil;
import dev.shan.schoolms.util.enumaration.student.StudentBloodGroup;
import dev.shan.schoolms.util.enumaration.student.StudentGender;
import dev.shan.schoolms.util.enumaration.student.StudentMedium;
import dev.shan.schoolms.util.enumaration.student.StudentStatus;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
		final List<StudentEntity> studentEntityList = new ArrayList<>();

		try {
			final ResultSet resultSet = CrudUtil.execute("SELECT id, full_name, date_of_birth, gender, nationality, religion, birth_certificate_no, admission_no, admission_date, address, grade, class_name, current_status, medium_of_study, blood_group FROM student");

			while (resultSet.next()) studentEntityList.add(StudentEntity.builder().
				id(resultSet.getInt(1)).
				fullName(resultSet.getString(2)).
				dateOfBirth(resultSet.getString(3)).
				gender(StudentGender.parseStudentGender(resultSet.getString(4))).
				nationality(resultSet.getString(5)).
				religion(resultSet.getString(6)).
				birthCertificateNo(resultSet.getString(7)).
				admissionNo(resultSet.getString(8)).
				admissionDate(resultSet.getString(9)).
				address(resultSet.getString(10)).
				grade(resultSet.getString(11)).
				className(resultSet.getString(12)).
				currentStatus(StudentStatus.parseStudentStatus(resultSet.getString(13))).
				mediumOfStudy(StudentMedium.parseStudentMedium(resultSet.getString(14))).
				bloodGroup(StudentBloodGroup.parseStudentBloodGroup(resultSet.getString(15))).
				build());
		} catch (SQLException exception) {
			System.out.println(exception.getMessage());
		}

		return studentEntityList;
	}

	@Override
	public List<StudentEntity> findByFieldName (String fieldName, Object findValue) {
		return List.of();
	}
}
