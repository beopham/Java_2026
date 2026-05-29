package com.example.sinhvien_entirymanager_chinhthuc.repository;

import com.example.sinhvien_entirymanager_chinhthuc.entity.SinhVien;

import java.util.List;

public interface SinhVienRepository {
    public List<SinhVien> findAll();

    public void insert(SinhVien sinhVien);

    public void update(SinhVien sinhVien);

    public void delete(int id);

    public SinhVien findById(int id);
    public List<SinhVien> findByName(String ten) ;


}
