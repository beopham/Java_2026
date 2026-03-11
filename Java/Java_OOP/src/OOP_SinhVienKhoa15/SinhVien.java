package OOP_SinhVienKhoa15;

import java.util.ArrayList;

public class SinhVien {
	private String maSV;
    private String hoTen;
    private String ngaySinh; // Có thể dùng kiểu Date hoặc String
    private int namVaoHoc;
    private double diemDauVao;
    private ArrayList<KetQuaHocTap> dsKetQua;
    
    public SinhVien()
    {
    	this.dsKetQua=new ArrayList<KetQuaHocTap>();
    }

	public SinhVien(String maSV, String hoTen, String ngaySinh, int namVaoHoc, double diemDauVao,
			ArrayList<KetQuaHocTap> dsKetQua) {
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.namVaoHoc = namVaoHoc;
		this.diemDauVao = diemDauVao;
		this.dsKetQua = dsKetQua;
	}

	public String getMaSV() {
		return maSV;
	}

	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public int getNamVaoHoc() {
		return namVaoHoc;
	}

	public void setNamVaoHoc(int namVaoHoc) {
		this.namVaoHoc = namVaoHoc;
	}

	public double getDiemDauVao() {
		return diemDauVao;
	}

	public void setDiemDauVao(double diemDauVao) {
		this.diemDauVao = diemDauVao;
	}

	public ArrayList<KetQuaHocTap> getDsKetQua() {
		return dsKetQua;
	}

	public void setDsKetQua(ArrayList<KetQuaHocTap> dsKetQua) {
		this.dsKetQua = dsKetQua;
	}
	public void hienThiThongTin() {
	    System.out.println("--- Thông tin sinh viên ---");
	    System.out.println("Mã sinh viên: " + this.getMaSV());
	    System.out.println("Họ tên: " + this.getHoTen());
	    System.out.println("Ngày sinh: " + this.getNgaySinh());
	    System.out.println("Năm vào học: " + this.getNamVaoHoc());
	    System.out.println("Điểm đầu vào: " + this.getDiemDauVao());
	    for(KetQuaHocTap kq : dsKetQua)
	    {
	    	kq.display();
	    }
	}
	public void laydiemtb()
	{
		  for(KetQuaHocTap kq : dsKetQua)
		    {
		    	kq.display();
		    }
	}
}
