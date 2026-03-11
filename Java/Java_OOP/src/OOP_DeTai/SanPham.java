package OOP_DeTai;

public class SanPham {

    private String tensp;
	private int namtrienkhai;
	private String mucdoapdung ; // Mức độ áp dụng (Cao,Trung bình, Thấp)
	public SanPham()
	{
		
	}
	
	public SanPham(String tensp, int namtrienkhai, String mucdoapdung) {
		this.tensp = tensp;
		this.namtrienkhai = namtrienkhai;
		this.mucdoapdung = mucdoapdung;
	}

	public String getTensp() {
		return tensp;
	}
	public void setTensp(String tensp) {
		this.tensp = tensp;
	}
	public int getNamtrienkhai() {
		return namtrienkhai;
	}
	public void setNamtrienkhai(int namtrienkhai) {
		this.namtrienkhai = namtrienkhai;
	}
	public String getMucdoapdung() {
		return mucdoapdung;
	}
	public void setMucdoapdung(String mucdoapdung) {
		this.mucdoapdung = mucdoapdung;
	}
    public void display()
    {
    	System.out.println("Thông tin sản phẩm");
    	System.out.println("Tên sản phẩm : " +getTensp());
       	System.out.println("Năm Triển Khai : " +getNamtrienkhai());
       	System.out.println("Mức Độ áp Dụng : " +getMucdoapdung());
    	
    }
}
