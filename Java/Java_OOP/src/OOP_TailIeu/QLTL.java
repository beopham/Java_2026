package OOP_TailIeu;

import java.util.ArrayList;

public class QLTL {
	private ArrayList<TaiLieu> quanlitailieu;

	public QLTL() {
		this.quanlitailieu = new ArrayList<TaiLieu>();
	}

	public QLTL(ArrayList<TaiLieu> quanlitailieu) {

		this.quanlitailieu = quanlitailieu;
	}

	public void themtl(TaiLieu tl) {
		quanlitailieu.add(tl);
	}

	public void xoa(String matl) {
		boolean xoa = quanlitailieu.removeIf(tl -> tl.getMaTaiLieu().equalsIgnoreCase(matl));
		if (xoa == true) {
			System.out.println("đã xóa thành công");
		} else {
			System.out.println("k có mã tài liệu");
		}
	}

	public void hienthi() {
		quanlitailieu.forEach(cb -> cb.display());
	}

	public void tiemkiemtheosach(String macantim) {
		boolean tk=false;
		for (TaiLieu tl : quanlitailieu) {
          if(tl instanceof Sach && tl.getMaTaiLieu().equalsIgnoreCase(macantim))
          {
        	  System.out.println("Dã tìm thấy sách có mã là " + macantim);
        	  tl.display();
        	  tk=true;
          }
		}
		if(tk==false)
		{
		  	  System.out.println("Không tìm thấy sách có mã là " + macantim);
		}
	}
	public void tiemkiemtheoTapchi(String macantim) {
		boolean tk=false;
		for (TaiLieu tl : quanlitailieu) {
          if(tl instanceof TapChi && tl.getMaTaiLieu().equalsIgnoreCase(macantim))
          {
        	  System.out.println("Dã tìm thấy tạp chí có mã là " + macantim);
        	  tl.display();
        	  tk=true;
          }
		}
		if(tk==false)
		{
		  	  System.out.println("Không tìm thấy tạp chí có mã là " + macantim);
		}
	}
	public void tiemkiemtheoBao(String macantim) {
		boolean tk=false;
		for (TaiLieu tl : quanlitailieu) {
          if(tl instanceof Bao && tl.getMaTaiLieu().equalsIgnoreCase(macantim))
          {
        	  System.out.println("Dã tìm thấy báo có mã là " + macantim);
        	  tl.display();
        	  tk=true;
          }
		}
		if(tk==false)
		{
		  	  System.out.println("Không tìm thấy báo có mã là " + macantim);
		}
	}
}
