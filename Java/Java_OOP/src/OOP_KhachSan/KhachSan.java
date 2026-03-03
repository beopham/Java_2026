package OOP_KhachSan;

import java.util.ArrayList;

public class KhachSan {
	private int songaythue;
	private String loaiphong;
	private ArrayList<Nguoi> nguoi;

//    private Nguoi nguoi2;
//	public KhachSan() {
//		this.nguoi = new ArrayList<Nguoi>();
//		this.nguoi2 = new Nguoi() ;
//	}
	public KhachSan() {
		this.nguoi = new ArrayList<Nguoi>();

	}

	public KhachSan(int songaythue, String loaiphong, ArrayList<Nguoi> nguoi) {

		this.songaythue = songaythue;
		this.loaiphong = loaiphong;
		this.nguoi = nguoi;
	}

//	public KhachSan(int songaythue, String loaiphong, Nguoi nguoi2) {
//		this.songaythue = songaythue;
//		this.loaiphong = loaiphong;
//		this.nguoi2 = nguoi2;
//	}

	public int getSongaythue() {
		return songaythue;
	}

	public void setSongaythue(int songaythue) {
		this.songaythue = songaythue;
	}

	public String getLoaiphong() {
		return loaiphong;
	}

	public void setLoaiphong(String loaiphong) {
		this.loaiphong = loaiphong;
	}

	public ArrayList<Nguoi> getNguoi() {
		return nguoi;
	}

	public void setNguoi(ArrayList<Nguoi> nguoi) {
		this.nguoi = nguoi;
	}

	public void display() {
		
		System.out.println("Số ngày thuê là" + songaythue);
		System.out.println("loại phòng  là" + loaiphong);
		for (Nguoi ng : nguoi) {
			ng.display();
		}
	}

	public void xoa(ArrayList<KhachSan> danhsachks,String cmnd) {
		boolean xoa = danhsachks.removeIf(ks->ks.getNguoi().stream().anyMatch(ng->ng.getCmnd().equalsIgnoreCase(cmnd)));
		if (xoa == true) {
			System.out.println("đã xóa thành công ");
		} else {
			System.out.println("k có cmnd của ng thuê");
		}
	}

	public void tinhtien(ArrayList<KhachSan> danhsachks,String cmnd) {

		boolean tk = false;
		int tienthue = 0;
		for (KhachSan ks : danhsachks)
		{
			for (Nguoi ng : ks.getNguoi()) {
				if (ng.getCmnd().equalsIgnoreCase(cmnd)) {
					tk = true;
					if (ks.getLoaiphong().equalsIgnoreCase("A")) {
						tienthue =  ks.getSongaythue() * 500;
						System.out.println("Tiền thuê phòng loại A : " + tienthue);
					} else if (ks. getLoaiphong().equalsIgnoreCase("B")) {
						tienthue = ks.getSongaythue() * 300;
						System.out.println("Tiền thuê phòng loại B : " + tienthue);
					} else if (ks.getLoaiphong().equalsIgnoreCase("C")) {
						tienthue = ks.getSongaythue() * 100;
						System.out.println("Tiền thuê phòng loại C : " + tienthue);
					}
				}
			}	
		}
		
		if (tk == false) {
			System.out.println("k có thông tin thuê phòng của khách");
		}
	}

}
