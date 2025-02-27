package dev.shan.schoolms.util.enumaration.student;

public enum StudentBloodGroup {
	A_PLUS, A_NEGATIVE, B_PLUS, B_NEGATIVE, O_PLUS, O_NEGATIVE, AB_PLUS, AB_NEGATIVE;

	public static StudentBloodGroup parseStudentBloodGroup (String str) {
		if (str == null) return null;

		return switch (str.toLowerCase()) {
			case "a+" -> StudentBloodGroup.A_PLUS;
			case "a-" -> StudentBloodGroup.A_NEGATIVE;
			case "b+" -> StudentBloodGroup.B_PLUS;
			case "b-" -> StudentBloodGroup.B_NEGATIVE;
			case "o+" -> StudentBloodGroup.O_PLUS;
			case "o-" -> StudentBloodGroup.O_NEGATIVE;
			case "ab+" -> StudentBloodGroup.AB_PLUS;
			case "ab-" -> StudentBloodGroup.AB_NEGATIVE;
			default -> null;
		};
	}
}
