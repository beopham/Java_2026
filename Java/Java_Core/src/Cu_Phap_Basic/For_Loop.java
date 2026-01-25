package Cu_Phap_Basic;

import java.util.Scanner;

public class For_Loop {
    public static void main(String[] args) {
    	
		Scanner nhap = new Scanner(System.in);
		System.out.println("Nhập vào bảng cửu chuong");
		
    	int bcc=nhap.nextInt();
    	int kq=0;
		for (int i=1;i<=10;i++)
		{
			kq=bcc*i;
		    System.out.println(bcc +" x " + i+" = " +kq);
		}
	}
}
