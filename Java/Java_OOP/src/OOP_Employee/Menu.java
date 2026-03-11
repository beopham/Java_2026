package OOP_Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		EmployeeManager quanlinhanvien = new EmployeeManager();
		Scanner nhap = new Scanner(System.in);

		while (true) {
			System.out.println("\n   HỆ THỐNG QUẢN LÝ NHÂN VIÊN VKU");
			System.out.println(" 1. Thêm nhân viên Intern (Thực tập sinh)");
			System.out.println(" 2. Thêm nhân viên Fresher (Mới tốt nghiệp)");
			System.out.println(" 3. Thêm nhân viên Experience (Kinh nghiệm)");
			System.out.println(" 4. Sửa thông tin nhân viên theo ID ");
			System.out.println(" 5. Xóa nhân viên theo ID");
			System.out.println(" 6. Liệt kê tất cả Intern");
			System.out.println(" 7. Liệt kê tất cả Experience");
			System.out.println(" 8. Liệt kê tất cả Fresher");
			System.out.println(" 9. Xem nhân viên");
			System.out.println(" 0. Thoát chương trình");
			System.out.print("Mời Nam chọn chức năng: ");
			int chon = nhap.nextInt();
			nhap.nextLine();
			if (chon == 1) {
				System.out.println("--- NHẬP THÔNG TIN INTERN MỚI ---");

				// 1. Nhập ID (Không cần check regex phức tạp)
				System.out.println("Nhập ID nhân viên intern:");
				String id = nhap.nextLine();
				// KHAI BÁO TRƯỚC Ở NGOÀI
			    String ten = "";
			    String ngaysinh = "";
			    String sdt = "";
			    String email = "";

			    // 1. Nhập tên
			    while (true) {
			        try {
			            System.out.println("nhập vào tên ");
			            ten = nhap.nextLine(); // Gán giá trị vào biến bên ngoài
			            if (Validator.checTen(ten)) break;
			        } catch (loiten e) {
			            System.out.println(e.getMessage());
			        }
			    }

			    // 2. Nhập ngày sinh
			    while (true) {
			        try {
			            System.out.println("nhập vào ngày sinh ");
			            ngaysinh = nhap.nextLine();
			            if (Validator.checkngaysinh(ngaysinh)) break;
			        } catch (loingaysinh e) {
			            System.out.println(e.getMessage());
			        }
			    }

			    // 3. Nhập số điện thoại
			    while (true) {
			        try {
			            System.out.println("nhập vào số điện thoại ");
			            sdt = nhap.nextLine();
			            if (Validator.checksdth(sdt)) break;
			        } catch (loisdt e) {
			            System.out.println(e.getMessage());
			        }
			    }

			    // 4. Nhập email
			    while (true) {
			        try {
			            System.out.println("nhập vào email ");
			            email = nhap.nextLine();
			            if (Validator.checkemail(email)) break;
			        } catch (loiemail e) {
			            System.out.println(e.getMessage());
			        }
			    }
				System.out.println("Nhập vào loại nhân viên bấm số 1");
				int loainhanvien = nhap.nextInt();
				nhap.nextLine();
				System.out.println("--- NHẬP THÔNG TIN CHỨNG CHỈ ---");

				System.out.println("Nhập ID chứng chỉ:");
				String idcc = nhap.nextLine();

				System.out.println("Nhập tên chứng chỉ:");
				String namecc = nhap.nextLine();

				System.out.println("Nhập xếp loại chứng chỉ (Xuất sắc, Giỏi, Khá...):");
				String rank = nhap.nextLine();

				// Chỗ này nếu ông muốn gắt hơn, có thể dùng Validator để check định dạng ngày
				System.out.println("Nhập ngày cấp chứng chỉ (dd/MM/yyyy):");
				String date = nhap.nextLine();
				Certificate cc = new Certificate(idcc, namecc, rank, date);
				ArrayList<Certificate> danhsachcc = new ArrayList<Certificate>();
				danhsachcc.add(cc);
				System.out.println("Nhập chuyên ngành đang học (Majors):");
				String majors = nhap.nextLine();

				System.out.println("Nhập học kỳ đang học (Semester):");
				String semester = nhap.nextLine();

				System.out.println("Nhập tên trường đại học đang theo học (University Name):");
				String universityName = nhap.nextLine();
				Intern sv = new Intern(id, ten, date,sdt, email, loainhanvien, danhsachcc, majors, semester, universityName);
				quanlinhanvien.them(sv);
			} else if (chon == 2) {
				System.out.println("--- NHẬP THÔNG TIN FRESHER MỚI ---");

				// 1. Nhập ID (Không cần check regex phức tạp)
				System.out.println("Nhập ID nhân viên fresher:");
				String id = nhap.nextLine();
				// KHAI BÁO TRƯỚC Ở NGOÀI
			    String ten = "";
			    String ngaysinh = "";
			    String sdt = "";
			    String email = "";

			    // 1. Nhập tên
			    while (true) {
			        try {
			            System.out.println("nhập vào tên ");
			            ten = nhap.nextLine(); // Gán giá trị vào biến bên ngoài
			            if (Validator.checTen(ten)) break;
			        } catch (loiten e) {
			            System.out.println(e.getMessage());
			        }
			    }

			    // 2. Nhập ngày sinh
			    while (true) {
			        try {
			            System.out.println("nhập vào ngày sinh ");
			            ngaysinh = nhap.nextLine();
			            if (Validator.checkngaysinh(ngaysinh)) break;
			        } catch (loingaysinh e) {
			            System.out.println(e.getMessage());
			        }
			    }

			    // 3. Nhập số điện thoại
			    while (true) {
			        try {
			            System.out.println("nhập vào số điện thoại ");
			            sdt = nhap.nextLine();
			            if (Validator.checksdth(sdt)) break;
			        } catch (loisdt e) {
			            System.out.println(e.getMessage());
			        }
			    }

			    // 4. Nhập email
			    while (true) {
			        try {
			            System.out.println("nhập vào email ");
			            email = nhap.nextLine();
			            if (Validator.checkemail(email)) break;
			        } catch (loiemail e) {
			            System.out.println(e.getMessage());
			        }
			    }
				System.out.println("Nhập vào loại nhân viên bấm số 2");
				int loainhanvien = nhap.nextInt();
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
				Certificate cc = new Certificate(idcc, name, rank, date);
				ArrayList<Certificate> danhsachcc = new ArrayList<Certificate>();
				danhsachcc.add(cc);
				System.out.println("Nhập thời gian tốt nghiệp (Graduation Date):");
				String graduationDate = nhap.nextLine();

				System.out.println("Nhập xếp loại tốt nghiệp (Graduation Rank):");
				String graduationRank = nhap.nextLine();

				System.out.println("Nhập trường tốt nghiệp (Education):");
				String education = nhap.nextLine();
				Fresher fr = new Fresher(id, ten, ngaysinh, sdt, email, loainhanvien, danhsachcc, graduationDate,
						graduationRank, education);
				quanlinhanvien.them(fr);
			} else if (chon == 3) {
				System.out.println("--- NHẬP THÔNG TIN EXPRIENCE MỚI ---");

				// 1. Nhập ID (Không cần check regex phức tạp)
				System.out.println("Nhập ID nhân viên exprinece:");
				String id = nhap.nextLine();
				// KHAI BÁO TRƯỚC Ở NGOÀI
			    String ten = "";
			    String ngaysinh = "";
			    String sdt = "";
			    String email = "";

			    // 1. Nhập tên
			    while (true) {
			        try {
			            System.out.println("nhập vào tên ");
			            ten = nhap.nextLine(); // Gán giá trị vào biến bên ngoài
			            if (Validator.checTen(ten)) break;
			        } catch (loiten e) {
			            System.out.println(e.getMessage());
			        }
			    }

			    // 2. Nhập ngày sinh
			    while (true) {
			        try {
			            System.out.println("nhập vào ngày sinh ");
			            ngaysinh = nhap.nextLine();
			            if (Validator.checkngaysinh(ngaysinh)) break;
			        } catch (loingaysinh e) {
			            System.out.println(e.getMessage());
			        }
			    }

			    // 3. Nhập số điện thoại
			    while (true) {
			        try {
			            System.out.println("nhập vào số điện thoại ");
			            sdt = nhap.nextLine();
			            if (Validator.checksdth(sdt)) break;
			        } catch (loisdt e) {
			            System.out.println(e.getMessage());
			        }
			    }

			    // 4. Nhập email
			    while (true) {
			        try {
			            System.out.println("nhập vào email ");
			            email = nhap.nextLine();
			            if (Validator.checkemail(email)) break;
			        } catch (loiemail e) {
			            System.out.println(e.getMessage());
			        }
			    }
				System.out.println("Nhập vào loại nhân viên bấm số 3");
				int loainhanvien = nhap.nextInt();
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
				Certificate cc = new Certificate(idcc, name, rank, date);
				ArrayList<Certificate> danhsachcc = new ArrayList<Certificate>();
				danhsachcc.add(cc);
				System.out.println("Nhập số năm kinh nghiệm (Exp In Year):");
				// Cách an toàn để nhập số nguyên và không bị lỗi trôi dòng sau đó
				int expInYear = Integer.parseInt(nhap.nextLine());

				System.out.println("Nhập kỹ năng chuyên môn (Professional Skill):");
				String proSkill = nhap.nextLine();
				Experience exp = new Experience(id, ten, date,sdt,email, loainhanvien, danhsachcc, expInYear,
						proSkill);
				quanlinhanvien.them(exp);

			} else if (chon == 4) {
				System.out.println(" 1. Sửa thông tin nhân viên Intern theo ID");
				System.out.println(" 2. Sửa thông tin nhân viên Fresher theo ID");
				System.out.println(" 3. Sửa thông tin nhân viên Experience theo ID");
				System.out.println(" Nhập nhân viên muốn sửa");
				int chonxua = nhap.nextInt();
				nhap.nextLine();
				if (chonxua == 1) {
					System.out.println("Nhập ID nhân viên intern:");
					String id = nhap.nextLine();
					quanlinhanvien.suaInternId(id);
				} else if (chonxua == 2) {
					System.out.println("Nhập ID nhân viên fresher:");
					String id = nhap.nextLine();
					quanlinhanvien.suaFresherId(id);
				}

				else if (chonxua == 3) {
					System.out.println("Nhập ID nhân viên exprienece:");
					String id = nhap.nextLine();
					quanlinhanvien.suaExprId(id);
				}

			} else if (chon == 5) {
				System.out.println(" 1. Xóa thông tin nhân viên Intern theo ID");
				System.out.println(" 2. Xóa thông tin nhân viên Fresher theo ID");
				System.out.println(" 3. Xóa thông tin nhân viên Experience theo ID");
				System.out.println(" Nhập nhân viên muốn xóa");
				int chonxua = nhap.nextInt();
				nhap.nextLine();
				if (chonxua == 1) {
					System.out.println("Nhập ID nhân viên intern:");
					String id = nhap.nextLine();
					quanlinhanvien.xoaInternTheoID(id);
				} else if (chonxua == 2) {
					System.out.println("Nhập ID nhân viên fresher:");
					String id = nhap.nextLine();
					quanlinhanvien.xoaFresherTheoID(id);
				}

				else if (chonxua == 3) {
					System.out.println("Nhập ID nhân viên exprienece:");
					String id = nhap.nextLine();
					quanlinhanvien.xoaExpTheoID(id);
				}

			} else if (chon == 6) {
				System.out.println("Nhập ID nhân viên intern:");
				String id = nhap.nextLine();
				quanlinhanvien.timkiemIntern(id);
			} else if (chon == 7) {
				System.out.println("Nhập ID nhân viên fresher:");
				String id = nhap.nextLine();
				quanlinhanvien.timkiemFrehser(id);
			} else if (chon == 8) {
				System.out.println("Nhập ID nhân viên exprience:");
				String id = nhap.nextLine();
				quanlinhanvien.timkiemFrehser(id);
			} else if (chon == 9) {
				quanlinhanvien.hienthiIntern();
				quanlinhanvien.hienthiFresher();
				quanlinhanvien.hienthiExperience();
			} else if (chon == 0) {
				System.out.println("đã thoát");
				break;
			}
		}
	}
}
