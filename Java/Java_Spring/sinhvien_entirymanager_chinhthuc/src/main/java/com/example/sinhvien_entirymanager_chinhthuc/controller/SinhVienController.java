package com.example.sinhvien_entirymanager_chinhthuc.controller;

import com.example.sinhvien_entirymanager_chinhthuc.entity.SinhVien;
import com.example.sinhvien_entirymanager_chinhthuc.service.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

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
    public SinhVien findById(int id) {

        return sinhVienService.findById(id);
    }
    public List<SinhVien> findAll() {
        return sinhVienService.findAll();
    }
    public List<SinhVien> findByName(String ten) {
        return sinhVienService.findByName(ten);
    }
    public void update(SinhVien sinhVien) {
        sinhVienService.update(sinhVien);
    }
    public void delete(int id) {
        sinhVienService.delete(id);
    }

}
