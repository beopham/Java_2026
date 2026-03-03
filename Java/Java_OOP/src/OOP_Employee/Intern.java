package OOP_Employee;

import java.util.ArrayList;

public class Intern extends Employee {
	private String majors;
	private String semester;
	private String universityName;

	public Intern() {

	}

	public Intern(String id, String fullName, String birthDay, String phone, String email, int employeeType,
			ArrayList<Certificate> certificate, String majors, String semester, String universityName) {
		super(id, fullName, birthDay, phone, email, employeeType, certificate);
		this.majors = majors;
		this.semester = semester;
		this.universityName = universityName;
	}

	public String getMajors() {
		return majors;
	}

	public void setMajors(String majors) {
		this.majors = majors;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	@Override
	public void ShowInfo() {
		System.out.println("----- THÔNG TIN NHÂN VIÊN INTERN (THỰC TẬP) -----");
	    
	    // Gọi các thông tin chung từ lớp cha Employee thông qua Getter
	    System.out.println("Mã NV: " + getId());
	    System.out.println("Họ tên: " + getFullName());
	    System.out.println("Ngày sinh: " + getBirthDay());
	    System.out.println("Số điện thoại: " + getPhone());
	    System.out.println("Email: " + getEmail());
	    System.out.println("Loại nhân viên: Intern (2)");

	 // 2. Gọi các Getter của chính lớp Intern (Thay vì dùng this.majors)
	    System.out.println("Chuyên ngành: " + getMajors());
	    System.out.println("Học kỳ đang học: " + getSemester());
	    System.out.println("Trường đang học: " + getUniversityName());
		for(Certificate ct : getCertificate())
	    {
	    	ct.display();
	    }

	}

}
