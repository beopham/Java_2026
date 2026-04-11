package oop_baitapnhieu_quanlithuvien_2;

public class Sach extends Tailieu {
     private String tentacgia;
     private int sotrang;
     
     
     public Sach()
     {
    	 
     }
     
  
	 public Sach(int matailieu, String tennhaxb, String sobanphathanh,String tentacgia, int sotrang) {
		super(matailieu, tennhaxb, sobanphathanh);
		this.tentacgia = tentacgia;
		this.sotrang = sotrang;
	}
     
	 public String getTentacgia() {
		return tentacgia;
	}


	 public void setTentacgia(String tentacgia) {
		 this.tentacgia = tentacgia;
	 }


	 public int getSotrang() {
		 return sotrang;
	 }


	 public void setSotrang(int sotrang) {
		 this.sotrang = sotrang;
	 }


	 @Override
	 public void hienthi() {
		 System.out.println("Thông tin sách");
	     // Gọi các phương thức get từ lớp cha Tailieu
	     System.out.println("Mã tài liệu: " + getMatailieu());
	     System.out.println("Nhà xuất bản: " + getTennhaxb());
	     System.out.println("Số bản phát hành: " + getSobanphathanh());
	     
	     // Gọi các phương thức get của lớp Sach
	     System.out.println("Tên tác giả: " + getTentacgia());
	     System.out.println("Số trang: " + getSotrang());
	     System.out.println("----------------------------");
	 }
     
}
