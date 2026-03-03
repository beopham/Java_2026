package OOP_Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
        EmployeeManager quanlinhanvien=new EmployeeManager();
        Scanner nhap = new Scanner(System.in);
        
        while(true)
        {
        	System.out.println("\n   HỆ THỐNG QUẢN LÝ NHÂN VIÊN VKU");
            System.out.println(" 1. Thêm nhân viên Intern (Thực tập sinh)");
            System.out.println(" 2. Thêm nhân viên Fresher (Mới tốt nghiệp)");
            System.out.println(" 3. Thêm nhân viên Experience (Kinh nghiệm)");
            System.out.println(" 4. Sửa thông tin nhân viên theo ID (Yêu cầu 7)");
            System.out.println(" 5. Xóa nhân viên theo ID");
            System.out.println(" 6. Liệt kê tất cả Intern");
            System.out.println(" 7. Liệt kê tất cả Experience");
            System.out.println(" 8. Liệt kê tất cả Fresher");
            System.out.println(" 9. Xem nhân viên");
            System.out.println(" 0. Thoát chương trình");
            System.out.print("Mời Nam chọn chức năng: ");
            int chon =nhap.nextInt();
            nhap.nextLine();
            if(chon==1)
            {
            	System.out.println("--- NHẬP THÔNG TIN INTERN MỚI ---");
                
                // 1. Nhập ID (Không cần check regex phức tạp)
                System.out.println("Nhập ID nhân viên intern:");
                String id = nhap.nextLine();
                while(true)
                {
                	try {
						System.out.println("nhập vào tên ");
						String ten=nhap.nextLine();
						if(Validator.checTen(ten))
						{
							break;
						}
							
					} catch (loiten e) {
						System.out.println(e.getMessage());
					}
                }
                while(true)
                {
                	try {
						System.out.println("nhập vào ngày sinh ");
						String ngaysinh=nhap.nextLine();
						if(Validator.checkngaysinh(ngaysinh))
						{
							break;
						}
							
					} catch (loingaysinh e) {
						System.out.println(e.getMessage());
					}
                }
                while(true)
                {
                	try {
						System.out.println("nhập vào số điện thoại ");
						String sdt=nhap.nextLine();
						if(Validator.checksdth(sdt))
						{
							break;
						}
							
					} catch (loisdt e) {
						System.out.println(e.getMessage());
					}
                }
                while(true)
                {
                	try {
						System.out.println("nhập vào email ");
						String email=nhap.nextLine();
						if(Validator.checkemail(email))
						{
							break;
						}
							
					} catch (loiemail e) {
						System.out.println(e.getMessage());
					}
                }
                System.out.println("Nhập vào loại nhân viên bấm số 1");
                int loainhanvien=nhap.nextInt();
                nhap.nextLine();
                System.out.println("--- NHẬP THÔNG TIN CHỨNG CHỈ ---");

                System.out.println("Nhập ID chứng chỉ:");
                String idcc = nhap.nextLine();

                System.out.println("Nhập tên chứng chỉ:");
                String name = nhap.nextLine();

                System.out.println("Nhập xếp loại chứng chỉ (Xuất sắc, Giỏi, Khá...):");
                String rank = nhap.nextLine();

                // Chỗ này nếu ông muốn gắt hơn, có thể dùng Validator để check định dạng ngày
                System.out.println("Nhập ngày cấp chứng chỉ (dd/MM/yyyy):");
                String date = nhap.nextLine();
                Certificate cc=new Certificate(idcc, name, rank, date);
                ArrayList<Certificate> danhsachcc= new ArrayList<Certificate>();
                danhsachcc.add(cc);
                System.out.println("Nhập chuyên ngành đang học (Majors):");
                String majors = nhap.nextLine();

                System.out.println("Nhập học kỳ đang học (Semester):");
                String semester = nhap.nextLine();

                System.out.println("Nhập tên trường đại học đang theo học (University Name):");
                String universityName = nhap.nextLine();
                Intern sv=new Intern(idcc, name, name, rank, date, loainhanvien, danhsachcc, majors, semester, universityName);
                quanlinhanvien.them(sv);
            }
            else if (chon==9)
            {
               quanlinhanvien.hienthiall();
			}
        }
	}
}
