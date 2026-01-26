package Array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nhap = new Scanner(System.in);
		Random rd = new Random();
		System.out.println("Nhập số phần tử mảng");
		int n = nhap.nextInt();
		int mang[] = new int[n];

		for (int i = 0; i < mang.length; i++) {
			mang[i] = rd.nextInt(-50, 50);
		}
		for (int i = 0; i < mang.length; i++) {
			System.out.print(mang[i] + " ");
		}
		System.out.println("");
//		System.out.print(Arrays.toString(mang));
		System.out.println("Nhập vào vị trí cần thêm");
		int vitri = nhap.nextInt();
		System.out.println("Nhập vào phần tử cần thêm");
		int phantu = nhap.nextInt();

		// tạo mảng mới
		int mangmoi[] = new int[n + 1];
		for (int i = 0; i < mangmoi.length; i++) {
			// copy các phần tử trước vị trí chèn
			if (i < vitri) {
				mangmoi[i] = mang[i];
			}
			// chèn vào vị trí
			else if (i == vitri) {
				mangmoi[i] = phantu;
			}
            // i là vị trí đó nha
			else {
				mangmoi[i] = mang[i - 1];
			}
		}
		for (int i = 0; i < mangmoi.length; i++) {
			System.out.print(mangmoi[i] + " ");
		}

	}

}
