package OOP_ThuVien;

import java.util.ArrayList;

public class TheMuon {
	private String maPhieuMuon;
	private int ngayMuon;
	private int hanTra;
	private String soHieuSach;
	private SinhVien sinhVien; // Chứa đối tượng SinhVien

	public TheMuon() {

	}

	public TheMuon(String maPhieuMuon, int ngayMuon, int hanTra, String soHieuSach, SinhVien sinhVien) {
		this.maPhieuMuon = maPhieuMuon;
		this.ngayMuon = ngayMuon;
		this.hanTra = hanTra;
		this.soHieuSach = soHieuSach;
		this.sinhVien = sinhVien;
	}
   
	public String getMaPhieuMuon() {
		return maPhieuMuon;
	}

	public void setMaPhieuMuon(String maPhieuMuon) {
		this.maPhieuMuon = maPhieuMuon;
	}

	public int getNgayMuon() {
		return ngayMuon;
	}

	public void setNgayMuon(int ngayMuon) {
		this.ngayMuon = ngayMuon;
	}

	public int getHanTra() {
		return hanTra;
	}

	public void setHanTra(int hanTra) {
		this.hanTra = hanTra;
	}

	public String getSoHieuSach() {
		return soHieuSach;
	}

	public void setSoHieuSach(String soHieuSach) {
		this.soHieuSach = soHieuSach;
	}

	public SinhVien getSinhVien() {
		return sinhVien;
	}

	public void setSinhVien(SinhVien sinhVien) {
		this.sinhVien = sinhVien;
	}
   public void display()
   {
	   System.out.println("MÃ PHIẾU MƯỢN: " + getMaPhieuMuon());
       System.out.println("Số hiệu sách : " + getSoHieuSach());
       System.out.println("Ngày mượn    : " + getNgayMuon());
       System.out.println("Hạn trả      : " + getHanTra());
       sinhVien.display();
   }
	
}
