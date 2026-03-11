package OOP_NEU_K63;

public class PhongDacBiet extends Phong {
	private int viTri;
	private int chiSoPhucVu;
	private int giaCoBan;

	public PhongDacBiet() {

	}

	public PhongDacBiet(String maphong, String tenphong, int dongia, int viTri, int chiSoPhucVu, int giaCoBan) {
		super(maphong, tenphong, dongia);
		this.viTri = viTri;
		this.chiSoPhucVu = chiSoPhucVu;
		this.giaCoBan = giaCoBan;
	}

	public int getViTri() {
		return viTri;
	}

	public void setViTri(int viTri) {
		this.viTri = viTri;
	}

	public int getChiSoPhucVu() {
		return chiSoPhucVu;
	}

	public void setChiSoPhucVu(int chiSoPhucVu) {
		this.chiSoPhucVu = chiSoPhucVu;
	}

	public int getGiaCoBan() {
		return giaCoBan;
	}

	public void setGiaCoBan(int giaCoBan) {
		this.giaCoBan = giaCoBan;
	}
	@Override
    public void display() {
		System.out.println("--- THÔNG TIN PHÒNG ĐẶC BIỆT ---");
	    // Lấy từ lớp cha
	    System.out.println("Mã phòng       : " + getMaphong());
	    System.out.println("Tên phòng      : " + getTenphong());
	    
	    // Lấy từ chính lớp con thông qua Getter
	    System.out.println("Vị trí         : " + getViTri());
	    System.out.println("Chỉ số phục vụ : " + getChiSoPhucVu());
	    System.out.println("Giá cơ bản     : " + getGiaCoBan());
	    
	    // Tính toán dùng Getter
	    int donGiaThucTe = (getViTri() + getChiSoPhucVu()) * getGiaCoBan();
	    System.out.println("=> Đơn giá thực: " + donGiaThucTe + " VNĐ");
	    System.out.println("----------------------------------");
    }
}
