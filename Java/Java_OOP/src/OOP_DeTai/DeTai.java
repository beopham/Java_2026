package OOP_DeTai;

public abstract class DeTai {
	
	private String madetai;
	private String tendetai;
	private String tenthanhvienchinh;
	private int sothanhvien;
	private int nambatdau;
	
	public DeTai()
	{
		
	}

	public DeTai(String madetai, String tendetai, String tenthanhvienchinh, int sothanhvien, int nambatdau) {

		this.madetai = madetai;
		this.tendetai = tendetai;
		this.tenthanhvienchinh = tenthanhvienchinh;
		this.sothanhvien = sothanhvien;
		this.nambatdau = nambatdau;
	}

	public String getMadetai() {
		return madetai;
	}

	public void setMadetai(String madetai) {
		this.madetai = madetai;
	}

	public String getTendetai() {
		return tendetai;
	}

	public void setTendetai(String tendetai) {
		this.tendetai = tendetai;
	}

	public String getTenthanhvienchinh() {
		return tenthanhvienchinh;
	}

	public void setTenthanhvienchinh(String tenthanhvienchinh) {
		this.tenthanhvienchinh = tenthanhvienchinh;
	}

	public int getSothanhvien() {
		return sothanhvien;
	}

	public void setSothanhvien(int sothanhvien) {
		this.sothanhvien = sothanhvien;
	}

	public int getNambatdau() {
		return nambatdau;
	}

	public void setNambatdau(int nambatdau) {
		this.nambatdau = nambatdau;
	}
    public void display()
    {
 
    	System.out.println("Mã Đề Tài : " + getMadetai());
    	System.out.println("Tên Đề Tài : " + getTendetai());
     	System.out.println("Thành Viên Chính" +getTenthanhvienchinh());
     	System.out.println("Số Thành Viên" +getSothanhvien());
     	System.out.println("Năm Bắt Đầu" +getNambatdau());
     	
    }
	public abstract double tinhkinhphi();
	public abstract void danhgiahieuqua();
}
