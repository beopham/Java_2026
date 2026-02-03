package Arraylist;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		    System.out.print(mangso.get(i) +" ");

		}
		System.out.println("size " + mangso.size());

	}
}
