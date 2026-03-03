package OOP_CongAn;

public class PhuongTien {
	private String id;
    private String hangSX;
    private int namSX;
    private double giaBan;
    private String mauXe;
    
    public PhuongTien()
    {
    	
    }

	public PhuongTien(String id, String hangSX, int namSX, double giaBan, String mauXe) {
		this.id = id;
		this.hangSX = hangSX;
		this.namSX = namSX;
		this.giaBan = giaBan;
		this.mauXe = mauXe;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getHangSX() {
		return hangSX;
	}

	public void setHangSX(String hangSX) {
		this.hangSX = hangSX;
	}

	public int getNamSX() {
		return namSX;
	}

	public void setNamSX(int namSX) {
		this.namSX = namSX;
	}

	public double getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}

	public String getMauXe() {
		return mauXe;
	}

	public void setMauXe(String mauXe) {
		this.mauXe = mauXe;
	}
	public void display() {
        System.out.println("------------------------------");
        System.out.println("ID: " + getId());
        System.out.println("Hãng sản xuất: " + getHangSX());
        System.out.println("Năm sản xuất: " + getNamSX());
        System.out.println("Giá bán: " + getGiaBan());
        System.out.println("Màu xe: " + getMauXe());
    }
	
}
