package OOP_TailIeu;

public class Sach extends TaiLieu{
    private String tentacgia;
    private int sotrang;
    
    public Sach()
    {
    	
    }

	public Sach(String maTaiLieu, String tenNXB, int soBanPhatHanh,String tentacgia,int sotrang) {
		super(maTaiLieu, tenNXB, soBanPhatHanh);
         this.tentacgia=tentacgia;
         this.sotrang=sotrang;
	}

	public String getTentacgia() {
		return tentacgia;
	}

	public void setTentacgia(String tentacgia) {
		this.tentacgia = tentacgia;
	}

	public int getSotrang() {
		return sotrang;
	}

	public void setSotrang(int sotrang) {
		this.sotrang = sotrang;
	}
	@Override
    public void display() {
        // Gọi hàm display của lớp TaiLieu để in MaTL, TenNXB, SoBanPH
        System.out.println("Sách");
        super.display(); 
        // In thêm thuộc tính riêng của Sách
        System.out.println("Ten tac gia: " + tentacgia);
        System.out.println("So trang: " + sotrang);
        System.out.println("---------------------------");
    }
}
