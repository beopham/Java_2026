package oop_baitapnhieu_quanlithuvien_2;

public abstract class Tailieu {
	//Mã tài liệu(Mã tài liệu là duy nhất), Tên nhà xuất bản, số bản phát hành.
	 private int matailieu;
	 private String tennhaxb;
	 private String sobanphathanh;
	 
	 public Tailieu()
	 {
		 
	 }

	 public Tailieu(int matailieu, String tennhaxb, String sobanphathanh) {

		this.matailieu = matailieu;
		this.tennhaxb = tennhaxb;
		this.sobanphathanh = sobanphathanh;
	 }

	 public int getMatailieu() {
		 return matailieu;
	 }

	 public void setMatailieu(int matailieu) {
		 this.matailieu = matailieu;
	 }

	 public String getTennhaxb() {
		 return tennhaxb;
	 }

	 public void setTennhaxb(String tennhaxb) {
		 this.tennhaxb = tennhaxb;
	 }

	 public String getSobanphathanh() {
		 return sobanphathanh;
	 }

	 public void setSobanphathanh(String sobanphathanh) {
		 this.sobanphathanh = sobanphathanh;
	 }
     public abstract void  hienthi() ;	 
}
