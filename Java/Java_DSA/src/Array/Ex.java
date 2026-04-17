package Array;

import java.util.Scanner;

public class Ex {
	public static void main(String[] args) {
        Scanner nhap=new Scanner(System.in);
        System.out.println("Nhập vào số lượng phần tử mảng");
        int n=nhap.nextInt();
        int mang[] =new int[n];
        for(int i=0;i<n;i++)
        {
        	System.out.println("Nhập phần tử thứ " +(i+1));
        	mang[i]=nhap.nextInt();
        	
        }
        for(int i=0;i<n;i++)
        {
        	System.out.print(mang[i] +" ");
        }
        
	}
}
