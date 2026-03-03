package OOP_CNTT;

public class CBGV extends Nguoi{
	private double luongCung;
    private double luongThuong;
    private double tienPhat;
	public CBGV()
	{
		
	}
    public CBGV(String hoTen, int tuoi, String queQuan, String maGiaovienn,double luongCung, double luongThuong, double tienPhat) {
		super(hoTen, tuoi, queQuan, maGiaovienn);
		this.luongCung = luongCung;
		this.luongThuong = luongThuong;
		this.tienPhat = tienPhat;
	}
	public double getLuongCung() {
		return luongCung;
	}
	public void setLuongCung(double luongCung) {
		this.luongCung = luongCung;
	}
	public double getLuongThuong() {
		return luongThuong;
	}
	public void setLuongThuong(double luongThuong) {
		this.luongThuong = luongThuong;
	}
	public double getTienPhat() {
		return tienPhat;
	}
	public void setTienPhat(double tienPhat) {
		this.tienPhat = tienPhat;
	}

	public double luongthat()
	{
		double lt=(getLuongCung()+getLuongThuong()) - getTienPhat();
		return lt;
	}
    @Override
    public void display() {
    	super.display();
    	System.out.println("Lương cứng: " + getLuongCung());
        System.out.println("Lương thưởng: " + getLuongThuong());
        System.out.println("Tiền phạt: " + getTienPhat());
        System.out.println("Lương Thật: " + luongthat());
        
    }
  
    
    
}
