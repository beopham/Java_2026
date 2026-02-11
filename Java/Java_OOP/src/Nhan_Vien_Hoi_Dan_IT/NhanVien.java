package Nhan_Vien_Hoi_Dan_IT;

public class NhanVien {
	private String name;
	private int age;
	private String department;
	private double salary;
	private String company;

	public NhanVien() {

	}

	public NhanVien(String name, int age, String department, double salary, String company) {
		this.name = name;
		this.age = age;
		this.department = department;
		this.salary = salary;
		this.company = company;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void showinfor() {
		System.out.println("====================");
		System.out.println("Name " + name);
		System.out.println("Age " + age);
		System.out.println("Department " + department);
		System.out.println("Salary " + salary);
		System.out.println("company " + company);
		System.out.println("====================");
	}

	public void raiseSalary(double amount) {
		double luongmoi = 0;
		if (amount > 0) {
			luongmoi = salary + (salary * (15 / 100.0));
			System.out.println("====================");
			System.out.println("Name " + name);
			System.out.println("Age " + age);
			System.out.println("Department " + department);
			System.out.println("New Salary" + luongmoi);
			System.out.println("company " + company);
			System.out.println("====================");
		} else {
			System.out.println("don't raise salary");
		}
	}

}
