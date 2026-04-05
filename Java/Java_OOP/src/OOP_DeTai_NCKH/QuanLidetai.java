package OOP_DeTai_NCKH;

import java.util.ArrayList;
import java.util.Comparator;

public class QuanLidetai {
	private ArrayList<DeTai> quanlidetai;

	public QuanLidetai() {
		this.quanlidetai = new ArrayList<DeTai>();
	}

	public QuanLidetai(ArrayList<DeTai> quanlidetai) {
		this.quanlidetai = quanlidetai;
	}

	public void them(DeTai dt) {
		quanlidetai.add(dt);
	}

	public void xoadetailithuyet(String id) {
		// removeIf sẽ tự duyệt danh sách, tìm đúng ông thoả mãn 2 điều kiện và xóa
		// Nó trả về true nếu xóa được, false nếu không tìm thấy ai để xóa
		boolean daXoa = quanlidetai.removeIf(dt -> dt instanceof DeTaiLiThuyet && dt.getMadetai().equalsIgnoreCase(id));

		if (daXoa) {
			System.out.println("Đã xóa thành công đề tài lý thuyết mã: " + id);
		} else {
			System.out.println("Không tìm thấy ID đề tài lý thuyết mà bạn nhập");
		}
	}

	public void xoadetaiungdung(String id) {
		// removeIf sẽ trả về true nếu có ít nhất 1 phần tử bị xóa
		boolean daXoa = quanlidetai.removeIf(dt -> dt instanceof DeTaiUngDung && dt.getMadetai().equalsIgnoreCase(id));

		if (daXoa) {
			System.out.println("Đã xóa thành công đề tài ứng dụng mã: " + id);
		} else {
			System.out.println("Không tìm thấy Đề tài ứng dụng có mã: " + id);
		}
	}

	public void kinhphihotrodetaiugdung() {
		for (DeTai dt : quanlidetai) {
			if (dt instanceof DeTaiUngDung) {
				DeTaiUngDung dtud = (DeTaiUngDung) dt;
				dtud.tinhkinhphi();
			}
		}
	}

	public void danhgiadetaiugdung() {
		for (DeTai dt : quanlidetai) {
			if (dt instanceof DeTaiUngDung) {
				DeTaiUngDung dtud = (DeTaiUngDung) dt;
				dtud.danhgiahieuqua();
			}
		}
	}

	public void kinhphihotrodetaiLithuyet() {
		for (DeTai dt : quanlidetai) {
			if (dt instanceof DeTaiLiThuyet) {
				DeTaiLiThuyet dtlt = (DeTaiLiThuyet) dt;
				dtlt.tinhkinhphi();
			}
		}
	}

	public void danhgiahieuquadetailithuyet() {
		for (DeTai dt : quanlidetai) {
			if (dt instanceof DeTaiLiThuyet) {
				DeTaiLiThuyet dtlt = (DeTaiLiThuyet) dt;
				dtlt.danhgiahieuqua();
			}
		}
	}

	public void xuatdetaiungdung() {
	    System.out.println("\n========== DANH SÁCH ĐỀ TÀI ỨNG DỤNG ==========");
	    boolean coDuLieu = false;
	    for (DeTai dt : quanlidetai) {
	        if (dt instanceof DeTaiUngDung) {
	            DeTaiUngDung dtud = (DeTaiUngDung) dt;
	            dtud.display(); // In thông tin cơ bản
	            
	            // Dùng printf để hiện số tiền đẹp (%.0f là không lấy số lẻ)
	            System.out.printf("Kinh phí hỗ trợ: %.0f VNĐ\n", dtud.tinhkinhphi());
	            
	            System.out.print("Đánh giá hiệu quả: ");
	            dtud.danhgiahieuqua(); // Gọi hàm này để in ra "Xuất sắc", "Đạt"...
	            System.out.println("----------------------------------------------");
	            coDuLieu = true;
	        }
	    }
	    if (!coDuLieu) System.out.println("Chưa có đề tài ứng dụng nào!");
	}

	public void xuatdetailithuyet() {
	    System.out.println("\n========== DANH SÁCH ĐỀ TÀI LÝ THUYẾT ==========");
	    boolean coDuLieu = false;
	    for (DeTai dt : quanlidetai) {
	        if (dt instanceof DeTaiLiThuyet) {
	            DeTaiLiThuyet dtlt = (DeTaiLiThuyet) dt;
	            dtlt.display();
	            
	            // Sửa lỗi 1.3E7 ở đây
	            System.out.printf("Kinh phí hỗ trợ: %.0f VNĐ\n", dtlt.tinhkinhphi());
	            
	            System.out.print("Đánh giá hiệu quả: ");
	            dtlt.danhgiahieuqua();
	            System.out.println("----------------------------------------------");
	            coDuLieu = true;
	        }
	    }
	    if (!coDuLieu) System.out.println("Chưa có đề tài lý thuyết nào!");
	}
	public void kinhphicaonhat() {
		double max = quanlidetai.stream().mapToDouble(DeTai::tinhkinhphi).max().orElse(0);
		System.out.println("Các đề tài có kinh phí cao nhất:");
		quanlidetai.stream().filter(dt -> dt.tinhkinhphi() == max) // So sánh trực tiếp với con số max vừa tìm
				.forEach(DeTai::display);
	}

	public void tongkinhphihotro() {
	    // Tính tổng bằng Stream
	    double sum = quanlidetai.stream()
	            .mapToDouble(DeTai::tinhkinhphi)
	            .sum();

	    // In ra dùng printf để không bị số E
	    System.out.printf("===> TỔNG KINH PHÍ TẤT CẢ ĐỀ TÀI: %.0f VNĐ\n", sum);
	}

	public void xuatdanhsachdetainghiencuuungdunggiamdan() {
	    System.out.println("--- DANH SÁCH GIẢM DẦN THEO KINH PHÍ ĐỀ TÀI ỨNG DỤNG---");
	    quanlidetai.stream()
	        .filter(dt -> dt instanceof DeTaiUngDung)
	        .sorted(Comparator.comparingDouble(DeTai::tinhkinhphi).reversed())
	        .forEach(dt -> {
	            dt.display();
	            // In thêm dòng này để kiểm chứng logic sắp xếp
	            System.out.printf("==> Kinh phí tính toán được: %.0f VNĐ\n", dt.tinhkinhphi());
	            System.out.println("------------------------------------");
	        });
	}
}
