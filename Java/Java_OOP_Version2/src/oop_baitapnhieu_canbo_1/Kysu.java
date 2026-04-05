package oop_baitapnhieu_canbo_1;

public class Kysu extends CanBo {

	private String nganhdaotao;
	
	public Kysu()
	{
		
	}
	
	public Kysu(String hoten, int tuoi, String gioitinh, String diachi,String nganhdaotao) {
		super(hoten, tuoi, gioitinh, diachi);
		this.nganhdaotao = nganhdaotao;
	}

	public String getNganhdaotao() {
		return nganhdaotao;
	}

	public void setNganhdaotao(String nganhdaotao) {
		this.nganhdaotao = nganhdaotao;
	}

	@Override
	public void hienthi() {
		System.out.println("Thông tin kỹ sư");
		System.out.println("Họ tên: " + getHoten());
	    System.out.println("Tuổi: " + getTuoi());
	    System.out.println("Giới tính: " + getGioitinh());
	    System.out.println("Địa chỉ: " + getDiachi());
	    System.out.println("Ngành đào tạo: " + getNganhdaotao());
		
	}

}
