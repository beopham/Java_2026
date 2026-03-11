package OOP_SinhVienKhoa15;

import java.util.ArrayList;

public class Khoa {
	private String tenkhoa;
	private ArrayList<SinhVien> danhsachsv;

	public Khoa() {
		this.danhsachsv = new ArrayList<SinhVien>();
	}

	public Khoa(String tenkhoa, ArrayList<SinhVien> danhsachsv) {
		this.tenkhoa = tenkhoa;
		this.danhsachsv = danhsachsv;
	}

	public String getTenkhoa() {
		return tenkhoa;
	}

	public void setTenkhoa(String tenkhoa) {
		this.tenkhoa = tenkhoa;
	}

	public ArrayList<SinhVien> getDanhsachsv() {
		return danhsachsv;
	}

	public void setDanhsachsv(ArrayList<SinhVien> danhsachsv) {
		this.danhsachsv = danhsachsv;
	}
    public void hienthi()
    {
    	System.out.println("Thông Tin Khoa");
    	System.out.println("Tên Khoa : " +getTenkhoa());
    	for(SinhVien sv : danhsachsv)
    	{
    		sv.hienThiThongTin();
    	}
    	
    }
}
