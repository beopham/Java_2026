package com.example.entitymanager_sinhvien.Test;

import com.example.entitymanager_sinhvien.controller.SinhVienController;
import com.example.entitymanager_sinhvien.entity.SinhVien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;
@Component
public class SinhVienTest {
    private SinhVienController sinhVienController;
    private Scanner sc = new Scanner(System.in);

    @Autowired
    public  SinhVienTest(SinhVienController sinhVienController) {
        this.sinhVienController = sinhVienController;
    }
    public void hienThiMenu() {
        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Thêm sinh viên");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            int chon = Integer.parseInt(sc.nextLine());

            if (chon == 1) {
                insert(); // Gọi hàm nhập liệu phía dưới
            } else if (chon == 0) {
                System.out.println("Tạm biệt!");
                System.exit(0);
            } else {
                System.out.println("Chọn sai rồi!");
            }
        }
    }
    public void insert() {
        System.out.println("Nhập vào họ đệm");
        String hodem = sc.nextLine();
        System.out.println("Nhập vào tên");
        String ten = sc.nextLine();
        System.out.println("Nhập vào email");
        String email = sc.nextLine();
        SinhVien sv = new SinhVien(hodem, ten, email);

        try {
            sinhVienController.insert(sv);
            System.out.println("Thêm thành công");
        } catch (Exception e) {
            System.out.println("lỗi thêm k thành công");
        }

    }
}
