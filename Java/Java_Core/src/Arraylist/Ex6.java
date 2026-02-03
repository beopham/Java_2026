package Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Ex6 {
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
		System.out.println("Sắp xếp mảng tăng dần");
		Collections.sort(mangso);
		System.out.println(mangso.toString());
		System.out.println("Phân tử lớn thứ 2 là " + mangso.get(n-2));
		for (int i = 0; i < mangso.size(); i++) {
			if(mangso.get(n-2)== mangso.get(i))
			{
				System.out.println("vị trí phần tử lớn thứ 2 là "+ i);	
			}
			
		}
		System.out.println("Sắp xếp mảng giảm dần");
		Collections.sort(mangso,Collections.reverseOrder());
		System.out.println(mangso.toString());
		System.out.println("Phân tử nhỏ thứ 2 là " + mangso.get(n-2));
		for (int i = 0; i < mangso.size(); i++) {
			if(mangso.get(n-2)== mangso.get(i))
			{
				System.out.println("vị trí phần tử nhỏ thứ 2 là "+ i);	
			}
			
		}

	}
}
