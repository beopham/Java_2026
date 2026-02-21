package Java_Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
     
		Scanner nhap=new Scanner(System.in);
		System.out.println("Nhập vào số lượng phần tử");
		Random rd=new Random();
		int n=nhap.nextInt();
//		int mang[] = new int[n];
//		for(int i=0;i<n;i++)
//		{
//			int phantu=rd.nextInt(0,10);
//			mang[i]=phantu;
//		}
//		for(int i= 0;i<n;i++)
//		{
//			System.out.print(mang[i] +" ");
//		}
//        Arrays.stream(mang).forEach((i) ->{System.out.println(i);
//        });
		
		
		ArrayList<Integer> mangso=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			int phantu=rd.nextInt(0,10);
			mangso.add(phantu);
		}
//		mangso.stream().filter(i->i>5) .forEach((i) ->{System.out.println(i);});
//
//		mangso.removeIf(null)
//		mangso.stream().forEach((i) ->{System.out.println(i);});
		
	    mangso.stream().sorted().forEach((i) ->{System.out.println(i);});
	    Collections.sort(mangso, Collections.reverseOrder());
	    mangso.stream().forEach((i) ->{System.out.println(i);});
	}
	
}
