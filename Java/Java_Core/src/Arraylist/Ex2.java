package Arraylist;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
	     Random rd=new Random();
         Scanner nhap=new Scanner(System.in);
         ArrayList<Integer> mangso= new ArrayList<>();
         
         System.out.println("Nhập vào số phần tử mảng");
         int n=nhap.nextInt();
         for(int i=0;i<n;i++)
         {
        	 int phantu=rd.nextInt(-10,10);
        	 mangso.add(phantu);
         }
         System.out.println(mangso.toString());
         
         int countle=0;
         boolean cole=false;
         int sumle=0;

         for(int i=0;i<n;i++)
         {
        	if(mangso.get(i)%2!=0)
        	{
        		countle++;
        		cole=true;
        		sumle=sumle+mangso.get(i);
        	
        	}
         }
         System.out.println("số lẻ có trong mảng là " +countle);
         System.out.println("tổng số lẻ có trong mảng là " +sumle);
         int countchan=0;
         boolean cochan=false;
         int sumchan=0;
         for(int i=0;i<n;i++)
         {
        	if(mangso.get(i)%2==0)
        	{
        		countchan++;
        		cochan=true;
        		sumchan=sumchan+mangso.get(i);
        	}
         }
         System.out.println("số chẵn có trong mảng là " +countchan);
         System.out.println("tổng số chẵn có trong mảng là " +sumchan);
         
         
         boolean timthay=false;
         System.out.println("nhập vào phần tử cần tìm");
         int phantucantim=nhap.nextInt();
         for(int i=0;i<n;i++)
         {
        	if(phantucantim==mangso.get(i))
        	{
        	    
        		timthay=true;
              
        	}
         }
        if(timthay==true)
        {
            System.out.println("phần tử cần tìm là " + phantucantim);        	
        }
        else if (timthay==false) {
        	System.out.println("k có ");      
		}
         
         
	}
}
