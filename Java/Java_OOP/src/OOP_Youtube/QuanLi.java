package OOP_Youtube;

import java.util.ArrayList;
import java.util.Comparator;

public class QuanLi {
	private ArrayList<Kenh> quanlikenh;

	public QuanLi() {
		this.quanlikenh = new ArrayList<Kenh>();
	}

	public QuanLi(ArrayList<Kenh> quanlikenh) {
		this.quanlikenh = quanlikenh;
	}

	public ArrayList<Kenh> getQuanlikenh() {
		return quanlikenh;
	}

	public void setQuanlikenh(ArrayList<Kenh> quanlikenh) {
		this.quanlikenh = quanlikenh;
	}

	public void them(Kenh kenh) {
		quanlikenh.add(kenh);
	}

	public void hienthiall() {
	    boolean coKenhAmNhac = false;
	    boolean coKenhNauAn = false;

	    // Chỉ dùng 1 vòng lặp duy nhất để duyệt danh sách
	    for (Kenh kenh : getQuanlikenh()) {
	        
	        // 1. Kiểm tra nếu là kênh Âm Nhạc
	        if (kenh instanceof KenhAmNhac) {
	            KenhAmNhac kan = (KenhAmNhac) kenh;
	            kan.hienthi();
	            coKenhAmNhac = true;
	        } 
	        
	        // 2. Kiểm tra nếu là kênh Nấu Ăn
	        else if (kenh instanceof KenhNauAn) {
	            KenhNauAn kna = (KenhNauAn) kenh;
	            kna.hienthi();
	            coKenhNauAn = true;
	        }
	    }

	    // Kiểm tra để thông báo sau khi duyệt xong toàn bộ
	    if (!coKenhAmNhac) {
	        System.out.println("Không có thông tin kênh âm nhạc");
	    }
	    if (!coKenhNauAn) {
	        System.out.println("Không có thông tin kênh nấu ăn");
	    }
	}

	public void hienthikenhamnhac() {
		for (Kenh kenh : getQuanlikenh()) {
			KenhAmNhac kan = (KenhAmNhac) kenh;
			kan.hienthi();
		}
	}

	public void hienthinauan() {
		for (Kenh kenh : getQuanlikenh()) {
			KenhNauAn kna = (KenhNauAn) kenh;
			kna.hienthi();
		}
	}

	public void timkiem(String tk) {
		boolean timk = false;
		for (Kenh kenh : getQuanlikenh()) {
			if (kenh.getTenkenh().equalsIgnoreCase(tk)) {
				timk = true;
				System.out.println("đã tìm thấp kênh");
				kenh.hienthi();
			}
		}
		if (timk == false) {
			System.out.println("k tìm thấy");
		}
	}

	public void doanhthucaonhat() {
		quanlikenh.stream().sorted(Comparator.comparingDouble(Kenh::doanhthu).reversed()).findFirst()
				.ifPresent(Kenh::hienthi);
	}
}
