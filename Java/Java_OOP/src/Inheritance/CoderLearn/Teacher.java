package Inheritance.CoderLearn;

public class Teacher extends Person {
     private int Salary;
     public Teacher()
     {
    	 
     }
	
	 public Teacher(String name, int age, String address,int Salary) {
		super(name, age, address);
	    this.Salary=Salary;
	 }

	 public int getSalary() {
		 return Salary;
	 }

	 public void setSalary(int salary) {
		 Salary = salary;
	 }
		@Override
		public void display() {
		    System.out.println("Tên: " + getName());
		    System.out.println("Tuổi: " + getAge());
		    System.out.println("Địa chỉ: " + getAddress());
		    System.out.println("Lương: " + getSalary());
		}
}
