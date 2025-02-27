package dev.shan.schoolms.entity;

import dev.shan.schoolms.util.enumaration.student.StudentBloodGroup;
import dev.shan.schoolms.util.enumaration.student.StudentGender;
import dev.shan.schoolms.util.enumaration.student.StudentMedium;
import dev.shan.schoolms.util.enumaration.student.StudentStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class StudentEntity {
	private Integer id;
	private String fullName;
	private String dateOfBirth;
	private StudentGender gender;
	private String nationality;
	private String religion;
	private String birthCertificateNo;
	private String admissionNo;
	private String admissionDate;
	private String address;
	private String grade;
	private String className;
	private StudentStatus currentStatus;
	private StudentMedium mediumOfStudy;
	private StudentBloodGroup bloodGroup;
}
