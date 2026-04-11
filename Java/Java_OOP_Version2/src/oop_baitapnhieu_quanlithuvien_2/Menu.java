package oop_baitapnhieu_quanlithuvien_2;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		QuanLi ql = new QuanLi();
		Scanner nhap = new Scanner(System.in);
		while(true)
		{
			System.out.println("\n----- QUẢN LÝ THƯ VIỆN -----");
            System.out.println("1. Thêm mới tài liệu (Sách, Tạp chí, Báo)");
            System.out.println("2. Xóa tài liệu theo mã");
            System.out.println("3. Hiển thị thông tin tất cả tài liệu");
            System.out.println("4. Tìm kiếm tài liệu theo loại (Sách, Tạp chí, Báo)");
            System.out.println("5. Thoát");
            System.out.print("Mời bạn chọn: ");
            int chon=nhap.nextInt();
            nhap.nextLine();
            if(chon==1)
            {
            	System.out.print("Nhập mã tài liệu: ");
            	int matailieu = nhap.nextInt();
            	// Nhớ phải có dòng này để không bị "trôi" phần nhập chuỗi phía sau
            	nhap.nextLine(); 
            	System.out.print("Nhập tên nhà xuất bản: ");
            	String tennhaxb = nhap.nextLine();
            	System.out.print("Nhập số bản phát hành: ");
            	String sobanphathanh = nhap.nextLine();
                System.out.println("Chọn loại tài liệu");
                System.out.println("--- CHỌN LOẠI TÀI LIỆU CẦN THÊM ---");
                System.out.println("1. Thêm mới Sách");
                System.out.println("2. Thêm mới Tạp chí");
                System.out.println("3. Thêm mới Báo");
                System.out.print("Mời bạn chọn (1-3): ");
                int chontl = nhap.nextInt();
                nhap.nextLine(); // Dọn rác bộ đệm ngay sau khi nhập số
                if(chontl==1)
                {
                	System.out.print("Nhập tên tác giả: ");
                	String tentacgia = nhap.nextLine();

                	System.out.print("Nhập số trang: ");
                	int sotrang = nhap.nextInt();
                	nhap.nextLine(); // Dọn bộ đệm để lần sau nhập chuỗi không bị lỗi
                	Tailieu sach = new Sach(matailieu,tennhaxb,sobanphathanh,tentacgia,sotrang);
                	ql.themtailieu(sach);     
                	System.out.println("Đã thêm sách thành công");
                }
                else if(chontl==2)
                {
                	System.out.print("Nhập số phát hành: ");
                	int sophathanh = nhap.nextInt();

                	System.out.print("Nhập tháng phát hành: ");
                	int thangphathanh = nhap.nextInt();
                	nhap.nextLine(); // Dọn bộ đệm để lần sau nhập chuỗi không bị lỗi
                	Tailieu tc = new Tapchi(matailieu,tennhaxb,sobanphathanh,sophathanh,thangphathanh);
                	ql.themtailieu(tc);  

                	System.out.println("Đã thêm tạp chí thành công");
                }
                else if(chontl==3)
                {
                	System.out.print("Nhập ngày phát hành: ");
                	int ngayphathanh = nhap.nextInt();
                	nhap.nextLine(); // Dọn bộ đệm để lần sau nhập chuỗi không bị lỗi
                	Tailieu bao = new Bao(matailieu,tennhaxb,sobanphathanh,ngayphathanh);
                	ql.themtailieu(bao);    

                	System.out.println("Đã thêm báo thành công");
                }
            }
            else if (chon==2) 
            {
            	System.out.print("Nhập mã tài liệu: ");
            	int matailieu = nhap.nextInt();
            	ql.xoatl(matailieu);
			}
            else if (chon==3) 
            {
            	ql.hienthiall();
			}
            else if (chon==4) 
            {
             	System.out.print("Nhập vào tài liệu bạn muốn tìm: ");
                System.out.println("1. Tìm Sách");
                System.out.println("2. Tìm Tạp chí");
                System.out.println("3. Tìm Báo");
                System.out.print("Mời bạn chọn (1-3): ");
            	int tktl = nhap.nextInt();
            	nhap.nextLine();
            	if(tktl==1)
            	{
            		System.out.print("Nhập mã tài liệu: ");
                	int matailieu = nhap.nextInt();
                	nhap.nextLine();
                	ql.timkiemsach(matailieu);
            	}
            	else if(tktl==2)
            	{
            		System.out.print("Nhập mã tài liệu: ");
                	int matailieu = nhap.nextInt();
                	nhap.nextLine();
                	ql.timkiemtapchi(matailieu);
            	}
            	else if(tktl==3)
            	{
            		System.out.print("Nhập mã tài liệu: ");
                	int matailieu = nhap.nextInt();
                	nhap.nextLine();
                	ql.timkiembao(matailieu);
            	}
			}
            else if(chon==5)
            {
            	System.out.println("Đã Thoát");
            	break;
            }
		}
	}
}
