package OOP_GiaDien_VKU;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Manager quanli = new Manager();
		Scanner nhap = new Scanner(System.in);
		while (true) {
			System.out.println("\n--- HỆ THỐNG QUẢN LÝ HÓA ĐƠN ---");
            System.out.println("1. Thêm hộ gia đình");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Sắp xếp giảm dần theo tiền điện");
            System.out.println("4. Sắp xếp tăng dần theo tiền nước");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            int choncn=nhap.nextInt();
    		nhap.nextLine();
    		if(choncn==1)
    		{
    			System.out.println("Nhập vào số hộ gia đình");
    			int sohogiadinh = nhap.nextInt();
        		nhap.nextLine();
    			for(int i=0;i<sohogiadinh;i++)
    			{
    				System.out.println("Nhập vào mã hộ gia đình thứ " +(i+1));
            		String mahogd=nhap.nextLine();
              		System.out.println("Nhập vào mã điện");
            		String madien=nhap.nextLine();
            		System.out.println("Nhập vào giá điện");
            		int giadien=nhap.nextInt();
            		nhap.nextLine();
             		System.out.println("Nhập vào mã nước");
            		String manuoc=nhap.nextLine();
            		System.out.println("Nhập vào giá nước");
            		int gianuoc=nhap.nextInt();
            		nhap.nextLine();
             		System.out.println("Nhập vào số chữ điện");
            		int sochudienc=nhap.nextInt();
              		System.out.println("Nhập vào số chữ nước");
            		int sochunuoc=nhap.nextInt();
              		nhap.nextLine();
            		Energy eng=new Energy(madien, giadien);
            		Water water=new Water(manuoc, gianuoc);
            		Family fml=new Family(mahogd, water, eng, sochudienc, sochunuoc);
            		quanli.themgiadinh(fml);	
    			}
        		System.out.println("đã thê thành công");
    		}
            else if (choncn==2)
            {
			  quanli.display();	
			}
            else if (choncn==3)
            {
			  quanli.sapxepgiamdansotiendien();	
			}
            else if (choncn==4)
            {
			  quanli.sapxeptangdansotiennuoc();	
			}
    		else if (choncn==0)
    		{
				System.out.println("Đã thoát");
				break;
			}
			//i++;
		}
	}
}
