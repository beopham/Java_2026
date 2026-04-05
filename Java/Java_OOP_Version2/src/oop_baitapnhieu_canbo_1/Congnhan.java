package oop_baitapnhieu_canbo_1;

public class Congnhan extends CanBo {
	private int bac;

	public Congnhan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Congnhan(int bac) {
		super();
		this.bac = bac;
	}

	public Congnhan(String hoten, int tuoi, String gioitinh, String diachi, int bac) {
		super(hoten, tuoi, gioitinh, diachi);
		this.bac = bac;
	}

	public int getBac() {
		return bac;
	}

	public void setBac(int bac) {
		this.bac = bac;
	}

	@Override
	public void hienthi() {
		System.out.println("Thông tin công nhân");
		System.out.println("Họ tên: " + getHoten());
		System.out.println("Tuổi: " + getTuoi());
		System.out.println("Giới tính: " + getGioitinh());
		System.out.println("Địa chỉ: " + getDiachi());

		// Sử dụng hàm get của chính lớp Congnhan
		System.out.println("Bậc: " + getBac());
		System.out.println("-----------------------");
	}

}
