package OOP_Student;

public class NormalStudent extends Student {
	private double englishScore;
	private double entryTestScore;

	public NormalStudent() {

	}

	public NormalStudent(String fullName, String doB, String sex, String phoneNumber, String universityName,
			String gradeLevel, double englishScore, double entryTestScore) {
		super(fullName, doB, sex, phoneNumber, universityName, gradeLevel);
		this.englishScore = englishScore;
		this.entryTestScore = entryTestScore;
	}

	public double getEnglishScore() {
		return englishScore;
	}

	public void setEnglishScore(double englishScore) {
		this.englishScore = englishScore;
	}

	public double getEntryTestScore() {
		return entryTestScore;
	}

	public void setEntryTestScore(double entryTestScore) {
		this.entryTestScore = entryTestScore;
	}

	@Override
	public void ShowMyInfor() {
		// Sử dụng getter từ lớp cha Student
		System.out.println("Full Name: " + getFullName());
		System.out.println("Date of Birth: " + getDoB());
		System.out.println("Sex: " + getSex());
		System.out.println("Phone Number: " + getPhoneNumber());
		System.out.println("University Name: " + getUniversityName());
		System.out.println("Grade Level: " + getGradeLevel());

		// Sử dụng getter riêng của lớp NormalStudent
		System.out.println("English Score: " + getEnglishScore());
		System.out.println("Entry Test Score: " + getEntryTestScore());
	}

}
