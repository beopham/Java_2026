package com.example.entitymanager_sinhvien.service.impl;

import com.example.entitymanager_sinhvien.entity.SinhVien;
import com.example.entitymanager_sinhvien.repository.SinhVienRepository;
import com.example.entitymanager_sinhvien.service.SinhVienService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Transactional
@Service
public class SinhVienServiceImpl implements SinhVienService {
    private SinhVienRepository sinhVienRepository;

    @Autowired
    public SinhVienServiceImpl(SinhVienRepository sinhVienRepository) {
        this.sinhVienRepository = sinhVienRepository;
    }

    @Override
    public List<SinhVien> findAll() {
        return List.of();
    }

    @Override
    public void insert(SinhVien sinhVien)
    {
        sinhVienRepository.insert(sinhVien);
    }

    @Override
    public void update(SinhVien sinhVien) {

    }

    @Override
    public void delete(SinhVien sinhVien) {

    }

    @Override
    public SinhVien selectByid(int id_sinhvien) {
        return null;
    }
}
