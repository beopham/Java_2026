package OOP_CongAn;

public class XeTai extends PhuongTien {
	private double trongTai; // Thuộc tính riêng
    public XeTai()
    {
    	
    }
    public XeTai(String id, String hangSX, int namSX, double giaBan, String mauXe, double trongTai) {
        super(id, hangSX, namSX, giaBan, mauXe);
        this.trongTai = trongTai;
    }


    public double getTrongTai() {
		return trongTai;
	}
	public void setTrongTai(double trongTai) {
		this.trongTai = trongTai;
	}
	@Override
    public void display() {
        super.display(); // Gọi display của cha
        System.out.println("Trọng tải: " + getTrongTai());
    }
}
