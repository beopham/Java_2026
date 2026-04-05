package OOP_Youtube;

public class KenhAmNhac extends Kenh{

	private double soluongbaihattren1trieu;
	private double soluonghopdongquangcao;
	
	
	public KenhAmNhac() {
		super();
	}
	public KenhAmNhac(String tenkenh, String tenchukenh, double soluongnguoidanhgki,double soluongbaihattren1trieu, double soluonghopdongquangcao) {
		super(tenkenh, tenchukenh, soluongnguoidanhgki);
		this.soluongbaihattren1trieu = soluongbaihattren1trieu;
		this.soluonghopdongquangcao = soluonghopdongquangcao;
	}

	public double getSoluongbaihattren1trieu() {
		return soluongbaihattren1trieu;
	}
	public void setSoluongbaihattren1trieu(int soluongbaihattren1trieu) {
		this.soluongbaihattren1trieu = soluongbaihattren1trieu;
	}
	public double getSoluonghopdongquangcao() {
		return soluonghopdongquangcao;
	}
	public void setSoluonghopdongquangcao(int soluonghopdongquangcao) {
		this.soluonghopdongquangcao = soluonghopdongquangcao;
	}
	
	@Override
	public double doanhthu() {
		// TODO Auto-generated method stub
		double doanhthu=getSoluongbaihattren1trieu()*1000+getSoluonghopdongquangcao()*500;
		return doanhthu;
	}

	@Override
    public void hienthi() {
        System.out.println("===== THÔNG TIN KÊNH ÂM NHẠC =====");
        System.out.println("Tên kênh: " + getTenkenh());
        System.out.println("Chủ kênh: " + getTenchukenh());
        System.out.println("Số người đăng ký: " + (int)getSoluongnguoidanhgki());
        System.out.println("Số bài hát > 1 triệu view: " + (int)getSoluongbaihattren1trieu());
        System.out.println("Số hợp đồng quảng cáo: " + (int)getSoluonghopdongquangcao());
        System.out.println("Doanh thu tổng: " + doanhthu());
        System.out.println("==================================");
    }

}
