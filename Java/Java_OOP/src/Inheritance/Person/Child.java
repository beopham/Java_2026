package Inheritance.Person;

public class Child extends Cha{
 
	private double gpa;
	
	public Child()
	{
		
	}

	public Child(String ten, int tuoi,double gpa) {
		super(ten,tuoi);
		this.gpa = gpa;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public void display() {
	    System.out.println("--- Thông tin sinh viên ---");
	    // Sử dụng getter từ lớp Cha
	    System.out.println("Tên: " + getTen());
	    System.out.println("Tuổi: " + getTuoi());
	    // Sử dụng thuộc tính của lớp Child
	    System.out.println("GPA: " + this.gpa);
	}
	@Override
	  public void an()
	  {
		  System.out.println("ăn cơm  gà");
	  }
	
}
