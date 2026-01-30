package Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ArrayList<Integer> mangso= new ArrayList<>();
         Random rd=new Random();
         Scanner nhap=new Scanner(System.in);

         System.out.println("Nhập vào số phân tử");
         int n=nhap.nextInt();
//         for(int i=0;i<n;i++)
//         {
//        	 System.out.println("Nhập vào phân tử thứ " +(i+1));
//        	 int phantu=nhap.nextInt();
//        	 mangso.add(phantu);
//         }
         for(int i=0;i<n;i++)
         {
        	 int phantu=rd.nextInt(-100,200);
        	 mangso.add(phantu);
         }
         for(int kq : mangso)
         {
        	 System.out.println(kq);
         }
         System.out.println("Lấy phần tử đầu tiên");
         System.out.println(mangso.get(0));
         System.out.println( mangso.toString());
         int max= Collections.max(mangso);
         System.out.println("max "+ max);
         
         
         int size_mang=mangso.size();
         System.out.println("kích thước mảng " + size_mang);
         System.out.println("mảng sắp xếp tăng dần là");
         Collections.sort(mangso);
         System.out.println( mangso.toString());
         System.out.println("nhập vào phân tử b muốn tìm kiếm lớn thứ" );
         int timkiemmax=nhap.nextInt();
         if(timkiemmax>size_mang)
         {
        	   
             System.out.println("phần tử b tìm k có nha");
         }
         else {
        	
        	 System.out.println("phần tử lớn thứ " + timkiemmax + " là " + mangso.get(n-timkiemmax));
		}
         
         // cập nhập lại giá trị mới
         mangso.set(3,911);
         System.out.println( mangso.toString());
         
         System.out.println("mảng đảo ngược");
         Collections.reverse(mangso);
         System.out.println( mangso.toString());
         
         int max_nha=mangso.get(0);
         for (int i=0;i<n;i++)
         {
        	 if(mangso.get(i) > max_nha)
        	 {
        		 max_nha=mangso.get(i);
        	 }
         }
         System.out.println("max " + max_nha);
	}

}
