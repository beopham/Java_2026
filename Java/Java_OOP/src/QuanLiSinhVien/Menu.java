package QuanLiSinhVien;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		QLNV quanli = new QLNV();

		Scanner nhap = new Scanner(System.in);
		while (true) {
			System.out.println("\n============================================");
			System.out.println("        ---------- MENU ----------          ");
			System.out.println("1. Thêm sinh viên vào danh sách");
			System.out.println("2. In danh sách sinh viên");
			System.out.println("3. Kiểm tra danh sách rỗng");
			System.out.println("4. Lấy số lượng sinh viên");
			System.out.println("5. Tìm kiếm sinh viên theo tên");
			System.out.println("6. Xóa sinh viên theo tên");
			System.out.println("7. Cập nhật thông tin sinh viên theo tên");
			System.out.println("0. Thoát chương trình");
			System.out.println("============================================");
			System.out.print("Vui lòng chọn: ");
			int luaChon = nhap.nextInt();
			nhap.nextLine(); // Chống trôi lệnh
			if (luaChon == 1) {
				System.out.println("Nhập tên sinh viên:"); // Dùng println để người dùng xuống dòng nhập
				String ten = nhap.nextLine();

				System.out.println("Nhập tuổi sinh viên:");
				int tuoi = nhap.nextInt();
				nhap.nextLine(); // Dọn dẹp dấu Enter sau khi nhập số (BẮT BUỘC)

				System.out.println("Nhập địa chỉ sinh viên:");
				String dc = nhap.nextLine();

				System.out.println("Nhập điểm GPA:");
				double gpa = nhap.nextDouble();
				nhap.nextLine(); // Dọn dẹp dấu Enter cuối cùng cho sạch sẽ
				SinhVien sv = new SinhVien(ten, dc, tuoi, gpa);
				quanli.them(sv);
			} else if (luaChon == 2) {
				quanli.hienthi();
			}else if (luaChon == 3) {
				quanli.kiemtrarong();
			}else if (luaChon == 4) {
			
				System.out.println("Số lượng sinh viên là" +quanli.soluongsinhvien());
			}else if (luaChon == 5) {
				System.out.println("Nhập vào tên sinh viên");
				String ten=nhap.nextLine();
				quanli.kiemtrasinhvientrenten(ten);
			}else if (luaChon == 6) {
				System.out.println("Nhập vào tên sinh viên");
				String ten=nhap.nextLine();
				quanli.xoasinhvientheoten(ten);
			}else if (luaChon == 7) {
				System.out.println("Nhập vào tên sinh viên");
				String ten=nhap.nextLine();
				quanli.capNhatSinhVien(ten);
			}else if (luaChon == 0) {
				System.out.println("Đã Thoát");
				break;
			}
		}

	}
}
