package Bai_Tap_Loop;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		
		System.out.println("Nhập vào mật khẩu");
		String mk=nhap.nextLine();
		
		while(true)
		{
			if(mk.equals("123"))
			{
				System.out.println("mật khẩu đúng");
				break;
			}
			else 
			{
				System.out.println("mật khẩu sai");
				System.out.println("mời nhập lại");
				mk = nhap.nextLine(); // QUAN TRỌNG: Phải cho người ta nhập lại ở đây
			}
			
		}
	}
}
