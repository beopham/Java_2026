package OOP_CtyDuLich;

public class Tour {
	private String maSo;
    private String tenTour;
    private int soLuongKhach;
    private double donGiaKhach; // Triệu đồng
    private int phiHuongDan;    // Triệu đồng
    
    
    public Tour()
    {
    	
    }


	public Tour(String maSo, String tenTour, int soLuongKhach, double donGiaKhach, int phiHuongDan) {

		this.maSo = maSo;
		this.tenTour = tenTour;
		this.soLuongKhach = soLuongKhach;
		this.donGiaKhach = donGiaKhach;
		this.phiHuongDan = phiHuongDan;
	}


	public String getMaSo() {
		return maSo;
	}


	public void setMaSo(String maSo) {
		this.maSo = maSo;
	}


	public String getTenTour() {
		return tenTour;
	}


	public void setTenTour(String tenTour) {
		this.tenTour = tenTour;
	}


	public int getSoLuongKhach() {
		return soLuongKhach;
	}


	public void setSoLuongKhach(int soLuongKhach) {
		this.soLuongKhach = soLuongKhach;
	}


	public double getDonGiaKhach() {
		return donGiaKhach;
	}


	public void setDonGiaKhach(double donGiaKhach) {
		this.donGiaKhach = donGiaKhach;
	}


	public int getPhiHuongDan() {
		return phiHuongDan;
	}


	public void setPhiHuongDan(int phiHuongDan) {
		this.phiHuongDan = phiHuongDan;
	}
	public void display() {
        System.out.println("Mã số: " + getMaSo());
        System.out.println("Tên tour: " + getTenTour());
        System.out.println("Số lượng khách: " + getSoLuongKhach());
        System.out.println("Đơn giá/khách: " + getDonGiaKhach() + "tr");
        System.out.println("Phí hướng dẫn: " + getPhiHuongDan() + "tr");
    }
}
