package com.example.sinhvien_entirymanager_chinhthuc.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "sinhvien")
public class SinhVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sinhvien")
    private int  id_sinhvien;
    @Column(name = "hodem",nullable = false,length = 200)
    private String hodem;
    @Column(name = "ten",nullable = false,length = 200)
    private String ten;
    @Column(name = "email",nullable = false,length = 200)
    private String email;

    public SinhVien(int id_sinhvien, String hodem, String ten, String email) {
        this.id_sinhvien = id_sinhvien;
        this.hodem = hodem;
        this.ten = ten;
        this.email = email;
    }

    public SinhVien(String hodem, String ten, String email) {
        this.hodem = hodem;
        this.ten = ten;
        this.email = email;
    }

    public SinhVien(int id_sinhvien) {
        this.id_sinhvien = id_sinhvien;
    }

    public SinhVien() {

    }

    public int getId_sinhvien() {
        return id_sinhvien;
    }

    public void setId_sinhvien(int id_sinhvien) {
        this.id_sinhvien = id_sinhvien;
    }

    public String getHodem() {
        return hodem;
    }

    public void setHodem(String hodem) {
        this.hodem = hodem;
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
                "id_sinhvien=" + id_sinhvien +
                ", hodem='" + hodem + '\'' +
                ", ten='" + ten + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
