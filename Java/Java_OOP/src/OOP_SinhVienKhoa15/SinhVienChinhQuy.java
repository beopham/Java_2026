package OOP_SinhVienKhoa15;

import java.util.ArrayList;

public class SinhVienChinhQuy extends SinhVien{
    public SinhVienChinhQuy()
    {
    	
    }

	public SinhVienChinhQuy(String maSV, String hoTen, String ngaySinh, int namVaoHoc, double diemDauVao,
			ArrayList<KetQuaHocTap> dsKetQua) {
		super(maSV, hoTen, ngaySinh, namVaoHoc, diemDauVao, dsKetQua);

	}
    @Override
    public void hienThiThongTin() {
    	System.out.println("Thông Tin SInh Viên Chính Quy");
    	super.hienThiThongTin();
    }
}
