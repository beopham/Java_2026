package oop_baitapnhieu_quanlinhanvien_13;

import java.util.ArrayList;

public class Intern extends Employee{
	private String majors;          // Chuyên ngành đang học
    private int semester;           // Học kì đang học
    private String university_name; // Tên trường đang học
    
    private static int Interncount =0 ;
    public Intern()
    {
    	
    }
    

	public Intern(int id, String fullName, String birthDay, String phone, int employee_type,
			ArrayList<Certificate> chungchi,String majors, int semester, String university_name) {
		super(id, fullName, birthDay, phone, employee_type, chungchi);
		this.majors = majors;
		this.semester = semester;
		this.university_name = university_name;
	}

	public String getMajors() {
		return majors;
	}


	public void setMajors(String majors) {
		this.majors = majors;
	}


	public int getSemester() {
		return semester;
	}


	public void setSemester(int semester) {
		this.semester = semester;
	}


	public String getUniversity_name() {
		return university_name;
	}


	public void setUniversity_name(String university_name) {
		this.university_name = university_name;
	}


	public static int getInterncount() {
		return Interncount;
	}


	public static void setInterncount(int interncount) {
		Interncount = interncount;
	}

    public void demnhanvienintern()
    {
    	System.out.println("Số lượng nhân viên intern là" + Intern.Interncount);
    }
	@Override
    public void ShowInfo() {
        System.out.println("----- THÔNG TIN NHÂN VIÊN THỰC TẬP (INTERN) -----");
        
        // Thông tin chung từ lớp cha
        System.out.println("Mã nhân viên: " + getId());
        System.out.println("Họ và tên: " + getFullName());
        System.out.println("Ngày sinh: " + getBirthDay());
        System.out.println("Số điện thoại: " + getPhone());

        // Hiển thị danh sách bằng cấp (nếu có)
        System.out.println("Danh sách bằng cấp:");
        if (getChungchi().isEmpty()) {
            System.out.println("   (Chưa có bằng cấp)");
        } else {
            for (Certificate cc : getChungchi()) {
                cc.display();
            }
        }

        // Thông tin riêng của Intern
        System.out.println("Chuyên ngành: " + getMajors());
        System.out.println("Học kỳ: " + getSemester());
        System.out.println("Trường đang học: " + getUniversity_name());
        
        System.out.println("-------------------------------------------------");
    }

}
