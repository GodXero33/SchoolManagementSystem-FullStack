package dev.shan.schoolms.response;

import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class StudentResponse {
	private static final String GET_ALL_STUDENTS_OK = "All students have been added.";
	private static final String GET_ALL_STUDENTS_FAILED = "Can't get all students.";

	private StudentResponse () {}

	public static ResponseEntity<Map<String, Object>> getAllStudents (boolean isOK, Object data) {
		final Map<String, Object> map = new HashMap<>();

		map.put("ok", isOK);
		map.put("message", isOK ? StudentResponse.GET_ALL_STUDENTS_OK : StudentResponse.GET_ALL_STUDENTS_FAILED);
		map.put("data", data);

		return ResponseEntity.ok(map);
	}
}
