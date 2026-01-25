package Cu_Phap_Basic;

import java.util.Scanner;

public class Scanner_nha {
	public static void main(String[] args) {
		// khởi tạo đối tượng scanner
		Scanner nhap = new Scanner(System.in);
		
		System.out.println("nhập vào tên");
		String ten=nhap.nextLine();
		System.out.println("nhập vào địa chỉ");
		String diachi=nhap.nextLine();
		System.out.println("Nhập vào tuổi");
		int tuoi=nhap.nextInt();
		System.out.println("Nhập vào gpa");
		double gpa=nhap.nextDouble();
		
		System.out.println("Tên nhập là " + ten);
		System.out.println("Địa chỉ nhập là " + diachi);
		System.out.println("Tuổi nhập là " + tuoi);
		System.out.println("Gpa nhập là " + gpa);
	}
}
