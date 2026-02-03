package Arraylist;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
				int count=0;
				System.out.println();
				System.out.println("những số lớn hơn 50");
				for (int i = 0; i < mangso.size(); i++) {
				   if(mangso.get(i) >50)
				   {
					   count++;
					   System.out.print(mangso.get(i) +" ");
				   }

				}
				System.out.println();
				System.out.println("Bình phương");
				for (int i = 0; i < mangso.size(); i++) {
				    int binhphuong=(int) Math.pow(mangso.get(i), 2);
					System.out.print(binhphuong +" ");

				}
	}

}
