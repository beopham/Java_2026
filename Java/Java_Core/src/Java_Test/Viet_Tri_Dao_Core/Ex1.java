package Java_Test.Viet_Tri_Dao_Core;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
    
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner nhap=new Scanner(System.in);
      System.out.println("Nhập vào số phân tử mảng");
      int n=nhap.nextInt();
      
      int mang[] =new int[n];
      for (int i=0;i<n;i++)
      {
    	  System.out.println("Nhập vào phần tử thứ " + i);
    	  mang[i]=nhap.nextInt();
      }
    

      while(true)
      {
    	  System.out.println(Arrays.toString(mang));
          System.out.println("================menu====================");
          System.out.println("1. tính tổng số lẻ");
          System.out.println("2. tính tổng số chẵn chia hết cho 5");
          System.out.println("3. tính tổng số nguyên tố ");
          System.out.println("mời bạn chọn menu");
          int menu=nhap.nextInt();
         
          if(menu==1)
          {
        	  int sumle=0;
        	  for (int i=0;i<n;i++)
              {
            	 if(mang[i]%2!=0)
            	 {
            		 System.out.println("Số lẻ năm ở vị trí "+i+ " là " + +mang[i]);
            		 sumle=sumle+mang[i];
            	 }
              }
        	  System.out.println("Tổng các số lẻ là " +sumle );
             
          }
          else if(menu==2)
          {
              int sumChanChia5 = 0; // Gán bằng 0 như mình đã thảo luận
              for (int i = 0; i < n; i++)
              {
                  // Điều kiện: Vừa chẵn (%) vừa chia hết cho 5
                  if(mang[i] % 2 == 0 && mang[i] % 5 == 0)
                  {
                      System.out.println("Số chẵn và chia hết cho 5 năm ở vị trí "+i +" là " +mang[i]);
                	  sumChanChia5 = sumChanChia5 + mang[i];
                  }
              }
              System.out.println("Tổng các số chẵn và chia hết cho 5 là: " + sumChanChia5);
          }
          else if(menu==3)
          {
        	  int sumsnt=0;
        	  for (int i=0;i<n;i++)
              {
            	 if(isPrime(mang[i]))
            	 {
            		 System.out.println("Số nguyên số năm ở vị trí " +i+ "l à " +mang[i]);
            		 sumsnt=sumsnt+mang[i];
            	 }
              }
        	  System.out.println("Tổng các số nguyên số là " +sumsnt );
             
          }
    	  nhap.nextLine();
    	  System.out.println("Bạn muốn tiếp tục hay thoát vòng lặp");
    	  System.out.println("Nếu tiếp tục thì bấm phím bất kì để tiếp tục");
    	  System.out.println("Nếu thoát thì bấm n hoặc N");
    	  String thoat=nhap.nextLine();
    	  if(thoat.equalsIgnoreCase("n"))
    	  {
    		  System.out.println("bạn đã thoát vòng lặp");
    		  break;
    	  }
    	  
      }
    
      
	}

}
