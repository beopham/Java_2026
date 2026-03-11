package OOP_NEU_K63;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		QuanLiPhong ql = new QuanLiPhong();
		Scanner nhap = new Scanner(System.in);
		System.out.println("Nhập vào số phòng");
		int n = nhap.nextInt();
		int i = 0;
		while (i < n) {
			System.out.println("\n===== MENU QUẢN LÝ PHÒNG =====");
			System.out.println("1. Thêm Phòng Đặc Biệt");
			System.out.println("2. Thêm Phòng Loại Thường");
			System.out.println("3. Hiển thị danh sách phòng");
			System.out.println("4. Tính tổng số phòng (size)");
			System.out.println("5. Xem giá các phòng Đặc Biệt");
			System.out.println("6. Xem giá sách các phòng Thường");
			System.out.println("7. So sánh 2 phòng đầu tiên");
			System.out.println("0. Thoát chương trình");
			System.out.print("Mời bạn chọn: ");
			int chon = nhap.nextInt();
			nhap.nextLine();
			if (chon == 1) {
				System.out.println("Nhập mã phòng");
				String maphong = nhap.nextLine();
				System.out.println("Nhập tên phòng");
				String tenphong = nhap.nextLine();
				System.out.println("Nhập đơn giá");
				int dongia = nhap.nextInt();
				// Nhập 3 cái mới
				System.out.println("Nhập Vị trí:");
				int viTri = nhap.nextInt();

				System.out.println("Nhập Chỉ số phục vụ:");
				int chiSoPhucVu = nhap.nextInt();

				System.out.println("Nhập Giá cơ bản:");
				int giaCoBan = nhap.nextInt();
				Phong ph = new PhongDacBiet(maphong, tenphong, dongia, viTri, chiSoPhucVu, giaCoBan);
				ql.them(ph);

			} else if (chon == 2) {
				System.out.println("Nhập mã phòng");
				String maphong = nhap.nextLine();
				System.out.println("Nhập tên phòng");
				String tenphong = nhap.nextLine();
				System.out.println("Nhập đơn giá");
				int dongia = nhap.nextInt();
				// Nhập 3 cái mới
				// Nhập các thuộc tính riêng của lớp con
				System.out.println("Nhập hệ số phòng:");
				int hs = nhap.nextInt();

				System.out.println("Nhập giá cơ bản:");
				int gcbT = nhap.nextInt();
				Phong ph = new PhongLoaiThuong(maphong, tenphong, dongia, hs, gcbT);
				ql.them(ph);
			} else if (chon == 3) {
				ql.hienthiphong();
			} else if (chon == 4) {
				ql.tongsophong();
			} else if (chon == 5) {
				ql.tinhphdacbiet();
			} else if (chon == 6) {
				ql.tinhphloaithuong();
			} else if (chon == 7) {
				if (ql.getQuanli().size() > 2) {
                    System.out.println("Tổng số vị trí phòng từ 1 đến"+ ql.getQuanli().size());
                    System.out.println("Nhập vào phòng muốn so sánh thứ 1");
                    int p1n=nhap.nextInt();
                    System.out.println("Nhập vào phòng muốn so sánh thứ 2");
                    int p2n=nhap.nextInt();
                    
                    Phong p1=ql.getQuanli().get(p1n);
                    Phong p2=ql.getQuanli().get(p2n);
                    boolean ketQua = ql.sosanh(p1, p2);
                    
                    System.out.println("--- KẾT QUẢ SO SÁNH ---");
                    if (ketQua) {
                        System.out.println("Kết quả: TRUE (Phòng " + p1.getMaphong() + " rẻ hơn phòng " + p2.getMaphong() + ")");
                    } else {
                        System.out.println("Kết quả: FALSE (Phòng " + p1.getMaphong() + " KHÔNG rẻ hơn phòng " + p2.getMaphong() + ")");
                    }
				} else {
					System.out.println("k đủ phòng");
				}
			}
		}

	}
}
