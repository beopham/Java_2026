package Array;

import java.util.Random;
import java.util.Scanner;

public class Ex6_Cohieu {

	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		System.out.println("Nhập vào số phân tủ mảng");
		int n=nhap.nextInt();
		Random rd=new Random();
		int mang[] =new int [n];
		for(int i=0;i<mang.length;i++)
		{
			mang[i]=rd.nextInt(-50,50);
		}
		for (int i = 0; i < mang.length; i++) {
			System.out.print(mang[i] + " ");
		}
		System.out.println("Nhập vào phần tử cần tìm");
		int k=nhap.nextInt();
		// đặt cờ hiệu
		boolean tim=false;
		for (int i = 0; i < mang.length; i++) {
			if(k==mang[i])
			{
				tim=true;
				break;
			}
		}
		if(tim==true)
		{
			System.out.println("Phân tử b tìm đã có nha đó là " + k);
		}
		else if(tim==false)
		{
			System.out.println("Phân tử b tìm k có tới ");
			
		}
	}

}
