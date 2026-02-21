package OOP_TailIeu;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		QLTL quanli = new QLTL();
		Scanner nhap = new Scanner(System.in);
		while (true) {
			System.out.println("\n--- QUẢN LÝ THƯ VIỆN ---");
			System.out.println("1. Thêm mới tài liệu");
			System.out.println("2s. Hiển thị thông tin tài liệu");
			System.out.println("3. Xóa tài liệu theo mã");
			System.out.println("4. Tìm kiếm tài liệu theo loại và mã");
			System.out.println("5. Thoát");
			System.out.print("Chọn chức năng: ");
			int chon = nhap.nextInt();
			nhap.nextLine();
			if (chon == 1) {
				System.out.println("Chọn loại muốn thêm: a. Sách | b. Tạp chí | c. Báo");
				String loai = nhap.nextLine();

				// Nhập các thuộc tính chung
				System.out.print("Nhập mã tài liệu: ");
				String ma = nhap.nextLine();
				System.out.print("Nhập tên NXB: ");
				String nxb = nhap.nextLine();
				System.out.print("Nhập số bản phát hành: ");
				int soBan = nhap.nextInt();
				nhap.nextLine();

				if (loai.equalsIgnoreCase("a")) {
					System.out.print("Nhập tên tác giả: " );
					String tg = nhap.nextLine();
					System.out.print("Nhập số trang: ");
					int st = nhap.nextInt();
					quanli.themtl (new Sach(ma, nxb, soBan, tg, st));
				} else if (loai.equalsIgnoreCase("b")) {
					System.out.print("Nhập số phát hành: ");
					int sph = nhap.nextInt();
					System.out.print("Nhập tháng phát hành: ");
					int tph = nhap.nextInt();
					quanli.themtl (new TapChi(ma, nxb, soBan, sph, tph));
				} else if (loai.equalsIgnoreCase("c")) {
					System.out.print("Nhập ngày phát hành: ");
					int nph = nhap.nextInt();
					quanli.themtl(new Bao(ma, nxb, soBan, nph));
				}
			}
			else if (chon==2)
			{
				quanli.hienthi();
			}
			else if (chon==3)
			{
				
				System.out.print("Nhập mã tài liệu: ");
				String ma = nhap.nextLine();
				quanli.xoa(ma);
				
			}
			else if (chon==4)
			{
				System.out.print("Nhập loại tài liệu: ");
				String loai = nhap.nextLine();
				if(loai.equalsIgnoreCase("sách"))
				{
					System.out.print("Nhập mã tài liệu sách: ");
					String ma = nhap.nextLine();	
					quanli.tiemkiemtheosach(ma);
				}
				else if(loai.equalsIgnoreCase("tạp chí"))
				{
					System.out.print("Nhập mã tài liệu tạp chi: ");
					String ma = nhap.nextLine();	
					quanli.tiemkiemtheosach(ma);
				}
				else if(loai.equalsIgnoreCase("báo"))
				{
					System.out.print("Nhập mã tài liệu báo: ");
					String ma = nhap.nextLine();	
					quanli.tiemkiemtheosach(ma);
				}
	
			}
			else if (chon==5)
			{
				System.out.println("đã  thoát");
				break;
	
			}
		}
	}
}
