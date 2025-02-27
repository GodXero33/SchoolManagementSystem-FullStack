package dev.shan.schoolms.util.enumaration.student;

public enum StudentGender {
	MALE, FEMALE, OTHER;

	public static StudentGender parseStudentGender (String str) {
		if (str == null) return null;

		return switch (str.toLowerCase()) {
			case "male" -> StudentGender.MALE;
			case "female" -> StudentGender.FEMALE;
			case "other" -> StudentGender.OTHER;
			default -> null;
		};
	}
}
