package com.example.sinhvien_entirymanager_chinhthuc.test;

import com.example.sinhvien_entirymanager_chinhthuc.controller.SinhVienController;
import com.example.sinhvien_entirymanager_chinhthuc.entity.SinhVien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Scanner;

@Component
public class SinhVienTest implements CommandLineRunner {

    private SinhVienController sinhVienController;
    private Scanner sc = new Scanner(System.in);

    @Autowired
    public SinhVienTest(SinhVienController sinhVienController) {
        this.sinhVienController = sinhVienController;
    }

    public void themsv() {
        System.out.println("Nhập vào họ đệm");
        String hodem = sc.nextLine();
        System.out.println("Nhập vào tên");
        String ten = sc.nextLine();
        System.out.println("Nhập vào email");
        String email = sc.nextLine();
        SinhVien sv = new SinhVien(hodem, ten, email);
        try {
            sinhVienController.insert(sv);
            System.out.println("thêm thành công");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("k thêm đc");
        }

    }

    public void timsvtheoId() {
        System.out.println("Tìm sinh viên theo ID");
        int id = sc.nextInt();
        sc.nextLine();
        SinhVien sinhVien = sinhVienController.findById(id);
        if (sinhVien == null) {
            System.out.println("sinh viên k có ");
        } else {
            System.out.println("Đã Tìm Thấy");
            System.out.println(sinhVien.toString());
        }
    }

    public void timsvtheoTen() {
        System.out.println("Tìm sinh viên theo tên");
        String ten = sc.nextLine();
        try {
            List<SinhVien> sinhViens = sinhVienController.findByName(ten);
            if (sinhViens.isEmpty() || sinhViens == null) {
                System.out.println(" k tìm thấy sinh viên");
            }
            for (SinhVien s : sinhViens) {
                System.out.println(s.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("k có tên ");
        }
    }

    public void capnhap() {
        System.out.println("Nhập vào id bạn muốn cập nhập");
        int id = sc.nextInt();
        sc.nextLine();
        SinhVien svhientai = sinhVienController.findById(id);
        if (svhientai == null) {
            System.out.println("Sinh viên k có id ");
            return;
        }
        System.out.println("=> Thông tin cũ: " + svhientai.toString());
        System.out.println("--- NHẬP THÔNG TIN MỚI ĐỂ SỬA ---");
        System.out.println("Nhập vào họ đệm");
        String hodem = sc.nextLine();
        System.out.println("Nhập vào tên");
        String ten = sc.nextLine();
        System.out.println("Nhập vào email");
        String email = sc.nextLine();
        svhientai.setEmail(email);
        svhientai.setHodem(hodem);
        svhientai.setTen(ten);

        try {
            sinhVienController.update(svhientai);
            System.out.println("cập nhập thành công");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("k cập nhập đc");

        }
    }
   public void xoa() {
        System.out.println("Nhập vào id bạn muốn xóa");
        int id = sc.nextInt();
        sc.nextLine(); // <--- BẮT BUỘC PHẢI THÊM DÒNG NÀY Ở ĐÂY!

        try {
            sinhVienController.delete(id);
            System.out.println("đã xóa thành công");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("k xóa đc"); // Thêm dòng này để dễ nhận biết khi lỗi
        }
    }
    public void findAll() {
        List<SinhVien> sinhViens = sinhVienController.findAll();
        for (SinhVien sinhVien : sinhViens) {
            System.out.println(sinhVien.toString());
        }
    }

    @Override
    public void run(String... args) throws Exception {
        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Tìm sinh viên theo ID");
            System.out.println("3. Hiển thị danh sách sinh viên");
            System.out.println("4. Hiển thị danh sách sinh viên theo tên");
            System.out.println("5. Cập nhập danh sách sinh viên theo ID");
            System.out.println("6. Xóa danh sách sinh viên theo ID");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            int chon = sc.nextInt();
            sc.nextLine();
            if (chon == 1) {
                themsv();

            } else if (chon == 2) {
                timsvtheoId();

            } else if (chon == 3) {
                findAll();

            } else if (chon == 4) {
                timsvtheoTen();
            } else if (chon == 5) {
                capnhap();
            } else if (chon == 6) {
                xoa();
            }
            else if (chon == 0) {
                System.out.println("đã thoát");
                break;
            }
        }
    }
}
