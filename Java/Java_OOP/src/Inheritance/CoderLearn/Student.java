package Inheritance.CoderLearn;

public class Student extends Person {
	private double gpa;
	
	public Student()
	{
		
	}

	public Student(String name, int age, String address,double gpa) {
		super(name, age, address);
		this.gpa=gpa;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	@Override
	public void display() {
	    System.out.println("Tên: " + getName());
	    System.out.println("Tuổi: " + getAge());
	    System.out.println("Địa chỉ: " + getAddress());
	    System.out.println("gpa: " + getGpa());
	}
}
