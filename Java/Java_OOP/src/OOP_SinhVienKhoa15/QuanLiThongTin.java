package OOP_SinhVienKhoa15;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLiThongTin {
	private ArrayList<Khoa> danhsachkhoa;
	private ArrayList<SinhVien> danhsachsinhvien;
	public Scanner nhap = new Scanner(System.in);

	public QuanLiThongTin() {
		this.danhsachkhoa = new ArrayList<Khoa>();
		this.danhsachsinhvien = new ArrayList<SinhVien>();
	}

	public QuanLiThongTin(ArrayList<Khoa> danhsachkhoa, ArrayList<SinhVien> danhsachsinhvien) {
		this.danhsachkhoa = danhsachkhoa;
		this.danhsachsinhvien = danhsachsinhvien;
	}

	public ArrayList<Khoa> getDanhsachkhoa() {
		return danhsachkhoa;
	}

	public void setDanhsachkhoa(ArrayList<Khoa> danhsachkhoa) {
		this.danhsachkhoa = danhsachkhoa;
	}

	public ArrayList<SinhVien> getDanhsachsinhvien() {
		return danhsachsinhvien;
	}

	public void setDanhsachsinhvien(ArrayList<SinhVien> danhsachsinhvien) {
		this.danhsachsinhvien = danhsachsinhvien;
	}

	public void themkhoa(Khoa khoa) {
		danhsachkhoa.add(khoa);
	}

	public void themsinhvien(SinhVien sv) {
		danhsachsinhvien.add(sv);
	}

	public ArrayList<KetQuaHocTap> themketquahctap() {
		ArrayList<KetQuaHocTap> ketqua = new ArrayList<KetQuaHocTap>();
		System.out.println("Nhập vào số học kì");
		int soketquahocki = nhap.nextInt();
		nhap.nextLine();
		for (int i = 0; i < soketquahocki; i++) {
			System.out.println("Kết quả học tập của kì đó(Giỏi/Khá/TB/Yếu)");
			String kq = nhap.nextLine();
			System.out.println("Điểm TB của học kì đó");
			double diemtb = nhap.nextDouble();
			nhap.nextLine();
			KetQuaHocTap kqht = new KetQuaHocTap(kq, diemtb);
			ketqua.add(kqht);
		}
		return ketqua;
	}

	public void ktrsinhviencq(String masv) {
		boolean ktr = false;
		for (SinhVien sv : danhsachsinhvien) {
			if (sv instanceof SinhVienChinhQuy && sv.getMaSV().equalsIgnoreCase(masv)) {
				System.out.println("Đây là sv chính quy");
			}
		}
		if (ktr == false) {
			System.out.println("k phải sv chính quy nha");
		}
	}

	public void laydiemtb(String hk) {
		boolean ktr = false;
		for (SinhVien sv : danhsachsinhvien) {
			sv.laydiemtb();
		}
		if (ktr == false) {
			System.out.println("k có thông tin sinh viên");
		}
	}

	public void tongsosvcq(String tenkhoa) {
		int dem = 0;
		for (Khoa kh : danhsachkhoa) {
			if (kh.getTenkhoa().equalsIgnoreCase(tenkhoa)) {
				for (SinhVien sv : kh.getDanhsachsv()) {
					if (sv instanceof SinhVienChinhQuy) {
						dem++;
					}
				}
			}

		}
		System.out.println("Tổng số sinh viên chính quy tại khoa " + tenkhoa + " Là " + dem);
	}

//	public void tongsosvcq(String tenKhoa) {
//	    for (Khoa kh : danhsachkhoa) {
//	        if (kh.getTenKhoa().equalsIgnoreCase(tenKhoa)) {
//	            long count = kh.getDanhsachsv().stream()
//	                           .filter(sv -> sv instanceof SinhVienChinhQuy)
//	                           .count();
//	            System.out.println("Tổng số SV chính quy: " + count);
//	        }
//	    }
//	}
	public void maxđiemauvaomoikhoa(String tenkhoa) {
		for (Khoa kh : danhsachkhoa) {
			if (kh.getTenkhoa().equalsIgnoreCase(tenkhoa)) {

				double max = kh.getDanhsachsv().stream().mapToDouble(SinhVien::getDiemDauVao).max().orElse(0);

				kh.getDanhsachsv().stream().filter(sv -> sv.getDiemDauVao() == max).forEach(sv -> sv.hienThiThongTin());
			}
		}

	}
	public void danhsachsvtainoilienketdaotao(String tenkhoa,String lienketdaotao)
	{
		for(Khoa kh : danhsachkhoa)
		{
			if(kh.getTenkhoa().equalsIgnoreCase(tenkhoa))
			{
				for(SinhVien sv : kh.getDanhsachsv())
				{
					if(sv instanceof SinhVienTaiChuc)
					{
					   SinhVienTaiChuc svtc=(SinhVienTaiChuc ) sv;
					   if(svtc.getNoilienketdaotao().equalsIgnoreCase(lienketdaotao))
					   {
						   svtc.hienthi();
					   }
					}
				}
			}
		}
	}
	public void timrasvcomaxdcaonhatomoiklhavaanyhockinao(String tenkhoa,String hocki)
	{
		for(Khoa kh : danhsachkhoa)
		{
			if(kh.getTenkhoa().equalsIgnoreCase(tenkhoa))
			{
				for(SinhVien sv : kh.getDanhsachsv())
				{
					
				}
			}
		}
	}
	
}
