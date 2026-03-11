package OOP_Employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EmployeeManager {
	private ArrayList<Employee> nhanvien;
	public Scanner nhap = new Scanner(System.in);

	public EmployeeManager() {
		this.nhanvien = new ArrayList<Employee>();
	}

	public EmployeeManager(ArrayList<Employee> nhanvien) {
		this.nhanvien = nhanvien;
	}

	public void them(Employee emp) {
		nhanvien.add(emp);
	
	}

	public void xoaInternTheoID(String id) {
		// Chỉ xóa nếu thỏa mãn CẢ HAI điều kiện: Trùng ID VÀ là Intern
		boolean ok = nhanvien.removeIf(emp -> emp.getId().equalsIgnoreCase(id) && (emp instanceof Intern));
		if (ok) {
			System.out.println("đã xóa thành công");
		} else if (ok == false) {
			System.out.println("k có thông tin để xóa");
		}
	}

	public void xoaExpTheoID(String id) {
		// Chỉ xóa nếu thỏa mãn CẢ HAI điều kiện: Trùng ID VÀ là Intern
		boolean ok = nhanvien.removeIf(emp -> emp.getId().equalsIgnoreCase(id) && (emp instanceof Experience));
		if (ok) {
			System.out.println("đã xóa thành công");
		} else if (ok == false) {
			System.out.println("k có thông tin để xóa");
		}
	}

	public void xoaFresherTheoID(String id) {
		// Chỉ xóa nếu thỏa mãn CẢ HAI điều kiện: Trùng ID VÀ là Intern
		boolean ok = nhanvien.removeIf(emp -> emp.getId().equalsIgnoreCase(id) && (emp instanceof Fresher));
		if (ok) {
			System.out.println("đã xóa thành công");
		} else if (ok == false) {
			System.out.println("k có thông tin để xóa");
		}
	}

	public ArrayList<Certificate> capnhapchungchi() {
		// 1. Khai báo cái list mới
		ArrayList<Certificate> listmoi = new ArrayList<Certificate>();

		System.out.println("Nhập vào số lượng bằng cần cập nhật: ");
		int n = nhap.nextInt();
		nhap.nextLine(); // <<--- DÒNG QUAN TRỌNG: Để xóa cái dấu Enter dư thừa, chống trôi lệnh!

		for (int i = 0; i < n; i++) {
			System.out.println("--- Nhập thông tin bằng cấp thứ " + (i + 1) + " ---");
			System.out.println(" - Mã bằng: ");
			String id = nhap.nextLine();
			System.out.println(" - Tên bằng: ");
			String name = nhap.nextLine();
			System.out.println(" - Xếp loại: ");
			String rank = nhap.nextLine();
			System.out.println(" - Ngày cấp: ");
			String date = nhap.nextLine();
			// Tạo đối tượng và add vào list
			Certificate chungchimoi = new Certificate(id, name, rank, date);
			listmoi.add(chungchimoi);
		}

		return listmoi; // Trả về cái list để ông gán vào nhân viên
	}

	public void suaFresherId(String id) {
		for (Employee emp : nhanvien) {
			if (emp instanceof Fresher && emp.getId().equalsIgnoreCase(id)) {

				Fresher fr = (Fresher) emp; // dowcassting là cha thành con
				System.out.println("Nhập id của nhân viên");
				String idnv = nhap.nextLine();
				System.out.println("Nhập họ tên của nhân viên");
				String hoten = nhap.nextLine();
				System.out.println("Nhập ngày sinh của nhân viên");
				String ngaysinh = nhap.nextLine();
				System.out.println("Nhập điện thoại của nhân viên");
				String dienthoai = nhap.nextLine();
				System.out.println("Nhập email của nhân viên");
				String email = nhap.nextLine();
				System.out.println("Nhập Fresher loại nhân viên (1)");
				int loainhanvien = nhap.nextInt();
				nhap.nextLine();
				System.out.println("Nhập vào Thời gian tốt nghiệp: ");
				String tgtn = nhap.nextLine();
				System.out.println("Nhập vào xếp loại tốt nghiệp: ");
				String loaitn = nhap.nextLine();
				System.out.println("Nhập vào trường tốt nghiệp: ");
				String trtn = nhap.nextLine();
				fr.setId(idnv);
				fr.setFullName(hoten);
				fr.setBirthDay(ngaysinh);
				// Tiếp tục gán các thông tin chung
				fr.setPhone(dienthoai);
				fr.setEmail(email);
				fr.setEmployeeType(loainhanvien);

				// Gán các thông tin riêng đặc thù của Fresher
				fr.setGraduationDate(tgtn);
				fr.setGraduationRank(loaitn);
				fr.setEducation(trtn);
				ArrayList<Certificate> chungchimoi = capnhapchungchi();
				fr.setCertificate(chungchimoi);
				System.out.println("=> Cập nhật thông tin nhân viên Fresher thành công!");
				fr.ShowInfo();
			}
		}

	}

	public void suaInternId(String id) {
		for (Employee emp : nhanvien) {
			if (emp instanceof Intern && emp.getId().equalsIgnoreCase(id)) {

				Intern it = (Intern) emp; // dowcassting là cha thành con
				System.out.println("Nhập id của nhân viên");
				String idnv = nhap.nextLine();
				System.out.println("Nhập họ tên của nhân viên");
				String hoten = nhap.nextLine();
				System.out.println("Nhập ngày sinh của nhân viên");
				String ngaysinh = nhap.nextLine();
				System.out.println("Nhập điện thoại của nhân viên");
				String dienthoai = nhap.nextLine();
				System.out.println("Nhập email của nhân viên");
				String email = nhap.nextLine();
				System.out.println("Nhập loại nhân viên (Intern là 2):");
				int loainhanvien = nhap.nextInt();
				nhap.nextLine(); // Chống trôi lệnh

				// 2. Đổi các câu hỏi thành đặc thù của Intern
				System.out.println("Nhập vào Chuyên ngành đang học: ");
				String nganhhoc = nhap.nextLine();
				System.out.println("Nhập vào Học kì đang học: ");
				String hocki = nhap.nextLine();
				System.out.println("Nhập vào Trường đang học: ");
				String truong = nhap.nextLine();

				it.setId(idnv);
				it.setFullName(hoten);
				it.setBirthDay(ngaysinh);
				// Tiếp tục gán các thông tin chung
				it.setPhone(dienthoai);
				it.setEmail(email);

				it.setEmployeeType(loainhanvien);

				// 3. Gán các thông tin riêng của Intern (Dùng đúng hàm set của lớp Intern)
				it.setMajors(nganhhoc);
				it.setSemester(hocki);
				it.setUniversityName(truong);
				ArrayList<Certificate> chungchimoi = capnhapchungchi();
				it.setCertificate(chungchimoi);
				System.out.println("=> Cập nhật thông tin nhân viên Fresher thành công!");
				it.ShowInfo();
			}
		}

	}

	public void suaExprId(String id) {
	    for (Employee emp : nhanvien) {
	        // 1. Kiểm tra xem có đúng là Experience không
	        if (emp instanceof Experience && emp.getId().equalsIgnoreCase(id)) {

	            // 2. Ép kiểu về Experience
	            Experience ex = (Experience) emp; 
	            
	            System.out.println("Nhập id mới của nhân viên:");
	            String idnv = nhap.nextLine();
	            System.out.println("Nhập họ tên mới:");
	            String hoten = nhap.nextLine();
	            System.out.println("Nhập ngày sinh mới:");
	            String ngaysinh = nhap.nextLine();
	            System.out.println("Nhập điện thoại mới:");
	            String dienthoai = nhap.nextLine();
	            System.out.println("Nhập email mới:");
	            String email = nhap.nextLine();
	            
	            System.out.println("Nhập loại nhân viên (Experience là 0):");
	            int loainhanvien = nhap.nextInt();
	            nhap.nextLine(); // Chống trôi lệnh

	            // 3. THUỘC TÍNH RIÊNG CỦA EXPERIENCE
	            System.out.println("Nhập số năm kinh nghiệm: ");
	            int sonam = nhap.nextInt();
	            nhap.nextLine(); // Chống trôi lệnh tiếp
	            System.out.println("Nhập kỹ năng chuyên môn: ");
	            String kynang = nhap.nextLine();

	            // Gán thông tin chung
	            ex.setId(idnv);
	            ex.setFullName(hoten);
	            ex.setBirthDay(ngaysinh);
	            ex.setPhone(dienthoai);
	            ex.setEmail(email);
	            ex.setEmployeeType(loainhanvien);

	            // 4. Gán thông tin riêng (Check lại tên hàm set trong file Experience.java nhé)
	            ex.setExpInYear(sonam);
	            ex.setProSkill(kynang);

	            // Cập nhật chứng chỉ dùng cái hàm ArrayList "xịn" của ông
	            ArrayList<Certificate> chungchimoi = capnhapchungchi();
	            ex.setCertificate(chungchimoi);

	            System.out.println("=> Cập nhật thông tin nhân viên Experience thành công!");
	            ex.ShowInfo();
	            
	        }
	    }
	   
	}
	public void timkiemExprience(String id)
	{
		boolean tk=false;
		for(Employee emp : nhanvien)
		{
			if(emp instanceof Experience && emp.getId().equalsIgnoreCase(id))
			{
				tk=true;
				Experience ex =(Experience) emp;
				ex.ShowInfo();
			}
				
		}
		if(tk==false)
		{
			System.out.println("k tìm thấp nhân viên có kinh nghiệm");
		}
	}
	public void timkiemFrehser(String id)
	{
		boolean tk=false;
		for(Employee emp : nhanvien)
		{
			if(emp instanceof Fresher && emp.getId().equalsIgnoreCase(id))
			{
				tk=true;
				Fresher fr =(Fresher) emp;
				fr.ShowInfo();
			}
				
		}
		if(tk==false)
		{
			System.out.println("k tìm thấp nhân viên fresher");
		}
	}
	public void timkiemIntern(String id)
	{
		boolean tk=false;
		for(Employee emp : nhanvien)
		{
			if(emp instanceof Intern && emp.getId().equalsIgnoreCase(id))
			{
				tk=true;
				Intern it =(Intern) emp;
				it.ShowInfo();
			}
				
		}
		if(tk==false)
		{
			System.out.println("k tìm thấp nhân viên intern");
		}
	}
	public void hienthiIntern()
	{
		boolean kiemtra=false;
		for(Employee emp : nhanvien)
		{
			if(emp instanceof Intern )
			{
				kiemtra=true;
				Intern it =(Intern) emp;
				it.ShowInfo();
			}
		}
		if(kiemtra==false)
		{
			System.out.println("k có nhân viên intern");
		}
	}
	public void hienthiFresher() {
	    boolean kiemtra = false;
	    for (Employee emp : nhanvien) {
	        // Kiểm tra xem đối tượng có phải là Fresher hay không
	        if (emp instanceof Fresher) {
	            kiemtra = true;
	            // Phải ép kiểu về đúng lớp Fresher
	            Fresher fresher = (Fresher) emp; 
	            fresher.ShowInfo();
	        }
	    }
	    
	    if (!kiemtra) {
	        System.out.println("Không có nhân viên Fresher nào trong danh sách.");
	    }
	}
	public void hienthiExperience() {
	    boolean kiemtra = false;
	    for (Employee emp : nhanvien) {
	        // Kiểm tra đúng kiểu Experience
	        if (emp instanceof Experience) {
	            kiemtra = true;
	            // Ép kiểu về Experience để gọi phương thức
	            Experience exp = (Experience) emp;
	            exp.ShowInfo();
	        }
	    }
	    
	    if (!kiemtra) {
	        System.out.println("Không có nhân viên Experience nào.");
	    }
	}
}
