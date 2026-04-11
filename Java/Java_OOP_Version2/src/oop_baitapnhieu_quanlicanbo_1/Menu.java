package oop_baitapnhieu_quanlicanbo_1;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		QuanLi ql = new QuanLi();

		Scanner nhap = new Scanner(System.in);
		while (true) {
			System.out.println("------ QUẢN LÝ CÁN BỘ ------");
			System.out.println("1. Thêm mới cán bộ");
			System.out.println("2. Tìm kiếm theo họ tên");
			System.out.println("3. Hiển thị thông tin danh sách cán bộ");
			System.out.println("4. Hiển thị danh sách Kỹ sư");
			System.out.println("5. Hiển thị danh sách Công nhân");
			System.out.println("6. Hiển thị danh sách Nhân viên");
			System.out.println("7. Thoát chương trình");
			System.out.print("Nhập lựa chọn của bạn: ");
			int chon = nhap.nextInt();
			nhap.nextLine();
			if (chon == 1) {

				System.out.println("Nhập vào họ tên");
				String hoten = nhap.nextLine();
				System.out.println("Nhập vào tuổi");
				int tuoi = nhap.nextInt();
				nhap.nextLine();
				System.out.println("Nhập vào họ giới tính");
				String gioitinh = nhap.nextLine();
				System.out.println("Nhập vào địa chỉ");
				String diachi = nhap.nextLine();
				System.out.println("Mời bạn chọn loại cán bộ");
				System.out.println("1.Công Nhân");
				System.out.println("2.Kỹ Sư");
				System.out.println("3.Nhân Viên");
				int loaicanbo = nhap.nextInt();
				nhap.nextLine();
				if (loaicanbo == 1) {
					System.out.println("Nhập vào bậc(1-10)");
					int bat = nhap.nextInt();
					nhap.nextLine();
					CanBo cn = new Congnhan(hoten, tuoi, gioitinh, diachi, bat);
					ql.themcanbo(cn);
				} else if (loaicanbo == 2) {
					System.out.println("Nhập vào ngành đạo tạo");
					String nganhdaotao = nhap.nextLine();
					CanBo ks = new Kysu(hoten, tuoi, gioitinh, diachi, nganhdaotao);
					ql.themcanbo(ks);
				} else if (loaicanbo == 3) {
					System.out.println("Nhập vào công việc");
					String congviec = nhap.nextLine();
					CanBo nv = new Nhanvien(hoten, tuoi, gioitinh, diachi, congviec);
					ql.themcanbo(nv);
				}

			} else if (chon == 2) {
				System.out.println("Nhập vào họ tên");
				String hoten = nhap.nextLine();
				ql.timkiemtheoten(hoten);
			} else if (chon == 3) {

				ql.hienthiall();
			} else if (chon == 4) {

				ql.hienthikysu();
				;
			} else if (chon == 5) {

				ql.hienthicongnhan();
			} else if (chon == 6) {

				ql.hienthinhanvien();
			} else if (chon == 7) {

			    System.out.println("đã thoát");
			    break;
			}
		}
	}

}
