package OOP_Youtube;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		QuanLi quanlikenh = new QuanLi();
		Scanner nhap = new Scanner(System.in);
		while (true) {
			System.out.println("menu quản lí kênh youtube");
			System.out.println("1.Nhập vào kênh youtube");
			System.out.println("2.Xuất all kênh youtube");
			System.out.println("3.Doanh thu cho từng kênh youtube");
			System.out.println("4.Tìm Kiếm");
		    System.out.println("5.Đã Thoát");
			System.out.println("Nhập vào sự lựa chọn ");
			int chon = nhap.nextInt();
			nhap.nextLine();
			if (chon == 1) {
				System.out.println("1.Nhập vào kênh âm nhạc");
				System.out.println("2.Nhập vào kênh nấu ăn");
				System.out.println("Nhập vào sự lựa chọn ");
				int chonk = nhap.nextInt();
				nhap.nextLine();
				if (chonk == 1) {
					System.out.println("Nhập vào tên kênh");
					String tenkenh = nhap.nextLine();
					System.out.println("Nhập vào tên chủ kênh");
					String tenchukenh = nhap.nextLine();
					System.out.println("Nhập vào số lượng người đăng kí");
					double Soluongnguoidanhgki = nhap.nextDouble();
					System.out.println("Nhập vào số lượng người bài hát trên 1 triệu");
					double soluongbaihattren1trieu = nhap.nextDouble();
					System.out.println("Nhập vào số lượng hợp đồng đóng quảng cáo");
					double soluonghopdongquangcao = nhap.nextDouble();
					nhap.nextLine();
					KenhAmNhac kan = new KenhAmNhac(tenkenh, tenchukenh, Soluongnguoidanhgki, soluongbaihattren1trieu,
							soluonghopdongquangcao);
					quanlikenh.them(kan);
				} else if (chonk == 2) {
					System.out.println("Nhập vào tên kênh");
					String tenkenh = nhap.nextLine();
					System.out.println("Nhập vào tên chủ kênh");
					String tenchukenh = nhap.nextLine();
					System.out.println("Nhập vào số lượng người đăng kí");
					double Soluongnguoidanhgki = nhap.nextDouble();
					System.out.println("Nhập vào tổng số lượng xem kênh");
					double tongsoluongxemkenh = nhap.nextDouble();
					nhap.nextLine();
					KenhNauAn kna = new KenhNauAn(tenkenh, tenchukenh, Soluongnguoidanhgki, tongsoluongxemkenh);
					quanlikenh.them(kna);

				}
			} else if (chon == 2) {
				quanlikenh.hienthiall();
			} else if (chon == 3) {
				quanlikenh.doanhthucaonhat();
			} else if (chon == 4) {
				System.out.println("Nhập vào tên kênh");
				String tenkenh = nhap.nextLine();
				quanlikenh.timkiem(tenkenh);

			} else if (chon == 5) {
				System.out.println("đã thoát");
				break;
			}

		}
	}
}
