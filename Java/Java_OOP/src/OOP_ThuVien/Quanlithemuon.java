package OOP_ThuVien;

import java.util.ArrayList;

public class Quanlithemuon {
	private ArrayList<TheMuon> themuon = new ArrayList<>();

// 2. Constructor rỗng: Để dùng ở hàm Main cho tiện
	public Quanlithemuon() {
	}

	public Quanlithemuon(ArrayList<TheMuon> themuon) {
		this.themuon = themuon;
	}

	public void them(TheMuon tm) {
		themuon.add(tm);
	}

	public void hienthi() {
		boolean ok = false;
		if (themuon.isEmpty()) {

			System.out.println("k có sinh viên thuê");
		} else {
			for (TheMuon tm : themuon) {
				tm.display();
			}
		}

	}

	public void xoa(String mapm) {
		boolean xoa = themuon.removeIf(tm -> tm.getMaPhieuMuon().equalsIgnoreCase(mapm));
		if (xoa) {
			System.out.println("Đã xóa thành công");
		} else {
			System.out.println("ch xóa đc");
		}
	}
}
