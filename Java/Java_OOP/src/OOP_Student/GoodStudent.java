package OOP_Student;

public class GoodStudent extends Student {
	private double gpa;
	private String bestRewardName;
    public GoodStudent()
    {
    	
    }
    

	public GoodStudent(String fullName, String doB, String sex, String phoneNumber, String universityName,
			String gradeLevel,double gpa, String bestRewardNamel) {
		super(fullName, doB, sex, phoneNumber, universityName, gradeLevel);
		this.gpa = gpa;
		this.bestRewardName = bestRewardName;
	}

	public double getGpa() {
		return gpa;
	}


	public void setGpa(double gpa) {
		this.gpa = gpa;
	}


	public String getBestRewardName() {
		return bestRewardName;
	}


	public void setBestRewardName(String bestRewardName) {
		this.bestRewardName = bestRewardName;
	}


	@Override
	public void ShowMyInfor() {
	    // Dùng getter từ lớp cha Student
	    System.out.println("Full Name: " + getFullName());
	    System.out.println("Date of Birth: " + getDoB());
	    System.out.println("Sex: " + getSex());
	    System.out.println("Phone Number: " + getPhoneNumber());
	    System.out.println("University Name: " + getUniversityName());
	    System.out.println("Grade Level: " + getGradeLevel());
	    
	    // Dùng getter của chính lớp GoodStudent
	    System.out.println("GPA: " + getGpa());
	    System.out.println("Best Reward Name: " + getBestRewardName());
	}

}
