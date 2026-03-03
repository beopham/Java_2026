package OOP_KhoiThi;

public class ThiSinhKhoiA extends ThiSinh{
    public static final String toan="Toán";
    public static final String li="Lí";
    public static final String hoa="Hoá";
	public ThiSinhKhoiA() {

	}
	public ThiSinhKhoiA(String soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
		super(soBaoDanh, hoTen, diaChi, mucUuTien);
	}
	public static String getToan() {
		return toan;
	}
	public static String getLi() {
		return li;
	}
	public static String getHoa() {
		return hoa;
	}
	
	@Override
	public void display() {
	    System.out.println("------------------------------");
	    super.display();
	    System.out.println("Khối Thi A có các môn" +getToan()+" " + getLi() +" " +getHoa());
	}
}
