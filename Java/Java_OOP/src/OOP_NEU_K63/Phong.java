package OOP_NEU_K63;

public class Phong {
    private String maphong;
    private String tenphong;
    private int dongia;
    private  static int count=0;
	public Phong(String maphong, String tenphong, int dongia) {
		this.maphong = maphong;
		this.tenphong = tenphong;
		this.dongia = dongia;
		count++;
	}
    
	public Phong()
	{
		count++;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Phong.count = count;
	}

	public String getMaphong() {
		return maphong;
	}

	public void setMaphong(String maphong) {
		this.maphong = maphong;
	}

	public String getTenphong() {
		return tenphong;
	}

	public void setTenphong(String tenphong) {
		this.tenphong = tenphong;
	}

	public int getDongia() {
		return dongia;
	}

	public void setDongia(int dongia) {
		this.dongia = dongia;
	}
	public void display() {
        System.out.println("--- Thông tin phòng ---");
        System.out.println("Mã phòng  : " + this.maphong);
        System.out.println("Tên phòng : " + this.tenphong);
        System.out.println("Đơn giá   : " + this.dongia + " VNĐ");
    }
    
}
