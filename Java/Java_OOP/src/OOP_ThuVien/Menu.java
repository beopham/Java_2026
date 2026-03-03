package OOP_ThuVien;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Quanlithemuon ql = new Quanlithemuon();
		Scanner nhap = new Scanner(System.in);
		while(true)
		{
			System.out.println("Menu quản lí sách");
			System.out.println("1.Thêm thông tin sinh viên mượn ");
			System.out.println("2.Xem thông tin sinh viên mượn ");
			System.out.println("3.Xóa thông tin sinh viên mượn ");
			System.out.println("4.Thoát");
			int chon=nhap.nextInt();
			nhap.nextLine();
			if(chon==1)
			{
				System.out.println("--- NHẬP THÔNG TIN SINH VIÊN ---");
			    System.out.print("Nhập họ tên: ");
			    String hoTen = nhap.nextLine();
			    System.out.print("Nhập tuổi: ");
			    int tuoi = Integer.parseInt(nhap.nextLine()); // Dùng cách này để tránh trôi lệnh line
			    System.out.print("Nhập lớp: ");
			    String lop = nhap.nextLine();
			    SinhVien sv=new SinhVien(hoTen, tuoi, lop);
			    System.out.println("--- NHẬP THÔNG TIN THẺ MƯỢN ---");
			    System.out.print("Nhập mã phiếu mượn: ");
			    String maPhieu = nhap.nextLine();
			    System.out.print("Nhập ngày mượn (số): ");
			    int ngayM = Integer.parseInt(nhap.nextLine());
			    System.out.print("Nhập hạn trả (số): ");
			    int hanT = Integer.parseInt(nhap.nextLine());
			    System.out.print("Nhập số hiệu sách: ");
			    String soHieu = nhap.nextLine();
			    TheMuon tm=new TheMuon(maPhieu, ngayM, hanT, soHieu, sv);
			    ql.them(tm);
			    System.out.println("=> Đã thêm thành công!");
			}
			else if (chon==2)
			{
				ql.hienthi();
			}
			else if (chon==3)
			{
				   System.out.print("Nhập mã phiếu mượn: ");
				    String maPhieu = nhap.nextLine();
				    ql.xoa(maPhieu);
			}
			else if (chon==4)
			{
				   System.out.print("đã coook ");
				   break;
			}
		}
	}
}
