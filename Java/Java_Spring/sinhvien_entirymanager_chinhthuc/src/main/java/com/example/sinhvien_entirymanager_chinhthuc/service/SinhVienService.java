package com.example.sinhvien_entirymanager_chinhthuc.service;

import com.example.sinhvien_entirymanager_chinhthuc.entity.SinhVien;

import java.util.List;

public interface SinhVienService {
    public List<SinhVien> findAll();

    public void insert(SinhVien sinhVien);

    public void update(SinhVien sinhVien);

    public void delete(int id);

    public SinhVien findById(int id);
    public List<SinhVien> findByName(String ten) ;
}
