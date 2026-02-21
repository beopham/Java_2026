package OOP_TailIeu;

public class Bao extends TaiLieu {
    // 1. Thuộc tính riêng (Private)
    private int ngayPhatHanh;

    // 2. Constructor rỗng
    public Bao() {
        super();
    }

    // 3. Constructor có tham số (3 của cha + 1 của con)
    public Bao(String maTaiLieu, String tenNXB, int soBanPhatHanh, int ngayPhatHanh) {
        // Truyền các thông tin chung lên constructor của lớp cha TaiLieu
        super(maTaiLieu, tenNXB, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    // 4. Getter và Setter
    public int getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(int ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    // 5. Hàm hiển thị (Display)
    @Override
    public void display() {
        System.out.println("Báo");
        // Gọi lại hàm display của cha để in thông tin chung
        super.display();
        // In thông tin riêng của Báo
        System.out.println("Ngay phat hanh: " + ngayPhatHanh);
        System.out.println("---------------------------");
    }
}