package OOP_Employee;

import java.util.ArrayList;

public abstract class Employee {
	private static int Employee_count = 0;
	private String id;
	private String fullName;
	private String birthDay;
	private String phone;
	private String email;
	private int employeeType;
	private ArrayList<Certificate> certificate;

	public Employee() {
		this.certificate = new ArrayList<Certificate>();
	}

	public Employee(String id, String fullName, String birthDay, String phone, String email, int employeeType,
			ArrayList<Certificate> certificate) {
		this.id = id;
		this.fullName = fullName;
		this.birthDay = birthDay;
		this.phone = phone;
		this.email = email;
		this.employeeType = employeeType;
		this.certificate = certificate;
		Employee_count++;
	}

	public static int getEmployee_count() {
		return Employee_count;
	}

	public static void setEmployee_count(int employee_count) {
		Employee_count = employee_count;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(int employeeType) {
		this.employeeType = employeeType;
	}

	public ArrayList<Certificate> getCertificate() {
		return certificate;
	}

	public void setCertificate(ArrayList<Certificate> certificate) {
		this.certificate = certificate;
	}

	public abstract void ShowInfo();

}
