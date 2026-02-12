package QuanLiSinhVien;

public class SinhVien {
	private String name;
	private String address;
	private int age;
	private double gpa;

	public SinhVien() {

	}
	public SinhVien(String name) {

		this.name = name;
		
	}
	public SinhVien(String name, String address, int age, double gpa) {

		this.name = name;
		this.address = address;
		this.age = age;
		this.gpa = gpa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public void display() {
        System.out.println("------------------------------");
        System.out.println("Thông tin sinh viên:");
        System.out.println(" - Họ tên: " + getName());
        System.out.println(" - Địa chỉ: " + getAddress());
        System.out.println(" - Tuổi: " + getAge());
        System.out.println(" - Điểm GPA: " + getGpa());
    }
}
