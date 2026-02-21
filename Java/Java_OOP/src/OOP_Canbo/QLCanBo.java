package OOP_Canbo;

import java.util.ArrayList;

public class QLCanBo {
  private ArrayList<CanBo> danhsachcanbo;


  public QLCanBo() {

	this.danhsachcanbo = new ArrayList<CanBo>();
  }
  public QLCanBo(ArrayList<CanBo> danhsachcanbo) {

	this.danhsachcanbo = danhsachcanbo;
  }
  
  public void themcanbo(CanBo canbo)
  {
	danhsachcanbo.add(canbo);  
  }
//  public void hienthi()
//  {
//	 for(CanBo cb : danhsachcanbo)
//	 {
//		 cb.display();
//	 }
//  }
  public void hienthi()
  {
	 danhsachcanbo.forEach(cb->cb.display());
  }
  public void tiemkiemthehoten(String ten) {
	    boolean found = false; // Biến cờ để đánh dấu có tìm thấy ai không

	    for (CanBo cb : danhsachcanbo) {
	        if (cb.getTen().equalsIgnoreCase(ten)) {
	            cb.display(); // Tìm thấy là in ra ngay
	            found = true; // Đánh dấu là đã tìm thấy ít nhất 1 người
	        }
	    }

	    // Sau khi chạy hết vòng lặp mà found vẫn là false thì mới báo lỗi
	    if (!found) {
	        System.out.println("R m k có tên đui!");
	    }
	}
}
