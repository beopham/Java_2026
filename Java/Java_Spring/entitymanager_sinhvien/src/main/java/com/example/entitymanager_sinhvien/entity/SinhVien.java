package com.example.entitymanager_sinhvien.entity;

import jakarta.persistence.*;

@Entity
@Table(name="sinhvien")
public class SinhVien {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sinhvien")
    private int idSinhvien;
    @Column(name = "hodem",nullable = false,length = 200)
    private String hoDem;
    @Column(name = "ten",nullable = false,length = 200)
    private String ten;
    @Column(name = "email",nullable = false,length = 200)
    private String email;

    public SinhVien()
    {

    }
    public SinhVien(int idSinhvien, String hoDem, String ten, String email) {
        this.idSinhvien = idSinhvien;
        this.hoDem = hoDem;
        this.ten = ten;
        this.email = email;
    }

    public SinhVien(String hoDem, String ten, String email) {
        this.hoDem = hoDem;
        this.ten = ten;
        this.email = email;
    }

    public int getIdSinhvien() {
        return idSinhvien;
    }

    public void setIdSinhvien(int idSinhvien) {
        this.idSinhvien = idSinhvien;
    }

    public String getHoDem() {
        return hoDem;
    }

    public void setHoDem(String hoDem) {
        this.hoDem = hoDem;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "idSinhvien=" + idSinhvien +
                ", hoDem='" + hoDem + '\'' +
                ", ten='" + ten + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
