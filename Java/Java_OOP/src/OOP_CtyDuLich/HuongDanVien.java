package OOP_CtyDuLich;

import java.util.ArrayList;

public class HuongDanVien extends NhanVien {

	private int luongcung;
	private ArrayList<Tour> danhsachtour;
	

	public HuongDanVien() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HuongDanVien(String maSo, String hoTen, String diaChi, String soDienThoai,int luongcung, ArrayList<Tour> danhsachtour) {
		super(maSo, hoTen, diaChi, soDienThoai);
		this.luongcung = luongcung;
		this.danhsachtour = danhsachtour;
	}
	public int getLuongcung() {
		return luongcung;
	}

	public void setLuongcung(int luongcung) {
		this.luongcung = luongcung;
	}

	public ArrayList<Tour> getDanhsachtour() {
		return danhsachtour;
	}

	public void setDanhsachtour(ArrayList<Tour> danhsachtour) {
		this.danhsachtour = danhsachtour;
	}

	public void add(Tour tour)
	{
		if(danhsachtour.size()<5)
		{
			danhsachtour.add(tour);
		}
		else
		{
			System.out.println("bạn chỉ đc nhập tối đa 5 tour");
		}
	}
	
	@Override
	public double tinhluong() {
       double luong=0;
		for(Tour tour : danhsachtour)
		{
			if(tour instanceof TourNuocNgoai)
			{
				//luong cứng =6
				//luong=getLuongcung()
			}
		}
		return luong;
	}

}
