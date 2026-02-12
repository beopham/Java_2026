package QuanLiSinhVien;

import java.util.ArrayList;
import java.util.Scanner;

public class QLNV {
	private ArrayList<SinhVien> danhSachSinhVien;

	public QLNV() {
		this.danhSachSinhVien = new ArrayList<>();
	}

	public QLNV(ArrayList<SinhVien> danhSachSinhVien) {
		this.danhSachSinhVien = danhSachSinhVien;
	}

	public void them(SinhVien sv) {
		danhSachSinhVien.add(sv);
	}

	public void hienthi() {
		for (SinhVien sv : danhSachSinhVien) {
			sv.display();
		}
	}

	public void kiemtrarong() {
		if (danhSachSinhVien.isEmpty()) {
			System.out.println("Sinh Viên rỗng");
		}
	}

	public int soluongsinhvien() {
		int kq = danhSachSinhVien.size();
		return kq;
	}

	public void kiemtrasinhvientrenten(String ten) {
		boolean timthay = false;
		for (SinhVien sv : danhSachSinhVien) {
			if (sv.getName().equalsIgnoreCase(ten)) {
				timthay = true;
				System.out.println("Tìm Thấy sinh viên");
				sv.display();
			}
			if (timthay == false) {

				System.out.println("K Tìm Thấy sinh viên");

			}
		}

	}

	public void xoasinhvientheoten(String ten) {

		danhSachSinhVien.removeIf(sv -> sv.getName().equalsIgnoreCase(ten));
		System.out.println("Đã Xoá");

	}

	public void capNhatSinhVien(String ten) {
		Scanner nhap = new Scanner(System.in); // Đưa Scanner ra ngoài vòng lặp cho sạch code
		boolean timThay = false; // Thêm biến này để báo nếu không tìm thấy ai

		for (SinhVien sv : danhSachSinhVien) {
			if (sv.getName().equalsIgnoreCase(ten)) {
				timThay = true;
				System.out.println("--- Thông tin hiện tại ---");
				sv.display();

				System.out.print("Nhập địa chỉ mới: ");
				String diachimoi = nhap.nextLine();

				System.out.print("Nhập tuổi mới: ");
				int tuoimoi = nhap.nextInt();

				System.out.print("Nhập GPA mới: ");
				double gpamoi = nhap.nextDouble();
				nhap.nextLine(); // Lệnh này để "nuốt" dấu xuống dòng thừa, tránh lỗi khi nhập tiếp

				// Cập nhật dữ liệu
				sv.setAddress(diachimoi);
				sv.setAge(tuoimoi);
				sv.setGpa(gpamoi);

				System.out.println("--- Thông tin sau khi cập nhật ---");
				sv.display();
			}
		}

		if (!timThay) {
			System.out.println("Không tìm thấy sinh viên tên: " + ten);
		}
	}

}
