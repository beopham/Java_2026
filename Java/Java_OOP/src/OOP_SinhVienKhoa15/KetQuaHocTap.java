package OOP_SinhVienKhoa15;

public class KetQuaHocTap {
	private String ketqua;
	private double diemtb;
    
	
	public KetQuaHocTap()
	{
		
	}


	public KetQuaHocTap(String ketqua, double diemtb) {
		this.ketqua = ketqua;
		this.diemtb = diemtb;
	}


	public String getKetqua() {
		return ketqua;
	}


	public void setKetqua(String ketqua) {
		this.ketqua = ketqua;
	}


	public double getDiemtb() {
		return diemtb;
	}


	public void setDiemtb(double diemtb) {
		this.diemtb = diemtb;
	}
	public void display() {
		System.out.println("Kết quả học tập của sinh viên ");
        System.out.println("Điểm trung bình: " + getDiemtb());
        System.out.println("Kết quả học tập: " + getKetqua());
    }
}

