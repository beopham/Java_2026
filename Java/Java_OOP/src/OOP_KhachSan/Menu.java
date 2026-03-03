package OOP_KhachSan;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		ArrayList<KhachSan> khachsan = new ArrayList<KhachSan>();
		KhachSan quanliks = new KhachSan();
		Scanner nhap = new Scanner(System.in);
		while (true) {
			System.out.println("1:Thêm ng thuê phòng");
			System.out.println("2:Hiển thị ng thuê phòng");
			System.out.println("3:Xoá ng thuê phòng");
			System.out.println("4:Tính tiền thuê phòng");
			System.out.println("5:Thoát");
			System.out.println("Mời bạn chọn ");
			int chon = nhap.nextInt();
			nhap.nextLine();
			if (chon == 1) {
				System.out.println("Nhập vào số ngày thuê");
				int ngaythue = nhap.nextInt();
				nhap.nextLine();
				System.out.println("Nhập vào loại phòng");
				String loaiphong = nhap.nextLine();
				System.out.println("Nhập vào tên");
				String ten = nhap.nextLine();
				System.out.println("Nhập vào tuổi");
				int tuoi = nhap.nextInt();
				nhap.nextLine();
				System.out.println("Nhập vào cmnd");
				String cmnd = nhap.nextLine();
				Nguoi ng1 = new Nguoi(ten, tuoi, cmnd);
				ArrayList<Nguoi> nguoi = new ArrayList<Nguoi>();
				nguoi.add(ng1);
				quanliks = new KhachSan(ngaythue, loaiphong, nguoi);
				khachsan.add(quanliks);
			} else if (chon == 2) {
				for(KhachSan ks: khachsan)
				{
					ks.display();
				}
			} else if (chon == 3) {
				System.out.println("Nhập vào cmnd");
				String cmnd = nhap.nextLine();
				quanliks.xoa(khachsan, cmnd);
			} else if (chon == 4) {
				System.out.println("Nhập vào cmnd");
				String cmnd = nhap.nextLine();
				quanliks.tinhtien(khachsan, cmnd);

			} else if (chon == 5) {
				System.out.println("thoát");
				break;
			}
		}
	}
}
