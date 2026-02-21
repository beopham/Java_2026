package OOP_Canbo;

public class CanBo {
  private String ten;
  private int tuoi;
  private String gioitinh;
  private String diachi;
  public CanBo()
  {
	  
  }

  public CanBo(String ten, int tuoi, String gioitinh, String diachi) {
	this.ten = ten;
	this.tuoi = tuoi;
	this.gioitinh = gioitinh;
	this.diachi = diachi;
  }

  public String getTen() {
	return ten;
  }

  public void setTen(String ten) {
	this.ten = ten;
  }

  public int getTuoi() {
	return tuoi;
  }

  public void setTuoi(int tuoi) {
	this.tuoi = tuoi;
  }

  public String getGioitinh() {
	return gioitinh;
  }

  public void setGioitinh(String gioitinh) {
	this.gioitinh = gioitinh;
  }

  public String getDiachi() {
	return diachi;
  }

  public void setDiachi(String diachi) {
	this.diachi = diachi;
  }
  public void display() {
	    System.out.println("------------------------------");
	    System.out.println("Họ tên: " + this.ten);
	    System.out.println("Tuổi: " + this.tuoi);
	    System.out.println("Giới tính: " + this.gioitinh);
	    System.out.println("Địa chỉ: " + this.diachi);
	}
}
