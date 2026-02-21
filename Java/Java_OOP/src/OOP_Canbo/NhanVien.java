package OOP_Canbo;

public class NhanVien extends CanBo{
   private String congviec;
   
   public NhanVien()
   {
	   
   }

   public NhanVien(String ten, int tuoi, String gioitinh, String diachi,String congviec) {
	super(ten, tuoi, gioitinh, diachi);
    this.congviec=congviec;
   }

   public String getCongviec() {
	return congviec;
   }

   public void setCongviec(String congviec) {
	this.congviec = congviec;
   }
   @Override
   public void display() {
	    super.display();
	    System.out.println("Công Việc " + this.congviec); // In thêm thông tin riêng
	}
}
