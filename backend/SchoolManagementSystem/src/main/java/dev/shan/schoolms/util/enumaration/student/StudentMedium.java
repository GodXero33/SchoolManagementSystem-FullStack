package dev.shan.schoolms.util.enumaration.student;

public enum StudentMedium {
	SINHALA, TAMIL, ENGLISH;

	public static StudentMedium parseStudentMedium (String str) {
		if (str == null) return null;

		return switch (str.toLowerCase()) {
			case "sinhala" -> StudentMedium.SINHALA;
			case "tamil" -> StudentMedium.TAMIL;
			case "english" -> StudentMedium.ENGLISH;
			default -> null;
		};
	}
}
