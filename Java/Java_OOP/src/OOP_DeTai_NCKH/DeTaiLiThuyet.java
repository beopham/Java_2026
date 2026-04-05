package OOP_DeTai_NCKH;

public class DeTaiLiThuyet extends DeTai {
	private int soluongbaibaodccongbo;
	private int soluonghoinghikhoahocdcthamgia;

	public DeTaiLiThuyet() {

	}

	public DeTaiLiThuyet(String madetai, String tendetai, String tenthanhvienchinh, int sothanhvien, int nambatdau,
			int soluongbaibaodccongbo, int soluonghoinghikhoahocdcthamgia) {
		super(madetai, tendetai, tenthanhvienchinh, sothanhvien, nambatdau);
		this.soluongbaibaodccongbo = soluongbaibaodccongbo;
		this.soluonghoinghikhoahocdcthamgia = soluonghoinghikhoahocdcthamgia;
	}

	public int getSoluongbaibaodccongbo() {
		return soluongbaibaodccongbo;
	}

	public void setSoluongbaibaodccongbo(int soluongbaibaodccongbo) {
		this.soluongbaibaodccongbo = soluongbaibaodccongbo;
	}

	public int getSoluonghoinghikhoahocdcthamgia() {
		return soluonghoinghikhoahocdcthamgia;
	}

	public void setSoluonghoinghikhoahocdcthamgia(int soluonghoinghikhoahocdcthamgia) {
		this.soluonghoinghikhoahocdcthamgia = soluonghoinghikhoahocdcthamgia;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Đề Tài Lí Thuyết");
		super.display();
		System.out.println("Số Lượng Bài Báo Được Công Bố : " + getSoluongbaibaodccongbo());
		System.out.println("Số Lượng Hội Nghị Được Tham Gia : " + getSoluonghoinghikhoahocdcthamgia());
	}

	@Override
	public double  tinhkinhphi() {
		// Kinh phí hỗ trợ = (Số bài báo * 3,000,000 VNĐ) + (Số hội nghị * 2,000,000
		// VNĐ)
		double kinhphi = (getSoluongbaibaodccongbo() * 3000000) + (getSoluonghoinghikhoahocdcthamgia() * 2000000);
		//System.out.println("Kinh phí đề tài lí thuyết : " + kinhphi);
		return kinhphi ;

	}

	@Override
	public void danhgiahieuqua() {
		// TODO Auto-generated method stub
		int danhgiahieuqua=getSoluongbaibaodccongbo()+getSoluonghoinghikhoahocdcthamgia();
		if(danhgiahieuqua<1)
		{
			System.out.println("Không thành công");
		}
		else if(danhgiahieuqua >=1 && danhgiahieuqua <=3)
		{
			System.out.println("thành công");
		}
		else if(danhgiahieuqua >3)
		{
			System.out.println("Xuất sắc");
		}
	}

}
