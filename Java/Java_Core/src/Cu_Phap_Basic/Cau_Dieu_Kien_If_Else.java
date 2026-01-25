package Cu_Phap_Basic;

import java.util.Scanner;

public class Cau_Dieu_Kien_If_Else {
	private static int nam=9;
	public static double diemgpa(double a,double b,double c)
	{
		double ketqua=0;
		ketqua=(a+b+c)/3;
		return ketqua;
	}
	public static void main(String[] args) {
		Scanner nhap=new Scanner(System.in);
		System.out.println("Nhập số a");
		double a=nhap.nextDouble();
		System.out.println("Nhập số b");
		double b=nhap.nextDouble();
		System.out.println("Nhập số c");
		double c=nhap.nextDouble();
		
		System.out.println(diemgpa(a,b,c));
		System.out.println(nam);
	}

}
