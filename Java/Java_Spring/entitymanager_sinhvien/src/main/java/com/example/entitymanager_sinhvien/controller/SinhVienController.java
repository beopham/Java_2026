package com.example.entitymanager_sinhvien.controller;


import com.example.entitymanager_sinhvien.entity.SinhVien;
import com.example.entitymanager_sinhvien.service.SinhVienService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SinhVienController {
    private SinhVienService sinhVienService;

    @Autowired
    public SinhVienController(SinhVienService sinhVienService) {
        this.sinhVienService = sinhVienService;
    }

    public void insert(SinhVien sinhVien) {
        sinhVienService.insert(sinhVien);
    }
}
