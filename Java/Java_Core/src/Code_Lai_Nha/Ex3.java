package Code_Lai_Nha;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		System.out.println("Nhập vào số phần tử mảng");
		int n = nhap.nextInt();

		int mang[] = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Nhập vào phân tử thứ " + (i + 1));
			mang[i] = nhap.nextInt();
		}
		for (int i = 0; i < n; i++) {
			System.out.print(mang[i] + " ");
		}
		System.out.println("");
		System.out.println("Nhập vị trí cần xóa");
		int vitri = nhap.nextInt();

		// tạo mảng mới với kíc thước mới
		int mangmoi[] = new int[n - 1];
		for (int i = 0; i < mangmoi.length; i++) {
			if (i < vitri) {
				mangmoi[i] = mang[i];
			} 
			else {
				mangmoi[i] = mang[i + 1];
			}
		}
		for (int i = 0; i < mangmoi.length; i++) {
			System.out.print(mangmoi[i] + " ");
		}

	}

}
