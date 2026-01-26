package Array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		Random rd=new Random();
		System.out.println("Bạn muốn random bnh số");
		int n=nhap.nextInt();
		int mangso[] =new int [n];
		for (int i=0;i<n;i++)
		{
			mangso[i]=rd.nextInt(1,50);
		}
		for (int i=0;i<n;i++)
		{
			System.out.print(mangso[i] +" ");
		}
		System.out.println("");
		Arrays.sort(mangso); // sắp xếp mảng
		System.out.println("mảng sau khi sắp xếp tăng dần");
		for (int i=0;i<n;i++)
		{
			System.out.print(mangso[i] +" ");
		}
		System.out.println("");
		System.out.println("Min = "+ mangso[0] +" ");
		System.out.println("Max = "+ mangso[n-1] +" ");
		
	    
		System.out.println("bạn muốn tìm kiếm phân tử lớn thứ ????");
	    int phantumax=nhap.nextInt();
	    System.out.print("Phần tử lớn thứ " + phantumax+ " là "+ mangso[n-phantumax] +" ");
	
	}

}
