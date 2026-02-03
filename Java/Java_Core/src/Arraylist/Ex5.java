package Arraylist;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		ArrayList<Integer> mangso = new ArrayList<>();
		Random rd = new Random();
		Scanner nhap = new Scanner(System.in);
		System.out.println("Nhập vào n phần tử");
		int n = nhap.nextInt();

		for (int i = 0; i < n; i++) {
			int phantu = rd.nextInt(1, 100);
			mangso.add(phantu);

		}
		for (int i = 0; i < mangso.size(); i++) {
			System.out.print(mangso.get(i) + " ");

		}
		int count = 0;
		System.out.println();
		System.out.println("những số nhỏ hơn 80");
		for (int i = 0; i < mangso.size(); i++) {
			if (mangso.get(i) < 80) {
				count++;
				
			}

		}
		System.out.println("những số nhỏ hơn 80 là "  +count);
		for (int i = 0; i < mangso.size(); i++) {
			if (mangso.get(i) < 80) {
				count++;
				System.out.println("số nhỏ hơn 80 là "+ mangso.get(i)  +" vị trí của những số đó là "+i);
			}

		}
	}
}
