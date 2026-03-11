package OOP_CtyDuLich;

public class TourNuocNgoai extends Tour{
	private String quocGia;
    private double heSoTour;
    
    public TourNuocNgoai()
    {
    	
    }
    
    public TourNuocNgoai(String maSo, String tenTour, int soKhach, double gia, int phi, String quocGia, double heSo) {
        super(maSo, tenTour, soKhach, gia, phi);
        this.quocGia = quocGia;
        this.heSoTour = heSo;
    }
	public String getQuocGia() {
		return quocGia;
	}
	public void setQuocGia(String quocGia) {
		this.quocGia = quocGia;
	}
	public double getHeSoTour() {
		return heSoTour;
	}
	public void setHeSoTour(double heSoTour) {
		this.heSoTour = heSoTour;
	}
	@Override
    public void display() {
		System.out.println("Tour nước ngoài");
        super.display();
        System.out.println("Quốc gia: " + getQuocGia());
        System.out.println("Hệ số tour: " + getHeSoTour());
    }
}
