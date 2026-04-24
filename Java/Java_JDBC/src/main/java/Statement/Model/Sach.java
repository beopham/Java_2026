package Statement.Model;

import java.time.LocalDate;

public class Sach {
    private int id;
    private String ten;
    private  int tuoi;
    private String diachi;
    private LocalDate ngayinh;

    public Sach() {

    }

    public Sach(int id, String ten, int tuoi, String diachi, LocalDate ngayinh) {
        this.id = id;
        this.ten = ten;
        this.tuoi = tuoi;
        this.diachi = diachi;
        this.ngayinh = ngayinh;
    }

    public Sach(String ten, int tuoi, String diachi, LocalDate ngayinh, int id) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diachi = diachi;
        this.ngayinh = ngayinh;
        this.id = id;
    }

    public Sach(int id) {
        this.id = id;
    }

    public Sach(String ten, int tuoi, String diachi, LocalDate ngayinh) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diachi = diachi;
        this.ngayinh = ngayinh;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public LocalDate getNgayinh() {
        return ngayinh;
    }

    public void setNgayinh(LocalDate ngayinh) {
        this.ngayinh = ngayinh;
    }
    // Hàm display tự viết
    public void display() {
        System.out.println("------------------------------------");
        System.out.println("Tên sách: " + this.ten);
        System.out.println("Tuổi (năm XB): " + this.tuoi);
        System.out.println("Địa chỉ: " + this.diachi);
        System.out.println("Ngày in: " + this.ngayinh);
    }
}
