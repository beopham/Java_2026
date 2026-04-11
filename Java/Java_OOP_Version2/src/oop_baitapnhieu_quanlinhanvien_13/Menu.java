package oop_baitapnhieu_quanlinhanvien_13;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Managemnt_Employee quanlinhanvien = new Managemnt_Employee();
		Scanner nhap = new Scanner(System.in);
		while (true) {
			System.out.println("\n========== MENU QUẢN LÝ NHÂN VIÊN ==========");
			System.out.println("1. Thêm nhân viên mới");
			System.out.println("2. Xóa nhân viên theo ID");
			System.out.println("3. Menu Tìm kiếm (Theo từng loại)");
			System.out.println("4. Menu Hiển thị (Theo từng loại)");
			System.out.println("5. Đếm số lượng nhân viên");
			System.out.println("0. Thoát chương trình");
			System.out.print("Mời Nam chọn: ");
			int chon = nhap.nextInt();
			nhap.nextLine();
			if (chon == 1) {

				int id;
				String FullName = "";
				String BirthDay = "";
				String phone = "";
				while (true) {
					try {
						System.out.print("Nhập mã nhân viên (ID): ");
						String input = nhap.nextLine(); // Đọc vào String để tránh lỗi Scanner

						Validator.IdException(input); // Kiểm tra định dạng
						id = Integer.parseInt(input);
						break;
					} catch (IdException e) {
						System.out.println(e.getMessage());
					}
				}
				while (true) {
					try {
						System.out.print("Nhập họ tên: ");
						FullName = nhap.nextLine(); // Khai báo kiểu String
						Validator.FullNameException(FullName);
						break;
					} catch (FullNameException e) {
						// TODO: handle exception
						System.out.println(e.getMessage());
					}
				}
				while (true) {
					try {
						System.out.print("Nhập ngày sinh: ");
						BirthDay = nhap.nextLine(); // Khai báo kiểu String
						Validator.BirthDayException(BirthDay);
						break;
					} catch (BirthDayException e) {
						// TODO: handle exception
						System.out.println(e.getMessage());
					}

				}

				while (true) {
					try {
						System.out.print("Nhập số điện thoại: ");
						phone = nhap.nextLine(); // Khai báo kiểu String
						Validator.PhoneException(phone);
						break;
					} catch (PhoneException e) {
						System.out.println(e.getMessage());
					}
				}

				System.out.print("Nhập loại nhân viên: ");
				System.out.println("1.Experience (Người có kinh nghiệm)");
				System.out.println("2.Fresher (Người mới tốt nghiệp)");
				System.out.println("3.Intern (Thực tập sinh)");
				int Employee_type = nhap.nextInt(); // Khai báo kiểu int
				// Xóa bộ nhớ đệm
				nhap.nextLine();
				ArrayList<Certificate> danhsachchungchi = new ArrayList<Certificate>();
				System.out.println("Nhập vào số lượng chứng chỉ");
				int soluong = nhap.nextInt();
				nhap.nextLine();
				for (int i = 0; i < soluong; i++) {
					System.out.print("Nhập ID chứng chỉ thứ " + (i + 1));
					String certificatedID = nhap.nextLine();

					System.out.print("Nhập tên chứng chỉ thứ " + (i + 1));
					String certificateName = nhap.nextLine();

					System.out.print("Nhập xếp loại chứng chỉ thứ " + (i + 1));
					String certificateRank = nhap.nextLine();

					System.out.print("Nhập ngày cấp chứng chỉ thứ " + (i + 1));
					String certificatedDate = nhap.nextLine();
					Certificate cc = new Certificate(certificatedID, certificateName, certificateRank,
							certificatedDate);
					danhsachchungchi.add(cc);
				}
				System.out.println("Chọn loại nhân viên:");
				System.out.println("1.Experience (Người có kinh nghiệm)");
				System.out.println("2.Fresher (Người mới tốt nghiệp)");
				System.out.println("3.Intern (Thực tập sinh)");
				System.out.print("Mời chọn (1-3): ");
				int chonloainv = nhap.nextInt();
				if (chonloainv == 1) {
					System.out.print("Nhập số năm kinh nghiệm: ");
					int expInYear = nhap.nextInt();
					// Sau khi nhập số, phải có dòng này để xóa phím Enter trong bộ nhớ đệm
					nhap.nextLine();
					System.out.print("Nhập kỹ năng chuyên môn: ");
					String proSkill = nhap.nextLine();
					Experience nhanviencokn = new Experience(id, FullName, BirthDay, phone, Employee_type,
							danhsachchungchi, expInYear, proSkill);
					quanlinhanvien.them(nhanviencokn);
				} else if (chonloainv == 2) {
					String graduation_date = "";
					while (true) {
						try {
							// 1. Nhập thời gian tốt nghiệp (Dùng nextLine vì là String)
							System.out.print("Nhập thời gian tốt nghiệp (dd/mm/yyyy): ");
							graduation_date = nhap.nextLine();
							Validator.BirthDayException(graduation_date);
							break;
						} catch (BirthDayException e) {
							System.out.println(e.getMessage());
						}
					}

					// 2. Nhập xếp loại tốt nghiệp (Dùng nextLine vì là String)
					System.out.print("Nhập xếp loại tốt nghiệp (Giỏi/Khá/TB): ");
					String graduation_rank = nhap.nextLine();

					// 3. Nhập trường tốt nghiệp (Dùng nextLine vì là String)
					System.out.print("Nhập trường tốt nghiệp: ");
					String education = nhap.nextLine();
					Employee fre = new Fresher(id, FullName, BirthDay, phone, Employee_type, danhsachchungchi,
							graduation_date, graduation_rank, education);
					quanlinhanvien.them(fre);
				} else if (chonloainv == 3) {
					// 1. Nhập chuyên ngành (Kiểu String - dùng nextLine)
					System.out.print("Nhập chuyên ngành đang học: ");
					String majors = nhap.nextLine();

					// 2. Nhập học kỳ (Kiểu int - cần xử lý trôi lệnh)
					System.out.print("Nhập học kỳ đang học: ");
					int semester = nhap.nextInt();
					// QUAN TRỌNG: Xóa bộ nhớ đệm sau khi nhập số
					nhap.nextLine();

					// 3. Nhập tên trường (Kiểu String - dùng nextLine)
					System.out.print("Nhập tên trường đang học: ");
					String university_name = nhap.nextLine();
					Employee intern = new Intern(id, FullName, BirthDay, phone, Employee_type, danhsachchungchi, majors,
							semester, university_name);
					quanlinhanvien.them(intern);
				}

			} else if (chon == 2) {
				System.out.print("Nhập mã nhân viên (ID): ");
				int id = nhap.nextInt();
				nhap.nextLine(); // SỬA LỖI: Thêm dòng này để không bị
				quanlinhanvien.xoa(id);

			} else if (chon == 3) {

				// 1. In ra cho đối tượng Employee
				System.out.println("1. Thông tin nhân viên (Employee)");
				// 2. In ra cho đối tượng Experience (Kinh nghiệm)
				System.out.println("2. Thông tin nhân viên có kinh nghiệm (Experience)");
				// 3. In ra cho đối tượng Fresher (Mới tốt nghiệp)
				System.out.println("3. Thông tin nhân viên mới (Fresher)");
				System.out.println("4. Thông tin nhân viên Intern");
				System.out.print("Mời Nam tìm kiếm: ");
				int tk = nhap.nextInt();
				nhap.nextLine();
				if (tk == 1) {
					System.out.print("Nhập mã nhân viên Employee(ID): ");
					int id = nhap.nextInt();
					nhap.nextLine(); // SỬA LỖI: Thê
					quanlinhanvien.timnhanvien_all(id);
				} else if (tk == 2) {
					System.out.print("Nhập mã nhân viên Experience (ID): ");
					int id = nhap.nextInt();
					nhap.nextLine(); // SỬA LỖI: Thê
					quanlinhanvien.timnhanvien_experience(id);
				} else if (tk == 3) {
					System.out.print("Nhập mã nhân viên Fresher (ID):");
					int id = nhap.nextInt();
					nhap.nextLine(); // SỬA LỖI: Thê
					quanlinhanvien.timnhanvien_fresher(id);

				} else if (tk == 4) {
					System.out.print("Nhập mã nhân viên Intern (ID):");
					int id = nhap.nextInt();
					nhap.nextLine(); // SỬA LỖI: Thê
					quanlinhanvien.timnhanvien_intern(id);
				}
			} else if (chon == 4) {
				System.out.println("1. Thông tin nhân viên (Employee)");
				// 2. In ra cho đối tượng Experience (Kinh nghiệm)
				System.out.println("2. Thông tin nhân viên có kinh nghiệm (Experience)");
				// 3. In ra cho đối tượng Fresher (Mới tốt nghiệp)
				System.out.println("3. Thông tin nhân viên mới (Fresher)");
				System.out.println("4. Thông tin nhân viên Intern");
				System.out.print("Mời Nam tìm kiếm: ");
				int tk = nhap.nextInt();
				nhap.nextLine();
				if (tk == 1) {
					quanlinhanvien.hienthinhanvien_all();
				} else if (chon == 2) {
					quanlinhanvien.hienthinhanvien_experience();

				} else if (chon == 3) {
					quanlinhanvien.hienthinhanvien_fresher();

				} else if (chon == 4) {
					quanlinhanvien.hienthinhanvien_intern();

				}
			} else if (chon == 5) {
				quanlinhanvien.demsonhanvienall();
			} else if (chon == 6) {
				System.out.println("Đã Thoát");
				break;
			}
		}
	}
}
