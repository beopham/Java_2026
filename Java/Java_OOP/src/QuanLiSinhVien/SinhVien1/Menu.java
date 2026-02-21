package QuanLiSinhVien.SinhVien1;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QLSV quanli = new QLSV();
		SinhVien sv = new SinhVien();
		Scanner nhap = new Scanner(System.in);

		while (true) {
			System.out.println("\n========= MENU QUẢN LÝ SINH VIÊN =========");
			System.out.println("1. Thêm sinh viên mới");
			System.out.println("2. Hiển thị danh sách sinh viên");
			System.out.println("3. Tìm kiếm sinh viên theo ID");
			System.out.println("4. Sửa sinh viên theo ID");
			System.out.println("5. Xóa sinh viên theo ID");
			System.out.println("6. Sắp xếp sinh viên theo điểm tăng dần");
			System.out.println("7. Lọc sinh viên có GPA > 3.0");
			System.out.println("0. Thoát chương trình");
			System.out.print("Nhập lựa chọn của bạn: ");
			int chon = nhap.nextInt();
			if (chon == 1) {
				System.out.println("Nhập ID sinh viên");
				int id = nhap.nextInt();
				nhap.nextLine();
				System.out.println("Nhập tên sinh viên");
				String ten = nhap.nextLine();
				System.out.println("Nhập tuổi sinh viên");
				int tuổi = nhap.nextInt();
				System.out.println("Nhập gpa sinh viên");
				double gpa = nhap.nextDouble();
				sv = new SinhVien(id, ten, tuổi, gpa);
				quanli.themsinhvien(sv);
			} else if (chon == 2) {
				quanli.hienthi();
			} else if (chon == 3) {
				System.out.println("Nhập ID sinh viên");
				int id = nhap.nextInt();
				quanli.timkiemsvtheoTen(id);
			} else if (chon == 4) {
				System.out.println("Nhập ID sinh viên");
				int id = nhap.nextInt();
				quanli.suasinhvientheoID(id);
			} else if (chon == 5) {
				System.out.println("Nhập ID sinh viên");
				int id = nhap.nextInt();
				quanli.xoasinhvientheoID(id);
			} else if (chon == 6) {
				quanli.sapxepsinhvientheodiemtangdan();
			} else if (chon == 7) {
				quanli.laysinhvientren3();

			} else if (chon == 0) {
			     System.out.println("Thoát chương trình");
			     break;
			}
		}
	}

}
