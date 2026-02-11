package Basic;

import java.util.Scanner;

public class Sinhvien {
     String ten;
    double gpa;
    
    public void nhap()
    {
    	Scanner nhap=new Scanner(System.in);
    	System.out.println("Nhập vào tên");
    	ten=nhap.nextLine();
    	System.out.println("Nhập vào gpa");
    	gpa=nhap.nextDouble();
    	
    }
	public  void display()
    {
		
    	System.out.println("tên là " + ten);
    	System.out.println("gpa là " +gpa );
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sinhvien sv=new Sinhvien();
//		sv.ten="nam";
//		sv.gpa=3.2;
		sv.nhap();
		sv.display();
      	}

}