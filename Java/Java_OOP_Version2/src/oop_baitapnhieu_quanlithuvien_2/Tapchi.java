package oop_baitapnhieu_quanlithuvien_2;

public class Tapchi extends Tailieu {
   private int sophathanh;
   private int thangphathanh;
   
   public Tapchi()
   {
	   
   }

   public Tapchi(int matailieu, String tennhaxb, String sobanphathanh,int sophathanh, int thangphathanh) {
	super(matailieu, tennhaxb, sobanphathanh);
	this.sophathanh = sophathanh;
	this.thangphathanh = thangphathanh;
   }

   public int getSophathanh() {
	return sophathanh;
   }

   public void setSophathanh(int sophathanh) {
	this.sophathanh = sophathanh;
   }

   public int getThangphathanh() {
	return thangphathanh;
   }

   public void setThangphathanh(int thangphathanh) {
	this.thangphathanh = thangphathanh;
   }

   @Override
   public void hienthi() {
       // Lấy thông tin từ lớp cha Tailieu bằng các hàm get
	   System.out.println("Thông tin tạp chí");
       System.out.println("Mã tài liệu: " + getMatailieu());
       System.out.println("Nhà xuất bản: " + getTennhaxb());
       System.out.println("Số bản phát hành: " + getSobanphathanh());
       
       // Lấy thông tin riêng của lớp Bao bằng các hàm get
       System.out.println("Ngày phát hành (số tạp chí): " + getSophathanh());
       System.out.println("Tháng phát hành: " + getThangphathanh());
       System.out.println("----------------------------");
   }
}
