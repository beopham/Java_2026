package OOP_CtyDuLich;

public class NhanVienVanPhong extends NhanVien {

	private int thongtinngach;
	private int bac;

	public NhanVienVanPhong() {

	}

	public NhanVienVanPhong(String maSo, String hoTen, String diaChi, String soDienThoai, int thongtinngach, int bac) {
		super(maSo, hoTen, diaChi, soDienThoai);
		this.thongtinngach = thongtinngach;
		this.bac = bac;
	}


	public int getThongtinngach() {
		return thongtinngach;
	}

	public void setThongtinngach(int thongtinngach) {
		this.thongtinngach = thongtinngach;
	}

	public int getBac() {
		return bac;
	}

	public void setBac(int bac) {
		this.bac = bac;
	}

	@Override
	public void display() {
		System.out.println("Thông tin nhân viên văn phòng");
		super.display();
		System.out.println("Thông tin ngạch : "+getThongtinngach());
		System.out.println("Thông tin ngạch : "+getBac());
		System.out.println("Thông tin lương :"+tinhluong());
	}
	@Override
	public double tinhluong() {
		double luong = (getThongtinngach()+getBac()/10)*2.2;
		return luong;
	}
}
