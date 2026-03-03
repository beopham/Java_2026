package OOP_CNTT;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        // Khởi tạo đối tượng quản lý và Scanner
        QLGiaoVien quanLi = new QLGiaoVien();
        Scanner sc = new Scanner(System.in);
        int chon;

        while (true) {
            System.out.println("\n===== QUẢN LÝ CÁN BỘ GIÁO VIÊN =====");
            System.out.println("1. Thêm giáo viên mới");
            System.out.println("2. Xóa giáo viên theo mã số");
            System.out.println("3.Hiển Thị sinh viên");
            System.out.println("0. Thoát");
            System.out.print("Mời em chọn: ");
            
            chon = sc.nextInt();
            sc.nextLine(); // Chống trôi lệnh khi nhập chuỗi sau số

            if (chon == 1) {
                // Nhập thông tin cá nhân
                System.out.print("Nhập mã số giáo viên: ");
                String ma = sc.nextLine();
                System.out.print("Nhập họ tên: ");
                String hoTen = sc.nextLine();
                System.out.print("Nhập tuổi: ");
                int tuoi = sc.nextInt();
                sc.nextLine(); 
                System.out.print("Nhập quê quán: ");
                String que = sc.nextLine();

                // Nhập thông tin lương
                System.out.print("Nhập lương cứng: ");
                double lc = sc.nextDouble();
                System.out.print("Nhập lương thưởng: ");
                double lt = sc.nextDouble();
                System.out.print("Nhập tiền phạt: ");
                double tp = sc.nextDouble();

                // Tạo đối tượng và thêm vào danh sách
                CBGV gv = new CBGV(hoTen, tuoi, que, ma, lc, lt, tp);
                quanLi.them(gv);
                System.out.println("=> Đã thêm giáo viên thành công!");

            } else if (chon == 2) {
                System.out.print("Nhập mã số giáo viên cần xóa: ");
                String maXoa = sc.nextLine();
                // Gọi hàm xóa đã viết trong QLGiaoVien
                quanLi.xoagv(maXoa);

            }

         else if (chon == 3) {
          
            quanLi.hienthi();

        }else if (chon == 0) {
                System.out.println("Tạm biệt Nam! Chúc em học tốt tại VKU.");
                break;
            } else {
                System.out.println("Lựa chọn không hợp lệ, nhập lại đi em!");
            }
        }
        sc.close();
    }
}