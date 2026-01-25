package Array;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nhap = new Scanner(System.in);
		System.out.println("Nhập vào số phân tử mảng");
		int n = nhap.nextInt();

		int[] mang = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Nhập phần tử mảng thứ " + i);
			mang[i] = nhap.nextInt();
		}
		for (int i = 0; i < n; i++) {
			System.out.print(mang[i] + " ");
		}
        
		System.out.println("for each");
		for(int i : mang)
		{
			System.out.println(i+" ");
		}
		int sum = 0;


		for (int i = 0; i < mang.length; i++) {
			sum = sum + mang[i];
		}
		System.out.println("Sum =" + sum);
		int max=mang[0];
		for(int i=0;i<mang.length;i++)
		{
			if(max<mang[i])
			{
				max=mang[i];
			}
		}
		System.out.println("Max = " +max);
	
		int min = mang[0];
		for(int i=0;i<mang.length;i++)
		{
			if(min>mang[i])
			{
				min=mang[i];
			}
		}
		System.out.println("Min = " +min);
	}

}
