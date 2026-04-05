package oop_baitapnhieu_canbo_1;

import java.util.ArrayList;

public class QuanLi {
	private ArrayList<CanBo> danhsachcanbo;

	public QuanLi() {
		this.danhsachcanbo = new ArrayList<CanBo>();
	}

	public QuanLi(ArrayList<CanBo> danhsachcanbo) {
		this.danhsachcanbo = danhsachcanbo;
	}

	public void themcanbo(CanBo cb) {
		danhsachcanbo.add(cb);
	}

	public void timkiemtheoten(String ten) {
		boolean tk = false;
		for (CanBo cb : danhsachcanbo) {
			if (cb.getHoten().equalsIgnoreCase(ten)) {
				cb.hienthi();
				tk = true;
			}
		}
		if(tk==false)
		{
			System.out.println("k tìm thấy tên nhân viên ");
		}
		// danhsachcanbo.stream().filter(cb ->
		// cb.getHoten().equalsIgnoreCase(ten)).forEach(x -> x.hienthi());
	}

	public void hienthiall() {
//		danhsachcanbo.stream().forEach(x -> x.getHoten());

		for (CanBo cb : danhsachcanbo) {

			cb.hienthi();
		}
	}

	public void hienthikysu() {
//		for (CanBo cb : danhsachcanbo) {
//
//			if (cb instanceof Kysu) {
//				Kysu ks = (Kysu) cb;
//				ks.hienthi();
//			}
//		}
		danhsachcanbo.stream().filter(cb -> cb instanceof Kysu).forEach(cb -> cb.hienthi());
	}

	public void hienthicongnhan() {
//		for (CanBo cb : danhsachcanbo) {
//
//			if (cb instanceof Congnhan) {
//				Congnhan cn = (Congnhan) cb;
//				cn.hienthi();
//			}
//		}
		danhsachcanbo.stream().filter(cb -> cb instanceof Congnhan).forEach(cb -> cb.hienthi());
	}

	public void hienthinhanvien() {
//		for (CanBo cb : danhsachcanbo) {
//
//			if (cb instanceof Nhanvien) {
//				Nhanvien nv = (Nhanvien) cb;
//				nv.hienthi();
//			}
//		}
		danhsachcanbo.stream().filter(cb -> cb instanceof Nhanvien).forEach(cb -> cb.hienthi());
	}
}
