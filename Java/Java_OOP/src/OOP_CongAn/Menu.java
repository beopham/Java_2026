package OOP_CongAn;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		QuanLiPhuongTien qlpt = new QuanLiPhuongTien();
		Scanner nhap = new Scanner(System.in);
		while (true) {
			System.out.println("--- Chọn loại phương tiện cần thêm ---");
			System.out.println("1. Thêm Phương Tiện");
			System.out.println("2. Xem Phương Tiện");
			System.out.println("3. Xóa phương tiện theo ID");
			System.out.println("4. Tìm kiếm theo Hãng và Màu");
			System.out.println("5. Thoát");
			System.out.print("Lựa chọn: ");
			int chon = Integer.parseInt(nhap.nextLine()); // Tránh trôi dòng
			if (chon == 1) {
				System.out.println("1. Thêm Ô tô");
				System.out.println("2. Thêm Xe máy");
				System.out.println("3. Thêm Xe tải");
				System.out.print("Lựa chọn: ");
				int chonpt = Integer.parseInt(nhap.nextLine()); // Tránh trôi dòng
				if (chonpt == 1) {
					System.out.println("Nhập ID: ");
					String id = nhap.nextLine();

					System.out.println("Nhập Hãng SX: ");
					String hang = nhap.nextLine();

					System.out.println("Nhập Năm SX: ");
					int nam = Integer.parseInt(nhap.nextLine());

					System.out.println("Nhập Giá bán: ");
					double gia = Double.parseDouble(nhap.nextLine());

					System.out.println("Nhập Màu xe: ");
					String mau = nhap.nextLine();
					System.out.println("Số chỗ ngồi: ");
					int cho = Integer.parseInt(nhap.nextLine());
					System.out.println("Kiểu động cơ: ");
					String dc = nhap.nextLine();
					PhuongTien ptoto = new OTo(id, hang, nam, gia, mau, cho, dc);
					qlpt.Them(ptoto);
					System.out.println("=> Đã thêm Ô tô thành công!");

				} else if (chonpt == 2) {
					System.out.println("Nhập ID: ");
					String id = nhap.nextLine();

					System.out.println("Nhập Hãng SX: ");
					String hang = nhap.nextLine();

					System.out.println("Nhập Năm SX: ");
					int nam = Integer.parseInt(nhap.nextLine());

					System.out.println("Nhập Giá bán: ");
					double gia = Double.parseDouble(nhap.nextLine());

					System.out.println("Nhập Màu xe: ");
					String mau = nhap.nextLine();
					System.out.println("Nhập Công suất: ");
					double congSuat = Double.parseDouble(nhap.nextLine());
					// Upcasting từ XeMay lên PhuongTien
					PhuongTien ptxemay = new XeMay(id, hang, nam, gia, mau, congSuat);
					qlpt.Them(ptxemay);
					System.out.println("=> Đã thêm Xe máy thành công!");
				} else if (chonpt == 3) {
					System.out.println("Nhập ID: ");
					String id = nhap.nextLine();

					System.out.println("Nhập Hãng SX: ");
					String hang = nhap.nextLine();

					System.out.println("Nhập Năm SX: ");
					int nam = Integer.parseInt(nhap.nextLine());

					System.out.println("Nhập Giá bán: ");
					double gia = Double.parseDouble(nhap.nextLine());

					System.out.println("Nhập Màu xe: ");
					String mau = nhap.nextLine();
					System.out.println("Nhập Trọng tải (tấn): ");
					double trongTai = Double.parseDouble(nhap.nextLine());

					// Upcasting từ XeTai lên PhuongTien
					PhuongTien ptxetai = new XeTai(id, hang, nam, gia, mau, trongTai);
					qlpt.Them(ptxetai);
					System.out.println("=> Đã thêm Xe tải thành công!");
				}
			} else if (chon == 2) {
				qlpt.hienthi();
			} else if (chon == 3) {
				System.out.println("Nhập ID: ");
				String id = nhap.nextLine();
				qlpt.xoa(id);
			} else if (chon == 4) {
				System.out.println("1. Tìm Ô tô");
				System.out.println("2. Tìm Xe máy");
				System.out.println("3. Tìm Xe tải");
				int chontk = Integer.parseInt(nhap.nextLine()); // Tránh trôi dòng
				if (chontk == 1) {
					System.out.println("Nhập Hãng SX: ");
					String hang = nhap.nextLine();
					System.out.println("Nhập Màu xe: ");
					String mau = nhap.nextLine();
					qlpt.timkiemtheoOto(hang, mau);
				}
				if (chontk == 2) {
					System.out.println("Nhập Hãng SX: ");
					String hang = nhap.nextLine();
					System.out.println("Nhập Màu xe: ");
					String mau = nhap.nextLine();
					qlpt.timkiemtheoXemay(hang, mau);
				}
				if (chontk == 3) {
					System.out.println("Nhập Hãng SX: ");
					String hang = nhap.nextLine();
					System.out.println("Nhập Màu xe: ");
					String mau = nhap.nextLine();
					qlpt.timkiemtheoXetai(hang, mau);
				}
			} else if (chon == 4) {
				System.out.println("Đã Thoát");
				break;
			}
		}
	}
}
