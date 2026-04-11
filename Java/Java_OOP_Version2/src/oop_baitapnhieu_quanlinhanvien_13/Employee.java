package oop_baitapnhieu_quanlinhanvien_13;

import java.util.ArrayList;

public abstract class Employee {
//	là: ID, FullName, BirthDay,Phone, Email, Employee_type,Employee_count và phương 
//	thức là ShowInfo để hiển thị thông tin của nhân viên đó (hiển thị thông tin nhân viên ra màn hình console).
	
	private int id;
	private String FullName;
	private String	BirthDay;
	private String	Phone;
	private int Employee_type;
	private ArrayList<Certificate> chungchi;
	private static int Employee_count=0;
	
	public Employee()
	{
		Employee_count++;
	}
	
	public Employee(int id, String fullName, String birthDay, String phone, int employee_type,
			ArrayList<Certificate> chungchi) {
	
		this.id = id;
		this.FullName = fullName;
		this.BirthDay = birthDay;
		this.Phone = phone;
		this.Employee_type=employee_type;
		this.chungchi = chungchi;
		Employee_count++;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return FullName;
	}

	public void setFullName(String fullName) {
		FullName = fullName;
	}

	public String getBirthDay() {
		return BirthDay;
	}

	public void setBirthDay(String birthDay) {
		BirthDay = birthDay;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public int getEmployee_type() {
		return Employee_type;
	}

	public void setEmployee_type(int employee_type) {
		Employee_type = employee_type;
	}

	public static int getEmployee_count() {
		return Employee_count;
	}

	public static void setEmployee_count(int employee_count) {
		Employee_count = employee_count;
	}
    
	public ArrayList<Certificate> getChungchi() {
		return chungchi;
	}

	public void setChungchi(ArrayList<Certificate> chungchi) {
		this.chungchi = chungchi;
	}

	public static void demnhanvien()
	{
		System.out.println("Tổng số nhân viên là :" +Employee.getEmployee_count());
	}
	public abstract void ShowInfo();
	
}
