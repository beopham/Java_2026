package OOP_Canbo;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        QLCanBo quanli = new QLCanBo();
        Scanner nhap = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- QUẢN LÝ CÁN BỘ ---");
            System.out.println("1. Thêm mới cán bộ");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Tìm kiếm theo họ tên");
            System.out.println("4. Thoát");
            System.out.print("Chọn chức năng (1-4): ");
            
            int chon = nhap.nextInt();
            nhap.nextLine(); // SỬA: Nuốt Enter sau khi chọn menu

            if (chon == 1) {
                System.out.print("Nhập họ tên: ");
                String ten = nhap.nextLine();

                System.out.print("Nhập tuổi: ");
                int tuoi = nhap.nextInt();
                nhap.nextLine(); // SỬA: Nuốt Enter sau khi nhập tuổi

                System.out.print("Nhập giới tính: ");
                String gt = nhap.nextLine();

                System.out.print("Nhập địa chỉ: ");
                String dc = nhap.nextLine();

                System.out.print("Chọn loại (1: Công nhân, 2: Kỹ sư, 3: Nhân viên): ");
                int loai = nhap.nextInt();
                nhap.nextLine(); // SỬA: Nuốt Enter sau khi chọn loại

                if (loai == 1) {
                    System.out.print("Nhập bậc (1-10): ");
                    String bac = nhap.nextLine();
                    CongNhan cn = new CongNhan(ten, tuoi, gt, dc, bac);
                    quanli.themcanbo(cn);
                    System.out.println("Đã thêm Công nhân!");
                } else if (loai == 2) {
                    System.out.print("Nhập ngành đào tạo: ");
                    String nganh = nhap.nextLine();
                    KySu ks = new KySu(ten, tuoi, gt, dc, nganh);
                    quanli.themcanbo(ks);
                    System.out.println("Đã thêm Kỹ sư!");
                } else if (loai == 3) {
                    System.out.print("Nhập công việc: ");
                    String congViec = nhap.nextLine();
                    NhanVien nv = new NhanVien(ten, tuoi, gt, dc, congViec);
                    quanli.themcanbo(nv);
                    System.out.println("Đã thêm Nhân viên!");
                }
            } else if (chon == 2) {
                quanli.hienthi();
            } else if (chon == 3) {
                // SỬA: Thêm chức năng tìm kiếm
                System.out.print("Nhập họ tên cần tìm: ");
                String name = nhap.nextLine();
                quanli.tiemkiemthehoten(name);
            } else if (chon == 4) {
                System.out.println("Tạm biệt Nam!");
                break;
            }
        }
    }
}