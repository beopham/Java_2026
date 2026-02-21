package OOP_Canbo;

public class KySu extends CanBo {
   private String nganhdaotao;
   
   public KySu()
   {
	   
   }

   public KySu(String ten, int tuoi, String gioitinh, String diachi,String nganhdaotao) {
	super(ten, tuoi, gioitinh, diachi);
     this.nganhdaotao=nganhdaotao;
   }

   public String getNganhdaotao() {
	return nganhdaotao;
   }

   public void setNganhdaotao(String nganhdaotao) {
	this.nganhdaotao = nganhdaotao;
   }
   @Override
   public void display() {
	    super.display();
	    System.out.println("Ngành Đào Tạo " + this.nganhdaotao); // In thêm thông tin riêng
	}
}
