package OOP_Hogiadinh;

import java.util.ArrayList;
import java.util.Scanner;

public class KhuPho {
	public static void main(String[] args) {
		ArrayList<HoGiaDinh> giadinh = new ArrayList<HoGiaDinh>();
		Scanner nhap = new Scanner(System.in);
		while (true) {
			System.out.println("\n========== QUẢN LÝ KHU PHỐ ==========");
			System.out.println("1. Nhập thông tin các hộ gia đình");
			System.out.println("2. Hiển thị thông tin khu phố");
			System.out.println("3. Thoát");
			System.out.print("Mời bạn chọn (1-3): ");
			int chon = nhap.nextInt();
			nhap.nextLine();
			if (chon == 1) {
				System.out.println("thêm số lượng hộ gia đình");
				int n = nhap.nextInt();
				nhap.nextLine();
				for (int i = 0; i < n; i++) {
					System.out.println("nhập vào số nhà thứ" +(i+1));
					String sonha = nhap.nextLine();
					System.out.println("nhập vào số lượng thành viên trong gia đình");
					int thanhvien = nhap.nextInt();
					nhap.nextLine();
					ArrayList<Nguoi> nguoi = new ArrayList<Nguoi>();
					for (int j = 0; j < thanhvien; j++) {
						System.out.println("nhập vào thành viên thứ" + (j + 1));
						System.out.println("nhập vào họ tên thứ" + (j + 1));
						String hoten = nhap.nextLine();
						System.out.println("nhập vào tuổi thứ" + (j + 1));
						int tuoi = nhap.nextInt();
						nhap.nextLine();
						System.out.println("nhập vào nghề nghiệp họ tên thứ" + (j + 1));
						String ngheNghiep = nhap.nextLine();
						System.out.println("nhập vào cmnd họ tên thứ" + (j + 1));
						String soCMND = nhap.nextLine();
						Nguoi nguoi1 = new Nguoi(hoten, tuoi, ngheNghiep, soCMND);
						nguoi.add(nguoi1);
					}
					HoGiaDinh hogiadinh = new HoGiaDinh(sonha, nguoi);
					giadinh.add(hogiadinh);
				}
			} else if (chon == 2) {
				for (HoGiaDinh gd : giadinh) {
					gd.display();
				}
			} else if (chon == 3) {
                System.out.println("Tạm biệt!");
                break; // Thoát vòng lặp while
            }

		}
	}
}
