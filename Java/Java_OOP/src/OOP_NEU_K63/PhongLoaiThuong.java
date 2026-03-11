package OOP_NEU_K63;

public class PhongLoaiThuong  extends Phong{
	private int heSoPhong;
    private int giaCoBan;
    public PhongLoaiThuong()
    {
    	
    }
	public PhongLoaiThuong(String maphong, String tenphong, int dongia, int heSoPhong, int giaCoBan) {
		super(maphong, tenphong, dongia);
		this.heSoPhong = heSoPhong;
		this.giaCoBan = giaCoBan;
	}
	public int getHeSoPhong() {
		return heSoPhong;
	}
	public void setHeSoPhong(int heSoPhong) {
		this.heSoPhong = heSoPhong;
	}
	public int getGiaCoBan() {
		return giaCoBan;
	}
	public void setGiaCoBan(int giaCoBan) {
		this.giaCoBan = giaCoBan;
	}
	public void display() {
        System.out.println("--- THÔNG TIN PHÒNG LOẠI THƯỜNG ---");
        // Lấy từ lớp cha
        System.out.println("Mã phòng     : " + getMaphong());
        System.out.println("Tên phòng    : " + getTenphong());
        
        // Lấy từ chính lớp con nhưng dùng Getter
        System.out.println("Hệ số phòng  : " + getHeSoPhong());
        System.out.println("Giá cơ bản   : " + getGiaCoBan());
        
        // Tính toán dùng Getter
        int donGiaThucTe = getHeSoPhong() * getGiaCoBan();
        System.out.println("=> Đơn giá thực: " + donGiaThucTe + " VNĐ");
        System.out.println("------------------------------------");
    }
}
