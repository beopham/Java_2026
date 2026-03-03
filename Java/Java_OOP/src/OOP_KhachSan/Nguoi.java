package OOP_KhachSan;

public class Nguoi {
	private String ten;
	private int tuoi;
	private String cmnd;

	public Nguoi() {

	}

	public Nguoi(String ten, int tuoi, String cmnd) {

		this.ten = ten;
		this.tuoi = tuoi;
		this.cmnd = cmnd;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getCmnd() {
		return cmnd;
	}

	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}
	public void display() {
	    System.out.println("--- Thông tin cá nhân ---");
	    System.out.println("Họ tên: " + this.ten);
	    System.out.println("Tuổi: " + this.tuoi);
	    System.out.println("Số CMND: " + this.cmnd);
	}
}
