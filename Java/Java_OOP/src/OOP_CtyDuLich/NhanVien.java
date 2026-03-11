package OOP_CtyDuLich;

public abstract class NhanVien {
	private String maSo;
    private String hoTen;
    private String diaChi;
    private String soDienThoai;
    
    public NhanVien()
    {
    	
    }
    public NhanVien(String maSo, String hoTen, String diaChi, String soDienThoai) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
    }
	public String getMaSo() {
		return maSo;
	}
	public void setMaSo(String maSo) {
		this.maSo = maSo;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
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
    public abstract  double tinhluong();
 // Hàm hiển thị mỗi cột một dòng dùng Getter
    public void display() {
        System.out.println("Mã số: " + getMaSo());
        System.out.println("Họ tên: " + getHoTen());
        System.out.println("Địa chỉ: " + getDiaChi());
        System.out.println("Số điện thoại: " + getSoDienThoai());
    }
}

