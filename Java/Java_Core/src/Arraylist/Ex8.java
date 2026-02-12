package Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<Integer> mang=new ArrayList<>();
     
     Scanner nhap=new Scanner(System.in);
     Random rd=new Random();
     System.out.println("Nhập vào số phần tử");
     int n=nhap.nextInt();
     for(int i=0;i<n;i++)
     {
    	 
          int phantu=rd.nextInt(0,100);
          mang.add(phantu);	 
     }
//     for(int i=0;i<n;i++)
//     {
//    	  System.out.println("Nhập vào phần tử thứ" +i );
//          int phantu=nhap.nextInt();
//          mang.add(phantu);	 
//     }

//     for(int i=0;i<n;i++)
//     {
//    	  System.out.print(mang.get(i));
//     }
     System.out.println(mang.toString());
     int phantule=0;
     int sumle=0;
     int phantuchan=0;
     int sumchan=0;
     for(int i=0;i<n;i++)
     {
    	 
       if(mang.get(i)%2!=0)
       {
    	   phantule++;
    	   sumle=sumle+mang.get(i);
       }
     } 
     for(int i=0;i<n;i++)
     {
    	 
       if(mang.get(i)%2==0)
       {
    	   phantuchan++;
    	   sumchan=sumchan+mang.get(i);
       }
     } 
  // Hiển thị kết quả cho số lẻ
     System.out.println("Số lượng phần tử lẻ: " + phantule);
     System.out.println("Tổng các phần tử lẻ: " + sumle);
     
     // Hiển thị kết quả cho số chẵn
     System.out.println("Số lượng phần tử chẵn: " + phantuchan);
     System.out.println("Tổng các phần tử chẵn: " + sumchan);
     
     System.out.println("nhập vào phàn tử cần tìm kiếm");
     int phantutimkiem=nhap.nextInt();
     int vitri=mang.get(0);
     boolean co=false;
     for(int i=0;i<n;i++)
     {
    	 
       if(mang.get(i)==phantutimkiem)
       {

    	   System.out.println("phân tử tìm kiếm là " +phantutimkiem);
    		 System.out.println("vị trí là " +i);

             co=true;
       }
     }
     if(co==false)
     {
    	 System.out.println("k có phần tử tỉm kiếm");
     }
     if(mang.contains(phantutimkiem))
     {
    	  System.out.println("phân tử tìm kiếm là " +phantutimkiem);
     }
     System.out.println("Săp xếp tăng dần");
     Collections.sort(mang);
     System.out.println("Max " +mang.get(n-1));
     System.out.println(mang.toString());
     System.out.println("Săp xếp giảm dần");
     Collections.sort(mang,Collections.reverseOrder());
     System.out.println(mang.toString());
     System.out.println("Min " +mang.get(n-1));
     
	}

}
