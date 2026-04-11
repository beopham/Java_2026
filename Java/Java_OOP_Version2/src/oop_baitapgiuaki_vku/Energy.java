package oop_baitapgiuaki_vku;

public class Energy {
	private String madien;
	private int gia;

	public Energy() {

	}

	public Energy(String madien, int gia) {

		this.madien = madien;
		this.gia = gia;
	}

	public String getMadien() {
		return madien;
	}

	public void setMadien(String madien) {
		this.madien = madien;
	}

	public int getGia() {
		return gia;
	}

	public void setGia(int gia) {
		this.gia = gia;
	}
   public void hienthi() 
   {
	// Sử dụng phương thức get để lấy dữ liệu thay vì dùng biến trực tiếp
	    System.out.println("Mã điện: " + this.getMadien());
	    System.out.println("Giá: " + this.getGia());   
   }
}
