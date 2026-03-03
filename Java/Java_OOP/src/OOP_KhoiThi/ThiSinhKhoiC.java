package OOP_KhoiThi;


public class ThiSinhKhoiC extends ThiSinh {
    // Các hằng số môn thi của khối C
    public static final String van = "Văn";
    public static final String su = "Sử";
    public static final String dia = "Địa";

    // Constructor rỗng
    public ThiSinhKhoiC() {

    }

    // Constructor đầy đủ tham số
    public ThiSinhKhoiC(String soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }

    // Các hàm Getter static để lấy tên môn thi
    public static String getVan() {
        return van;
    }

    public static String getSu() {
        return su;
    }

    public static String getDia() {
        return dia;
    }

    @Override
    public void display() {
        System.out.println("------------------------------");
    	// Gọi hàm display của lớp cha (ThiSinh) để in thông tin cá nhân
        super.display();
        // In thêm thông tin khối thi và các môn tương ứng
        System.out.println("Khối thi: C" + getVan() + ", " + getSu() + ", " + getDia());

    }
}