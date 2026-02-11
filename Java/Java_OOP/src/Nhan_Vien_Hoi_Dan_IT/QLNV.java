package Nhan_Vien_Hoi_Dan_IT;

public class QLNV {

	public static void main(String[] args) {
		NhanVien nv1 = new NhanVien("hoidanit", 25, "Sales", 8000.0, "ABC Corporation");
        
        // Khởi tạo nv2 với các thông tin của eric
        NhanVien nv2 = new NhanVien("eric", 30, "IT", 10000.0, "ABC Corporation");

        // Gọi hàm hiển thị
        nv1.showinfor();
        nv2.showinfor();
        nv1.raiseSalary(1);
        nv1.showinfor();
        nv1.setCompany("FPT");
        nv2.raiseSalary(1);

	}

}
