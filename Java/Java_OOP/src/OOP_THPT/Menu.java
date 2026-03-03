package OOP_THPT;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		QLHocSinh quanli = new QLHocSinh();
		Scanner nhap = new Scanner(System.in);
		while (true) {
			System.out.println("\n===== MENU QUẢN LÝ HỌC SINH =====");
			System.out.println("1. Thêm học sinh mới");
			System.out.println("2. Hiển thị học sinh 20 tuổi");
			System.out.println("3. Số lượng học sinh 23 tuổi và quê ở DN");
			System.out.println("0. Thoát");
			System.out.print("Mời em chọn: ");
			int chon = nhap.nextInt();
			nhap.nextLine(); // Chống trôi lệnh
			if (chon == 1) {
				System.out.println("Nhập vào lớp của học sinh");
				String lop = nhap.nextLine();
				System.out.println("Nhập vào họ tên của học sinh");
				String hoten = nhap.nextLine();
				System.out.println("Nhập vào tuổi của học sinh");
				int tuoi = nhap.nextInt();
				nhap.nextLine();
				System.out.println("Nhập vào quên quán của học sinh");
				String que = nhap.nextLine();
				HocSinh hs = new HocSinh(lop, hoten, tuoi, que);
				quanli.them(hs);
			} else if (chon == 2) {
				quanli.hstren20();
			} else if (chon == 3) {
				quanli.hstuoi23_que_dn();
			}
		}
	}

}
