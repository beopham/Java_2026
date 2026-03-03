package OOP_ThuVien;

public class SinhVien {
	private String hoTen;
    private int tuoi;
    private String lop;

    public SinhVien() {

	}
    
    public SinhVien(String hoTen, int tuoi, String lop) {

		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.lop = lop;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}
	// Hàm hiển thị thông tin chi tiết theo từng dòng
    public void display() {
        System.out.println("----- Thông tin Sinh Viên -----");
        System.out.println(" + Họ và tên: " + getHoTen());
        System.out.println(" + Tuổi:      " + getTuoi());
        System.out.println(" + Lớp:       " + getLop());
    }
}
