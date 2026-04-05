package OOP_Youtube;

public class KenhNauAn extends Kenh {

	private double tongsoluongxemkenh;
	
	public KenhNauAn() {
		super();
		// TODO Auto-generated constructor stub
	}

	public KenhNauAn(String tenkenh, String tenchukenh, double soluongnguoidanhgki,double tongsoluongxemkenh) {
		super(tenkenh, tenchukenh, soluongnguoidanhgki);
		this.tongsoluongxemkenh = tongsoluongxemkenh;
	}

	public double getTongsoluongxemkenh() {
		return tongsoluongxemkenh;
	}

	public void setTongsoluongxemkenh(double tongsoluongxemkenh) {
		this.tongsoluongxemkenh = tongsoluongxemkenh;
	}

	@Override
	public double doanhthu() {
		double doanhthu=getSoluongnguoidanhgki()*200+getTongsoluongxemkenh()* 0.5;
		return doanhthu;
	}

	@Override
	public void hienthi() {
		System.out.println("===== THÔNG TIN KÊNH NẤU ĂN =====");
        System.out.println("Tên kênh: " + getTenkenh());
        System.out.println("Chủ kênh: " + getTenchukenh());
        System.out.println("Số người đăng ký: " +(int) getSoluongnguoidanhgki());
        System.out.println("Tổng lượt xem: " +(int) getTongsoluongxemkenh());
        System.out.println("Doanh thu: " + (int)doanhthu());
        System.out.println("=================================");
		
	}

}
