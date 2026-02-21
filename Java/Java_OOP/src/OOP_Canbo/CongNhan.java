package OOP_Canbo;

public class CongNhan extends CanBo {
   private String bac;

   /**
    * 
    */
   public CongNhan() {

   }

   public CongNhan(String ten, int tuoi, String gioitinh, String diachi,String bac) {
	super(ten, tuoi, gioitinh, diachi);
	this.bac=bac;
   }

   public String getBac() {
	return bac;
   }

   public void setBac(String bac) {
	this.bac = bac;
   }
   @Override
   public void display() {
	    super.display();
	    System.out.println("Bậc thợ: " + this.bac); // In thêm thông tin riêng
	}
}
