package Cu_Phap_Basic;

import java.util.Scanner;

public class If_Else_Diemgpa {
	public static double diemgpa(double a, double b, double c) {
		return (a + b + c) / 3;
	}

	public static String phanloaidiem(double gpa) {

		if (gpa > 5) {
			return " ok";
		} else {
			return "nguuu";
		}

	}

	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		System.out.println("Nhập vào điểm a");
		double a = nhap.nextDouble();
		System.out.println("Nhập vào điểm b");
		double b = nhap.nextDouble();
		System.out.println("Nhập vào điểm c");
		double c = nhap.nextDouble();

		double kq = diemgpa(a, b, c);
		
		System.out.println(phanloaidiem(kq));
	}

}
