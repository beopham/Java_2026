package Array;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nhap = new Scanner(System.in);

		System.out.println("Nhập số phần tử mảng");
		int n = nhap.nextInt();
		int mang[] = new int[n];

		for (int i = 0; i < mang.length; i++) {
			System.out.println("Nhập vào phần tử mảng thứ " + i);
			mang[i] = nhap.nextInt();
		}
		for (int i = 0; i < mang.length; i++) {
			System.out.print(mang[i] + " ");
		}
		int sum =0;
		for (int i = 0; i < mang.length; i++) {
			sum=sum+mang[i];
		}
		System.out.println("Sum = " +sum);
		
		int sumchan=0;
		int sumle=0;
		int demchan=0;
		int demle=0;
		for (int i = 0; i < mang.length; i++) {
			if(mang[i]%2==0)
			{
				sumchan=sumchan+mang[i];
				demchan++;
			}
			if(mang[i]%2!=0)
			{
				sumle=sumle+mang[i];
				demle++;
			}
		}
		System.out.println("Sum chẵn = " +sumchan);
		System.out.println("Sum lẽ = " +sumle);
		System.out.println("Số chẵn = " +demchan);
		System.out.println("Số lẽ = " +demle);
		
		
		int max=mang[0];
		for (int i = 0; i < mang.length; i++) {
			if(mang[i]>max)
			{
				max=mang[i];
			}
		}
		int min=mang[0];
		for (int i = 0; i < mang.length; i++) {
			if(mang[i]<min)
			{
				min=mang[i];
			}
		}
		System.out.println("Max" +max);
		System.out.println("Min" +min);
	}

}
