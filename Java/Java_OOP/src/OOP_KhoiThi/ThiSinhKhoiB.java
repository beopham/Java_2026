package OOP_KhoiThi;

public class ThiSinhKhoiB extends ThiSinh {
    public static final String toan="Toán";
    public static final String hoa="Hoá";
    public static final String sinh="Sinh";
	public ThiSinhKhoiB() {
		
	}
	public ThiSinhKhoiB(String soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
		super(soBaoDanh, hoTen, diaChi, mucUuTien);
		// TODO Auto-generated constructor stub
	}
	public static String getToan() {
		return toan;
	}
	public static String getHoa() {
		return hoa;
	}
	public static String getSinh() {
		return sinh;
	}
	@Override
	public void display() {
	    System.out.println("------------------------------");
	    super.display();
	    System.out.println("Khối Thi B có các môn" +getToan()+" " + getHoa() +" " +getSinh());
	}
    
}
