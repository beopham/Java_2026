package OOP_DeTai;

import java.util.ArrayList;

public class DeTaiUngDung extends DeTai {
	private int soluongsanphamthucte;
	private ArrayList<SanPham> danhsachsanpham;

	public DeTaiUngDung() {
		this.danhsachsanpham = new ArrayList<SanPham>();
	}

	public DeTaiUngDung(String madetai, String tendetai, String tenthanhvienchinh, int sothanhvien, int nambatdau,
			int soluongsanphamthucte, ArrayList<SanPham> danhsachsanpham) {
		super(madetai, tendetai, tenthanhvienchinh, sothanhvien, nambatdau);
		this.soluongsanphamthucte = soluongsanphamthucte;
		this.danhsachsanpham = danhsachsanpham;
	}

	public int getSoluongsanphamthucte() {
		return soluongsanphamthucte;
	}

	public void setSoluongsanphamthucte(int soluongsanphamthucte) {
		this.soluongsanphamthucte = soluongsanphamthucte;
	}

	public ArrayList<SanPham> getDanhsachsanpham() {
		return danhsachsanpham;
	}

	public void setDanhsachsanpham(ArrayList<SanPham> danhsachsanpham) {
		this.danhsachsanpham = danhsachsanpham;
	}

	@Override
	public void display() {
		System.out.println("Đề Tài ứng dụng");
		super.display();
		System.out.println("Số lượng sản phẩm thực tế đã triển khai :" + getSoluongsanphamthucte());
		for (SanPham sp : getDanhsachsanpham()) {
			sp.display();
		}
	}

	@Override
	public double tinhkinhphi() {
		double kinhphi = 0;
		for (SanPham sp : getDanhsachsanpham()) {
			double tienmucdo = 0;
			if (sp.getMucdoapdung().equalsIgnoreCase("Cao")) {
				tienmucdo = 10000000;

			}
			else if (sp.getMucdoapdung().equalsIgnoreCase("TB")) {
				tienmucdo = 5000000;

			}
			else if (sp.getMucdoapdung().equalsIgnoreCase("Thấp")) {
				tienmucdo = 2000000;

			}
			kinhphi+=tienmucdo;
//			System.out.println("Sản phẩm: " + sp.getTensp() + " | Mức độ: " + sp.getMucdoapdung() + " | Tiền: " + tienmucdo);
		}
         return kinhphi;
	}

	@Override
	public void danhgiahieuqua() {
		// TODO Auto-generated method stub
		if(danhsachsanpham.size()<1)
		{
			System.out.println("Không thành công");
		}
		else if(danhsachsanpham.size()  >=1 && danhsachsanpham.size() <=2)
		{
			System.out.println("thành công");
		}
		else if(danhsachsanpham.size()  >=3)
		{
			System.out.println("Xuất sắc");
		}
	}
	
	
}
