package OOP_SinhVienKhoa15;

import java.util.ArrayList;

public class SinhVienTaiChuc extends SinhVien {
	private String noilienketdaotao;

	public SinhVienTaiChuc() {

	}

	public SinhVienTaiChuc(String maSV, String hoTen, String ngaySinh, int namVaoHoc, double diemDauVao,
			ArrayList<KetQuaHocTap> dsKetQua, String noilienketdaotao) {
		super(maSV, hoTen, ngaySinh, namVaoHoc, diemDauVao, dsKetQua);
		this.noilienketdaotao = noilienketdaotao;
	}

	public String getNoilienketdaotao() {
		return noilienketdaotao;
	}

	public void setNoilienketdaotao(String noilienketdaotao) {
		this.noilienketdaotao = noilienketdaotao;
	}

	public void hienthi() {
		System.out.println("Thông Tin Sinh Viên Tại Chức");
		super.hienThiThongTin();
		System.out.println("Nơi Liên Kết Đào Tạo Là" + getNoilienketdaotao());
	}
}
