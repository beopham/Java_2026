package oop_baitapnhieu_quanlinhanvien_13;

import java.util.ArrayList;

public class Fresher extends Employee {
	// Các thuộc tính bổ sung cho Fresher
	private String graduation_date; // Thời gian tốt nghiệp
	private String graduation_rank; // Xếp loại tốt nghiệp
	private String education; // Trường tốt nghiệp
    private static int Freshercount=0;
	public Fresher() {
		Freshercount++;
	}

	public Fresher(int id, String fullName, String birthDay, String phone, int employee_type,
			ArrayList<Certificate> chungchi, String graduation_date, String graduation_rank, String education) {
		super(id, fullName, birthDay, phone, employee_type, chungchi);
		this.graduation_date = graduation_date;
		this.graduation_rank = graduation_rank;
		this.education = education;
		Freshercount++;
	}

	public String getGraduation_date() {
		return graduation_date;
	}

	public void setGraduation_date(String graduation_date) {
		this.graduation_date = graduation_date;
	}

	public String getGraduation_rank() {
		return graduation_rank;
	}

	public void setGraduation_rank(String graduation_rank) {
		this.graduation_rank = graduation_rank;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public static int getFreshercount() {
		return Freshercount;
	}

	public static void setFreshercount(int freshercount) {
		Freshercount = freshercount;
	}
    
	public void demnhanvienfresher()
	{
		System.out.println("Số lượng nhân viên FRESHER:" +Fresher.Freshercount);
	}
	@Override
	public void ShowInfo() {
		System.out.println("----- THÔNG TIN NHÂN VIÊN FRESHER -----");
		// Gọi các getter từ lớp cha
		System.out.println("Mã nhân viên: " + getId());
		System.out.println("Họ và tên: " + getFullName());
		System.out.println("Ngày sinh: " + getBirthDay());
		System.out.println("Số điện thoại: " + getPhone());

		// Hiển thị bằng cấp
		if (getChungchi().isEmpty()) {
			System.out.println("chưa có chứng chỉ");
		} else {
			System.out.println("Danh sách chứng chỉ");
			for (Certificate cc : getChungchi()) {
				cc.display();
			}
		}

		// Hiển thị các thuộc tính riêng của Fresher
		System.out.println("Thời gian tốt nghiệp: " + getGraduation_date());
		System.out.println("Xếp loại tốt nghiệp: " + getGraduation_rank());
		System.out.println("Trường tốt nghiệp: " + getEducation());
		System.out.println("---------------------------------------");

	}

}
