package Array;

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
	}

}
