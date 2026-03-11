package OOP_CtyDuLich;

public class TourTrongNuoc extends Tour{
	private String thanhPho;
	
	public TourTrongNuoc()
	{
		
	}


	public TourTrongNuoc(String maSo, String tenTour, int soLuongKhach, double donGiaKhach, int phiHuongDan,String thanhPho) {
		super(maSo, tenTour, soLuongKhach, donGiaKhach, phiHuongDan);
		this.thanhPho = thanhPho;
	}


	public String getThanhPho() {
		return thanhPho;
	}


	public void setThanhPho(String thanhPho) {
		this.thanhPho = thanhPho;
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Tour trong nước");
		super.display();
		System.out.println("Thành Phố " +getThanhPho());
	}
}
