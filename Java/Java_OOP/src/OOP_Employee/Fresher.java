package OOP_Employee;

import java.util.ArrayList;

public class Fresher extends Employee{

	private String graduationDate;
    private String graduationRank;
    private String education;
    public Fresher()
    {
    	
    }
    
	public Fresher(String id, String fullName, String birthDay, String phone, String email, int employeeType,
			ArrayList<Certificate> certificate,String graduationDate, String graduationRank, String education) {
		super(id, fullName, birthDay, phone, email, employeeType, certificate);
		this.graduationDate = graduationDate;
		this.graduationRank = graduationRank;
		this.education = education;
	}

	public String getGraduationDate() {
		return graduationDate;
	}

	public void setGraduationDate(String graduationDate) {
		this.graduationDate = graduationDate;
	}

	public String getGraduationRank() {
		return graduationRank;
	}

	public void setGraduationRank(String graduationRank) {
		this.graduationRank = graduationRank;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	@Override
	public void ShowInfo() {
		System.out.println("----- THÔNG TIN NHÂN VIÊN FRESHER -----");
	    
	    // Lấy thông tin chung từ lớp cha (Employee) qua Getter
	    System.out.println("Mã NV: " + getId());
	    System.out.println("Họ tên: " + getFullName());
	    System.out.println("Ngày sinh: " + getBirthDay());
	    System.out.println("Điện thoại: " + getPhone());
	    System.out.println("Email: " + getEmail());
	    System.out.println("Loại: Fresher (1)");

	    // In các thông tin riêng của Fresher
	    System.out.println("Thời gian tốt nghiệp: " + this.graduationDate);
	    System.out.println("Xếp loại tốt nghiệp: " + this.graduationRank);
	    System.out.println("Trường tốt nghiệp: " + this.education);
	    for(Certificate ct : getCertificate())
	    {
	    	ct.display();
	    }
	    
	}

}
