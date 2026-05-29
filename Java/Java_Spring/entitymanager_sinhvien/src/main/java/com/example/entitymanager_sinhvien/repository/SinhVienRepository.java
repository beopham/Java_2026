package com.example.entitymanager_sinhvien.repository;

import com.example.entitymanager_sinhvien.entity.SinhVien;

import java.util.List;

public interface SinhVienRepository {
    public List<SinhVien> findAll();
    public void insert(SinhVien sinhVien);
    public void update(SinhVien sinhVien);
    public void delete(SinhVien sinhVien);
    public SinhVien selectByid(int id_sinhvien);
}
