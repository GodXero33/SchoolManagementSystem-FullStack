package dev.shan.schoolms.util.enumaration.student;

public enum StudentStatus {
	ACTIVE, TRANSFERRED, LEFT, EXPELLED;

	public static StudentStatus parseStudentStatus (String str) {
		if (str == null) return null;

		return switch (str.toLowerCase()) {
			case "active" -> StudentStatus.ACTIVE;
			case "transferred" -> StudentStatus.TRANSFERRED;
			case "left" -> StudentStatus.LEFT;
			case "expelled" -> StudentStatus.EXPELLED;
			default -> null;
		};
	}
}
