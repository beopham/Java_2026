package OOP_Employee;

import java.util.ArrayList;

public class Experience extends Employee{

	private int expInYear;
    private String proSkill;
    public Experience()
    {
    	
    }

	public Experience(String id, String fullName, String birthDay, String phone, String email, int employeeType,
			ArrayList<Certificate> certificate,int expInYear, String proSkill) {
		super(id, fullName, birthDay, phone, email, employeeType, certificate);
		this.expInYear = expInYear;
		this.proSkill = proSkill;
	}

	public int getExpInYear() {
		return expInYear;
	}

	public void setExpInYear(int expInYear) {
		this.expInYear = expInYear;
	}

	public String getProSkill() {
		return proSkill;
	}

	public void setProSkill(String proSkill) {
		this.proSkill = proSkill;
	}

	@Override
	public void ShowInfo() {
		System.out.println("----- THÔNG TIN NHÂN VIÊN KINH NGHIỆM -----");
	    
	    // Vì id, fullName... là private ở lớp cha, ta phải gọi qua hàm Get
	    System.out.println("Mã NV: " + getId()); 
	    System.out.println("Họ tên: " + getFullName());
	    System.out.println("Ngày sinh: " + getBirthDay());
	    System.out.println("Điện thoại: " + getPhone());
	    System.out.println("Email: " + getEmail());
	    System.out.println("Loại nhân viên: " + getEmployeeType());
	    
	    // In thông tin riêng của Experience
	    System.out.println("Số năm kinh nghiệm: " + getExpInYear());
	    System.out.println("Kỹ năng chuyên môn: " + getProSkill());
	    for(Certificate ct : getCertificate())
	    {
	    	ct.display();
	    }
	    
		
	}

}
