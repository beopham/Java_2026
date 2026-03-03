package OOP_CongAn;

public class OTo extends PhuongTien{
	private int soChoNgoi;
    private String kieuDongCo;
    public OTo()
    {
    	
    }
	public OTo(String id, String hangSX, int namSX, double giaBan, String mauXe,int soChoNgoi, String kieuDongCo) {
		super(id,hangSX,namSX,giaBan,mauXe);
		this.soChoNgoi = soChoNgoi;
		this.kieuDongCo = kieuDongCo;
	}
	public int getSoChoNgoi() {
		return soChoNgoi;
	}
	public void setSoChoNgoi(int soChoNgoi) {
		this.soChoNgoi = soChoNgoi;
	}
	public String getKieuDongCo() {
		return kieuDongCo;
	}
	public void setKieuDongCo(String kieuDongCo) {
		this.kieuDongCo = kieuDongCo;
	}
    @Override
    public void display() {
    	super.display();
    	System.out.println("Số chổ ngồi Ô tô là" +getSoChoNgoi());
    	System.out.println("Kiểu Động Cơ Ô tô là" +getKieuDongCo());
    }
}
