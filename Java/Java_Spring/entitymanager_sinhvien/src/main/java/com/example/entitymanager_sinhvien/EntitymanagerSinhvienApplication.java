package com.example.entitymanager_sinhvien;

import com.example.entitymanager_sinhvien.Test.SinhVienTest;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EntitymanagerSinhvienApplication {

	public static void main(String[] args) {
		// SỬA TẠI ĐÂY: Hứng luôn context khi Spring khởi chạy
		ApplicationContext context = SpringApplication.run(EntitymanagerSinhvienApplication.class, args);

		// Lấy đối tượng SinhVienTest đã được Spring lắp ráp hoàn chỉnh ra
		SinhVienTest sinhVienTest = context.getBean(SinhVienTest.class);

		// Kích hoạt menu chạy thôi!
		sinhVienTest.hienThiMenu();
	}

}
