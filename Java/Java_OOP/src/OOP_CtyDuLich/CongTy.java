package OOP_CtyDuLich;

import java.util.ArrayList;

public class CongTy {
	// 1. Các thuộc tính để private để đảm bảo tính đóng gói (Encapsulation)
	private String maSoThue;
	private String tenCongTy;
	private String diaChi;
	private String soDienThoai;
    private ArrayList<Tour> tour;
	// 2. Constructor không tham số (mặc định)
	public CongTy() {
	}

	// 3. Constructor có đầy đủ tham số
	public CongTy(String maSoThue, String tenCongTy, String diaChi, String soDienThoai) {
		this.maSoThue = maSoThue;
		this.tenCongTy = tenCongTy;
		this.diaChi = diaChi;
		this.soDienThoai = soDienThoai;
	}

	// 4. Getter và Setter (để lấy và cập nhật dữ liệu từ bên ngoài)
	public String getMaSoThue() {
		return maSoThue;
	}

	public void setMaSoThue(String maSoThue) {
		this.maSoThue = maSoThue;
	}

	public String getTenCongTy() {
		return tenCongTy;
	}

	public void setTenCongTy(String tenCongTy) {
		this.tenCongTy = tenCongTy;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	public void display() {
	    System.out.println("---------------------------------");
	    System.out.println("Mã số thuế: " + getMaSoThue());
	    System.out.println("Tên công ty: " + getTenCongTy());
	    System.out.println("Địa chỉ: " + getDiaChi());
	    System.out.println("Số điện thoại: " + getSoDienThoai());
	}
}
