package OOP_CongAn;

public class XeMay extends PhuongTien{
	private double congSuat;
	public XeMay()
	{
		

	}


	public XeMay(String id, String hangSX, int namSX, double giaBan, String mauXe,double congSuat) {
		super(id, hangSX, namSX, giaBan, mauXe);
		this.congSuat = congSuat;
	}


	public double getCongSuat() {
		return congSuat;
	}


	public void setCongSuat(double congSuat) {
		this.congSuat = congSuat;
	}
	@Override
    public void display() {
        super.display(); // Gọi display của cha (đã dùng các hàm get)
        System.out.println("Công suất: " + getCongSuat());
    }
}
