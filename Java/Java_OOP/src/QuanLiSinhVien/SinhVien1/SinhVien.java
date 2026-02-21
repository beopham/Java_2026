package QuanLiSinhVien.SinhVien1;

public class SinhVien {
   private int id;
   private String ten;
   private int tuoi;
   private Double gpa;
   
   public SinhVien()
   {
	   
   }

   public SinhVien(int id, String ten, int tuoi, Double gpa) {

	this.id = id;
	this.ten = ten;
	this.tuoi = tuoi;
	this.gpa = gpa;
   }

   public int getId() {
	return id;
   }

   public void setId(int id) {
	this.id = id;
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

   public Double getGpa() {
	return gpa;
   }

   public void setGpa(Double gpa) {
	this.gpa = gpa;
   }
   public void display() {
	    System.out.println("------------------------------");
	    System.out.println("ID: " + this.id);
	    System.out.println("Tên: " + this.ten);
	    System.out.println("Tuổi: " + this.tuoi);
	    System.out.println("GPA: " + this.gpa);
	    System.out.println("------------------------------");
	}
}
