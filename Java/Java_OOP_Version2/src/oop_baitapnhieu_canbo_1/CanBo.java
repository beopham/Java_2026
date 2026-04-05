package oop_baitapnhieu_canbo_1;

public abstract class CanBo {
	
//	Họ tên, tuổi, giới tính(name, nữ, khác), địa chỉ.
    private String hoten;
    private int tuoi;
    private String gioitinh;
    private String diachi;
    
    public CanBo()
    {
    	
    }

	public CanBo(String hoten, int tuoi, String gioitinh, String diachi) {
		this.hoten = hoten;
		this.tuoi = tuoi;
		this.gioitinh = gioitinh;
		this.diachi = diachi;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getGioitinh() {
		return gioitinh;
	}

	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

    public abstract void hienthi();
}
