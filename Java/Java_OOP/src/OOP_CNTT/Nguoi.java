package OOP_CNTT;

public class Nguoi {
	// Thuộc tính private để đảm bảo tính đóng gói
	private String hoTen;
	private int tuoi;
	private String queQuan;
	private String maGiaovienn;

	// Constructor không tham số
	public Nguoi() {
	}

	public Nguoi(String hoTen, int tuoi, String queQuan, String maGiaovienn) {
		super();
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.queQuan = queQuan;
		this.maGiaovienn = maGiaovienn;
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

	public String getMaGiaovienn() {
		return maGiaovienn;
	}

	public void setMaGiaovienn(String maGiaovienn) {
		this.maGiaovienn = maGiaovienn;
	}

	// Hàm hiển thị thông tin giáo viên
	public void display() {
		System.out.println("------------------------------------");
		System.out.println("Mã số giáo viên: " + getMaGiaovienn());
		System.out.println("Họ tên: " + getHoTen());
		System.out.println("Tuổi: " + getTuoi());
		System.out.println("Quê quán: " + getQueQuan());
	}
}
