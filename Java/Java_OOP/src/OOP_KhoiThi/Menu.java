package OOP_KhoiThi;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		QuanLiThiSinh quanli = new QuanLiThiSinh();
		Scanner nhap = new Scanner(System.in);
		while (true) {
			System.out.println("=========================");
			System.out.println("1.Thêm thí sinh");
			System.out.println("2.Hiển Thị Danh Sách");
			System.out.println("3.Tìm Kiếm Theo số báo danh");
			System.out.println("4.Thoát");
			System.out.print("Chọn chức năng: ");
			int chon = nhap.nextInt();
			nhap.nextLine();
			if (chon == 1) {
				System.out.println("Bạn muốn thêm thí sinh khối nào ?");
				System.out.println("A:Khối A");
				System.out.println("B:Khối B");
				System.out.println("C:Khối C");
				System.out.println("Mời bạn chọn");
				String chonkhoi = nhap.nextLine();
				if (chonkhoi.equalsIgnoreCase("A")) {

					System.out.println("nhập số báo danh");
					String soBaoDanh = nhap.nextLine();
					System.out.println("nhập họ tên");
					String hoTen = nhap.nextLine();
					System.out.println("nhập địa chỉ");
					String diachi = nhap.nextLine();
					System.out.println("nhập mức ưu tiên");
					int mucutien = nhap.nextInt();
					nhap.nextLine();
					ThiSinhKhoiA tska=new ThiSinhKhoiA(soBaoDanh, hoTen, diachi, mucutien);
					quanli.themThisinh(tska);
				}
				else if (chonkhoi.equalsIgnoreCase("B")) {

					System.out.println("nhập số báo danh");
					String soBaoDanh = nhap.nextLine();
					System.out.println("nhập họ tên");
					String hoTen = nhap.nextLine();
					System.out.println("nhập địa chỉ");
					String diachi = nhap.nextLine();
					System.out.println("nhập mức ưu tiên");
					int mucutien = nhap.nextInt();
					nhap.nextLine();
					ThiSinhKhoiB tskb=new ThiSinhKhoiB(soBaoDanh, hoTen, diachi, mucutien);
					quanli.themThisinh(tskb);
				}
				else if (chonkhoi.equalsIgnoreCase("C")) {

					System.out.println("nhập số báo danh");
					String soBaoDanh = nhap.nextLine();
					System.out.println("nhập họ tên");
					String hoTen = nhap.nextLine();
					System.out.println("nhập địa chỉ");
					String diachi = nhap.nextLine();
					System.out.println("nhập mức ưu tiên");
					int mucutien = nhap.nextInt();
					nhap.nextLine();
					ThiSinhKhoiC tskC=new ThiSinhKhoiC(soBaoDanh, hoTen, diachi, mucutien);
					quanli.themThisinh(tskC);
				}
				else {
					System.out.println("k có khối đó");
				}
			}
			else if (chon==2) 
			{
				 quanli.hienthi();
			}
			else if (chon==3) 
			{
				System.out.print("Nhập số báo danh: ");
				String ma = nhap.nextLine();
				quanli.timkiem(ma);
			}
			else if (chon==4)
			{
				System.out.println("đã  thoát");
				break;
	
			}
		}
	}
}
