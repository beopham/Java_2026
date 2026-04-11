package oop_baitapgiuaki_vku;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        Quanlihogiadinh ql = new Quanlihogiadinh();

        // 1. GÁN SẴN DỮ LIỆU TỪ BẢNG (Hardcode)
        ql.them(new Family("GD001", 100, 30, new Energy("D1", 1200), new Water("N1", 1500)));
        ql.them(new Family("GD002", 80, 50, new Energy("D2", 1350), new Water("N1", 1500)));
        ql.them(new Family("GD003", 120, 100, new Energy("D2", 1350), new Water("N2", 2000)));
        ql.them(new Family("GD004", 100, 100, new Energy("D3", 1500), new Water("N1", 1500)));
        ql.them(new Family("GD005", 50, 50, new Energy("D4", 2000), new Water("N3", 2100)));

        while (true) {
            System.out.println("\n----------------------------------------------");
            System.out.println("      HỆ THỐNG QUẢN LÝ ĐIỆN NƯỚC VKU");
            System.out.println("----------------------------------------------");
            System.out.println("1. Thêm hộ gia đình mới (Nhập từ bàn phím)");
            System.out.println("2. Hiển thị tất cả hộ gia đình (Gồm cả dữ liệu mẫu)");
            System.out.println("3. Danh sách giảm dần theo TIỀN ĐIỆN");
            System.out.println("4. Danh sách tăng dần theo TIỀN NƯỚC");
            System.out.println("0. Thoát chương trình");
            System.out.print("==> Lựa chọn của bạn: ");

            int chon;
            try {
                chon = Integer.parseInt(nhap.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("!!! Lỗi: Vui lòng nhập số tương ứng trên Menu!");
                break;
            }

            if (chon == 1) {
                String ma = "";
                int sd = 0, sn = 0;

                // --- Nhập Mã Hộ Gia Đình ---
                while (true) {
                    try {
                        System.out.print("Nhập mã hộ gia đình (ví dụ GD006): ");
                        ma = nhap.nextLine();
                        Validation.Text_Exception(ma);
                        break;
                    } catch (Exception e) {
                        System.out.println("Lỗi: " + e.getMessage());
                    }
                }

                // --- Nhập Số Chữ Điện ---
                while (true) {
                    try {
                        System.out.print("Nhập số chữ điện tiêu thụ: ");
                        String s = nhap.nextLine();
                        Validation.Number_Exception(s);
                        sd = Integer.parseInt(s);
                        break;
                    } catch (Exception e) {
                        System.out.println("Lỗi: " + e.getMessage());
                    }
                }

                // --- Nhập Số Chữ Nước ---
                while (true) {
                    try {
                        System.out.print("Nhập số chữ nước tiêu thụ: ");
                        String s = nhap.nextLine();
                        Validation.Number_Exception(s);
                        sn = Integer.parseInt(s);
                        break;
                    } catch (Exception e) {
                        System.out.println("Lỗi: " + e.getMessage());
                    }
                }

                // --- Nhập Thông tin Energy ---
                System.out.print("Nhập mã điện: ");
                String maDien = nhap.nextLine();
                System.out.print("Nhập giá điện: ");
                int giaDien = Integer.parseInt(nhap.nextLine());
                Energy en = new Energy(maDien, giaDien);

                // --- Nhập Thông tin Water ---
                System.out.print("Nhập mã nước: ");
                String maNuoc = nhap.nextLine();
                System.out.print("Nhập giá nước: ");
                int giaNuoc = Integer.parseInt(nhap.nextLine());
                Water wa = new Water(maNuoc, giaNuoc);

                // Tạo đối tượng và thêm vào List
                ql.them(new Family(ma, sd, sn, en, wa));
                System.out.println("==> Đã thêm thành công hộ " + ma);

            } else if (chon == 2) {
                System.out.println("\n--- TẤT CẢ HỘ GIA ĐÌNH ---");
                ql.hienthiall();

            } else if (chon == 3) {
                System.out.println("\n--- GIẢM DẦN THEO TỔNG TIỀN ĐIỆN ---");
                ql.danhsachgiamdantheogiatiendien();

            } else if (chon == 4) {
                System.out.println("\n--- TĂNG DẦN THEO TỔNG TIỀN NƯỚC ---");
                ql.danhsachtangdantheogiatiennuoc();

            } else if (chon == 0) {
                System.out.println("Đang thoát chương trình... Tạm biệt!");
                break;
            } else {
                System.out.println("Lựa chọn không hợp lệ!");
                break;
            }
        }
        nhap.close();
    }
}