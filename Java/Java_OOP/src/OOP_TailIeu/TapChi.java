package OOP_TailIeu;

public class TapChi extends TaiLieu {
    // 1. Các thuộc tính riêng (Private)
    private int soPhatHanh;
    private int thangPhatHanh;

    // 2. Constructor rỗng (Default)
    public TapChi() {
        super(); // Gọi constructor rỗng của lớp cha
    }

    // 3. Constructor có tham số (3 của cha + 2 của con)
    public TapChi(String maTaiLieu, String tenNXB, int soBanPhatHanh, int soPhatHanh, int thangPhatHanh) {
        // Sử dụng super để truyền dữ liệu lên lớp cha TaiLieu
        super(maTaiLieu, tenNXB, soBanPhatHanh);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    // 4. Getter và Setter
    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public int getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

    // 5. Hàm hiển thị (Display)
    @Override
    public void display() {
        System.out.println("Tạp Chí");
        // Gọi hàm display của lớp cha để in Mã TL, Tên NXB, Số bản PH
        super.display(); 
        // In thêm thông tin riêng của Tạp chí
        System.out.println("So phat hanh: " + soPhatHanh);
        System.out.println("Thang phat hanh: " + thangPhatHanh);
        System.out.println("---------------------------");
    }
}