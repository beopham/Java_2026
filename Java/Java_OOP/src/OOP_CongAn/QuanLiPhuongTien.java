package OOP_CongAn;

import java.util.ArrayList;

public class QuanLiPhuongTien {
	private ArrayList<PhuongTien> phuongtien;

	public QuanLiPhuongTien() {
		this.phuongtien = new ArrayList<PhuongTien>();
	}

	public QuanLiPhuongTien(ArrayList<PhuongTien> phuongtien) {

		this.phuongtien = phuongtien;
	}

	public void Them(PhuongTien pt) {
		phuongtien.add(pt);
	}

	public void hienthi() {
		if (phuongtien.isEmpty()) {
			System.out.println("k có phương tiện nào");
		} else {
			for (PhuongTien pt : phuongtien) {
				pt.display();
			}
		}

	}

	public void xoa(String id) {
		if (phuongtien.isEmpty()) {
			System.out.println("k có gì để xóa cả");

		} else {
			boolean xoa = phuongtien.removeIf(pt -> pt.getId().equalsIgnoreCase(id));
			if (xoa) {
				System.out.println("đã xóa thành công");
			} else {
				System.out.println("chưa xóa đc");
			}
		}

	}

	public void timkiemtheoOto(String hangSX, String mauSx) {
		boolean tk = false;
		for (PhuongTien pt : phuongtien) {
			if (pt instanceof OTo && pt.getHangSX().equalsIgnoreCase(hangSX) && pt.getMauXe().equalsIgnoreCase(mauSx)) {
				tk = true;
				pt.display();
			}
		}
		if (tk == false) {
			System.out.println("k tìm thấy ô tô nào cả");
		}
	}

	public void timkiemtheoXemay(String hangSX, String mauSx) {
		boolean tk = false;
		for (PhuongTien pt : phuongtien) {
			if (pt instanceof XeMay && pt.getHangSX().equalsIgnoreCase(hangSX)
					&& pt.getMauXe().equalsIgnoreCase(mauSx)) {
				tk = true;
				pt.display();
			}
		}
		if (tk == false) {
			System.out.println("k tìm thấy xe máy nào cả");
		}
	}

	public void timkiemtheoXetai(String hangSX, String mauSx) {
		boolean tk = false;
		for (PhuongTien pt : phuongtien) {
			if (pt instanceof XeTai && pt.getHangSX().equalsIgnoreCase(hangSX)
					&& pt.getMauXe().equalsIgnoreCase(mauSx)) {
				tk = true;
				pt.display();
			}
		}
		if (tk == false) {
			System.out.println("k tìm thấy xe tải nào cả");
		}
	}
}
