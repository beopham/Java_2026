package OOP_DeTai;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		QuanLidetai qldt = new QuanLidetai();
		Scanner nhap = new Scanner(System.in);
		while (true) {
			System.out.println("\n---------- MENU QUẢN LÝ ĐỀ TÀI ----------");
			System.out.println("1. Thêm đề tài (Ứng dụng/Lý thuyết)");
			System.out.println("2. Xuất danh sách đề tài Ứng dụng");
			System.out.println("3. Xuất danh sách đề tài Lý thuyết");
			System.out.println("4. Tính tổng kinh phí hỗ trợ");
			System.out.println("5. Tìm đề tài có kinh phí cao nhất");
			System.out.println("6. Xuất Đề tài Ứng dụng giảm dần theo kinh phí");
			System.out.println("7. Xóa đề tài Ứng dụng theo mã");
			System.out.println("8. Xóa đề tài Lý thuyết theo mã");
			System.out.println("0. Thoát chương trình");
			System.out.print("Mời bạn chọn: ");
			int chon = nhap.nextInt();
			nhap.nextLine();
			if (chon == 1) {
				System.out.println("Nhập vào mã đề tài");
				String madetai = nhap.nextLine();
				System.out.println("Nhập vào tên đề tài");
				String tenetai = nhap.nextLine();
				System.out.println("Nhập vào tên thành viên chính");
				String tenthanhvienchinh = nhap.nextLine();
				System.out.println("Nhập vào số thành viên");
				int sothanhvien = nhap.nextInt();
				System.out.println("Nhập vào năm bắt đầu");
				int nambatdau = nhap.nextInt();
				nhap.nextLine();
				System.out.println("Nhập vào đề tài muốn thêm");
				System.out.println("1. Đề tài lí thuyết");
				System.out.println("2. Đề tài ứng dụng");
				int chondt = nhap.nextInt();
				nhap.nextLine();
				if (chondt == 1) {
					System.out.println("Nhập vào số lượng bài báo công bố");
					int soluongbaibaodccongbo = nhap.nextInt();
					System.out.println("Nhập vào số lượng hội nghị khoa học đc tham gia");
					int soluonghoinghikhoahocdcthamgia = nhap.nextInt();
					nhap.nextLine(); // QUAN TRỌNG: Chống trôi lệnh cho lần nhập sau
					DeTai dtlt = new DeTaiLiThuyet(madetai, madetai, tenthanhvienchinh, sothanhvien, nambatdau,
							soluongbaibaodccongbo, soluonghoinghikhoahocdcthamgia);
					qldt.them(dtlt);
					System.out.println("=> Thêm đề tài lí thuyết thành công!");
				} else if (chondt == 2) {
					ArrayList<SanPham> danhsachsanpham = new ArrayList<SanPham>();
					System.out.println("Nhập vào số lượng sản phẩm thực tế");
					int soluongsanphamthucte = nhap.nextInt();
					nhap.nextLine();
					for (int i = 0; i < soluongsanphamthucte; i++) {
						System.out.println("Nhập vào danh sách sản phẩm thứ " + (i + 1));
						System.out.println("Nhập vào tên sản phẩm");
						String tensp = nhap.nextLine();
						System.out.println("Nhập vào năm triển khai");
						int namtrienkhai = nhap.nextInt();
						nhap.nextLine();
						System.out.println("Nhập vào Mức độ áp dụng (Cao,Trung bình, Thấp)");
						String mucdoapdungg = nhap.nextLine();
						SanPham sp = new SanPham(tensp, namtrienkhai, mucdoapdungg);
						danhsachsanpham.add(sp);
					}

					DeTai dtud = new DeTaiUngDung(madetai, madetai, tenthanhvienchinh, sothanhvien, nambatdau,
							soluongsanphamthucte, danhsachsanpham);
					qldt.them(dtud);
					System.out.println("=> Thêm đề tài ứng dụng thành công!");
				}
			} else if (chon == 2) {
				qldt.xuatdetaiungdung();
			} else if (chon == 3) {
				qldt.xuatdetailithuyet();
			} else if (chon == 4) {
				qldt.tongkinhphihotro();
			} else if (chon == 5) {
				qldt.kinhphicaonhat();
			} else if (chon == 6) {
				qldt.xuatdanhsachdetainghiencuuungdunggiamdan();
			} else if (chon == 7) {
				System.out.println("Nhập vào mã đề tài");
				String madetai = nhap.nextLine();
				qldt.xoadetaiungdung(madetai);
			} else if (chon == 8) {
				System.out.println("Nhập vào mã đề tài");
				String madetai = nhap.nextLine();
				qldt.xoadetailithuyet(madetai);
			} else if (chon == 0) {
				System.out.println("đã thoát");
				break;
			}

		}
	}
}
