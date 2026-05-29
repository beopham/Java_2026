package com.example.entitymanager_sinhvien.repository.impl;

import com.example.entitymanager_sinhvien.entity.SinhVien;
import com.example.entitymanager_sinhvien.repository.SinhVienRepository;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Transactional
public class SinhVienRepositoryImpl implements SinhVienRepository {

    private EntityManager entityManager;

    @Autowired
    public SinhVienRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<SinhVien> findAll() {
        return List.of();
    }

    @Override
    public void insert(SinhVien sinhVien) {
        entityManager.persist(sinhVien);
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
