package com.example.sinhvien_entirymanager_chinhthuc.service.impl;

import com.example.sinhvien_entirymanager_chinhthuc.entity.SinhVien;
import com.example.sinhvien_entirymanager_chinhthuc.repository.SinhVienRepository;
import com.example.sinhvien_entirymanager_chinhthuc.service.SinhVienService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class SinhVienServiceImpl implements SinhVienService {

    private SinhVienRepository sinhVienRepository;

    @Autowired
    public SinhVienServiceImpl(SinhVienRepository sinhVienRepository) {
        this.sinhVienRepository = sinhVienRepository;
    }

    @Override
    public List<SinhVien> findAll() {
        return sinhVienRepository.findAll();
    }

    @Override
    public void insert(SinhVien sinhVien) {
        sinhVienRepository.insert(sinhVien);

    }

    @Override
    public void update(SinhVien sinhVien) {
        sinhVienRepository.update(sinhVien);
    }

    @Override
    public void delete(int id) {
        sinhVienRepository.delete(id);
    }

    @Override
    public SinhVien findById(int id) {
        return sinhVienRepository.findById(id);
    }

    @Override
    public List<SinhVien> findByName(String ten) {
        return sinhVienRepository.findByName(ten);
    }

}
