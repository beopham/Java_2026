package oop_baitapnhieu_quanlinhanvien_13;

import java.util.ArrayList;

public class Experience extends Employee {
	private int expInYear;
	private String proSkill;
	private static int experienceCount = 0;

	public Experience() {
		experienceCount++;
	}

	public Experience(int id, String fullName, String birthDay, String phone, int employee_type,
			ArrayList<Certificate> chungchi, int expInYear, String proSkill) {
		super(id, fullName, birthDay, phone, employee_type, chungchi);
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

	public static int getExperienceCount() {
		return experienceCount;
	}

	public static void setExperienceCount(int experienceCount) {
		Experience.experienceCount = experienceCount;
	}

	public void demsonhanvienkinhnghiem() {
		System.out.println("Tổng số nhân viên kinh nghiệm là" + Experience.experienceCount);
	}

	@Override
	public void ShowInfo() {
	    System.out.println("----- THÔNG TIN NHÂN VIÊN KINH NGHIỆM -----");
	    
	    // Sử dụng các getter từ lớp cha (Employee) - Đã bỏ 'this'
	    System.out.println("Mã nhân viên: " + getId());
	    System.out.println("Họ và tên: " + getFullName());
	    System.out.println("Ngày sinh: " + getBirthDay());
	    System.out.println("Số điện thoại: " + getPhone());
	    System.out.println("Loại nhân viên: " + getEmployee_type());
	    
	    // Hiển thị danh sách bằng cấp
	    System.out.println("Danh sách bằng cấp:");
	    if (getChungchi().isEmpty()) {
	        System.out.println("   (Chưa có bằng cấp)");
	    } else {
	        for (Certificate cc : getChungchi()) {
	            cc.display(); // Hàm display này bên lớp Certificate cũng đã bỏ 'this' rồi nhé
	        }
	    }

	    // Sử dụng các getter của riêng lớp Experience - Đ đã bỏ 'this'
	    System.out.println("Số năm kinh nghiệm: " + getExpInYear());
	    System.out.println("Kỹ năng chuyên môn: " + getProSkill());

	    System.out.println("-------------------------------------------");
	}
}
