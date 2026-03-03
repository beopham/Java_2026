package OOP_THPT;

public class HocSinh {

	private String lop; // Viết thường chữ l
	private String hoTen; // Viết thường chữ h, viết hoa chữ T (camelCase)
	private int tuoi; // Đổi sang kiểu int để dễ tính toán
	private String queQuan; // Viết thường chữ q, viết hoa chữ Q

	public HocSinh() {

	}

	public HocSinh(String lop, String hoTen, int tuoi, String queQuan) {

		this.lop = lop;
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.queQuan = queQuan;
	}

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
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

	public String getQueQuan() {
		return queQuan;
	}

	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}
	public void display() {
	    System.out.println("------------------------------------");
	    // Dùng Getter để lấy dữ liệu thay vì truy cập trực tiếp biến private
	    System.out.println("Lớp: " + getLop());
	    System.out.println("Họ tên: " + getHoTen());
	    System.out.println("Tuổi: " + getTuoi());
	    System.out.println("Quê quán: " + getQueQuan());
	}
}
