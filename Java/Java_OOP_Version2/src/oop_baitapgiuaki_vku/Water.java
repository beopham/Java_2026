package oop_baitapgiuaki_vku;

public class Water {
	
	private String manuoc;
	private int gia;
    public Water()
    {
    	
    }
    
	public Water(String manuoc, int gia) {

		this.manuoc = manuoc;
		this.gia = gia;
	}

	public String getManuoc() {
		return manuoc;
	}
	public void setManuoc(String manuoc) {
		this.manuoc = manuoc;
	}
	public int getGia() {
		return gia;
	}
	public void setGia(int gia) {
		this.gia = gia;
	}
	public void hienthi() {
	    System.out.println("Mã nước: " + this.getManuoc());
	    System.out.println("Giá: " + this.getGia());
	}
}
