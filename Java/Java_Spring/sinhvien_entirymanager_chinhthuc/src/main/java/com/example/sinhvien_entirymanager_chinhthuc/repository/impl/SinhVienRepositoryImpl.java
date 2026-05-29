package com.example.sinhvien_entirymanager_chinhthuc.repository.impl;

import com.example.sinhvien_entirymanager_chinhthuc.entity.SinhVien;
import com.example.sinhvien_entirymanager_chinhthuc.repository.SinhVienRepository;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class SinhVienRepositoryImpl implements SinhVienRepository {
    private EntityManager entityManager;

    @Autowired
    public SinhVienRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<SinhVien> findAll() {
        String jpql="select s from SinhVien s";
        return entityManager.createQuery(jpql,SinhVien.class).getResultList();
    }

    @Override
    public void insert(SinhVien sinhVien) {
        entityManager.persist(sinhVien);
    }

    @Override
    public void update(SinhVien sinhVien)
    {
       entityManager.merge(sinhVien);
    }

    @Override
    public void delete(int id) {
           SinhVien sinhVien=entityManager.find(SinhVien.class,id);
           if(sinhVien!=null)
           {
                entityManager.remove(sinhVien);
           }
    }

    @Override
    public SinhVien findById(int id) {
        return entityManager.find(SinhVien.class,id);
    }

    @Override
    public List<SinhVien> findByName(String ten) {
        String jpql="select s from SinhVien s where s.ten like :tennhapvao" ;
        return entityManager.createQuery(jpql,SinhVien.class).setParameter("tennhapvao","%"+ ten+"%").getResultList();
    }

}
