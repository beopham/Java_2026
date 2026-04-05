package OOP_Youtube;

public abstract class Kenh {
   private String tenkenh;
   private String tenchukenh;
   private double Soluongnguoidanhgki;
   
   public Kenh()
   {
	   
   }

   public Kenh(String tenkenh, String tenchukenh, double soluongnguoidanhgki) {

	this.tenkenh = tenkenh;
	this.tenchukenh = tenchukenh;
	this.Soluongnguoidanhgki = soluongnguoidanhgki;
}

   public String getTenkenh() {
	return tenkenh;
   }

   public void setTenkenh(String tenkenh) {
	this.tenkenh = tenkenh;
   }

   public String getTenchukenh() {
	return tenchukenh;
   }

   public void setTenchukenh(String tenchukenh) {
	this.tenchukenh = tenchukenh;
   }

   public double getSoluongnguoidanhgki() {
	return Soluongnguoidanhgki;
   }

   public void setSoluongnguoidanhgki(double soluongnguoidanhgki) {
	this.Soluongnguoidanhgki = soluongnguoidanhgki;
   }
   public abstract double doanhthu();
   public abstract void hienthi();
   
}
