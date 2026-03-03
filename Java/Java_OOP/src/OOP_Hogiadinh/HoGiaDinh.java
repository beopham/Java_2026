package OOP_Hogiadinh;

import java.util.ArrayList;

public class HoGiaDinh {
	private String sonha;
	private ArrayList<Nguoi> danhsachnguoi;

	public HoGiaDinh(String sonha, ArrayList<Nguoi> danhsachnguoi) {

		this.sonha = sonha;
		this.danhsachnguoi = danhsachnguoi;
	}

	public HoGiaDinh() {
		this.danhsachnguoi = new ArrayList<Nguoi>();
	}

	public int soluongthanhvien() {
		return danhsachnguoi.size();
	}

	
	public void display() {
	    System.out.println("---------------------------------------");
	    System.out.println("SỐ NHÀ: " + this.sonha);
	    System.out.println("Số thành viên: " + this.danhsachnguoi.size());
	    System.out.println("Chi tiết các thành viên:");
	    for (Nguoi n : danhsachnguoi) {
	        n.display(); // Gọi đúng hàm display của lớp Nguoi
	    }
	}

}
