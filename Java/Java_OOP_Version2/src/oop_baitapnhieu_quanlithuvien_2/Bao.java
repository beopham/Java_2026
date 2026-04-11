package oop_baitapnhieu_quanlithuvien_2;

public class Bao extends Tailieu {
    // Chỉ giữ lại thuộc tính ngày phát hành theo yêu cầu
    private int ngayphathanh; 
   
    public Bao() {
    }

    // Constructor gọn gàng hơn
    public Bao(int matailieu, String tennhaxb, String sobanphathanh, int ngayphathanh) {
        super(matailieu, tennhaxb, sobanphathanh);
        this.ngayphathanh = ngayphathanh;
    }

    // Getter và Setter cho ngayphathanh
    public int getNgayphathanh() {
        return ngayphathanh;
    }

    public void setNgayphathanh(int ngayphathanh) {
        this.ngayphathanh = ngayphathanh;
    }

    @Override
    public void hienthi() {
        System.out.println("Thông tin Báo");
        // Gọi các getter từ lớp cha Tailieu
        System.out.println("Mã tài liệu: " + getMatailieu());
        System.out.println("Nhà xuất bản: " + getTennhaxb());
        System.out.println("Số bản phát hành: " + getSobanphathanh());
        
        // Hiển thị ngày phát hành
        System.out.println("Ngày phát hành: " + getNgayphathanh());
        System.out.println("----------------------------");
    }
}