package oop_baitapnhieu_quanlicanbo_1;

public class Nhanvien extends CanBo {

	private String congviec;
	public Nhanvien()
	{
		
	}


	public Nhanvien(String hoten, int tuoi, String gioitinh, String diachi,String congviec) {
		super(hoten, tuoi, gioitinh, diachi);
		this.congviec = congviec;
	}

	public String getCongviec() {
		return congviec;
	}


	public void setCongviec(String congviec) {
		this.congviec = congviec;
	}

	@Override
	public void hienthi() {
	    System.out.println("Thông tin nhân viên");
	    System.out.println("Họ tên: " + getHoten());
	    System.out.println("Tuổi: " + getTuoi());
	    System.out.println("Giới tính: " + getGioitinh());
	    System.out.println("Địa chỉ: " + getDiachi());
	    
	    // Lấy thông tin riêng của nhân viên bằng hàm getter
	    System.out.println("Công việc: " + getCongviec());
	    System.out.println("-----------------------");
	}

}
