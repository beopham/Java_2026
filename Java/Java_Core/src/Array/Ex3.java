package Array;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		System.out.println("Nhập vào số lượng học sinh:");
		int hocsinh = nhap.nextInt();

		String ten[] = new String[hocsinh];
		// 1. Đổi kiểu mảng điểm sang double
		double diem[] = new double[hocsinh];

		nhap.nextLine();

		for (int i = 0; i < hocsinh; i++) {
			System.out.println("Nhập vào tên học sinh thứ " + (i + 1));
			ten[i] = nhap.nextLine();

			System.out.println("Nhập vào điểm học sinh thứ " + (i + 1));
			// 2. Đổi sang nextDouble()
			diem[i] = nhap.nextDouble();
			nhap.nextLine();
		}
		for (int i = 0; i < hocsinh; i++) {

			System.out.println("Tên học sinh thứ " + (i + 1) + " : " + ten[i]);
			System.out.println("Điểm học sinh thứ " + (i + 1) + " : " + diem[i]);

		}
		// Phần tìm vị trí điểm cao nhất giữ nguyên logic
		int vitrimax = 0;
		for (int i = 0; i < hocsinh; i++) {
			if (diem[i] > diem[vitrimax]) {
				vitrimax = i;
			}
		}

		System.out.println("\n--- KẾT QUẢ ---");
		System.out.println("Học sinh điểm cao nhất là: " + ten[vitrimax]);
		// Kết quả in ra sẽ có dạng x.x (ví dụ: 9.0 hoặc 8.5)
		System.out.println("Điểm học sinh cao nhất là: " + diem[vitrimax]);

		double sum = 0;
		for (int i = 0; i < hocsinh; i++) {
			sum = sum + diem[i];
		}
		double diemtb = 0;
		diemtb = sum / hocsinh;
		System.out.println("Điêm trung bình là " + diemtb);
		System.out.println("Danh sách học sinh trên 5 là");
		for (int i = 0; i < hocsinh; i++) {
			if (diem[i] >= 5) {
				System.out.println("Tên học sinh là " + ten[i]);
				System.out.println("Điểm học sinh là " + diem[i]);
			}
		}

		nhap.close();
	}
}