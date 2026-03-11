package OOP_GiaDien_VKU;

import java.util.ArrayList;
import java.util.Comparator;

public class Manager {
	private ArrayList<Family> giadinh;

	public Manager() {
        this.giadinh=new ArrayList<Family>();
	}

	public Manager(ArrayList<Family> giadinh) {
		this.giadinh = giadinh;
	}

	public ArrayList<Family> getGiadinh() {
		return giadinh;
	}

	public void setGiadinh(ArrayList<Family> giadinh) {
		this.giadinh = giadinh;
	}
   public void themgiadinh(Family family)
   {
	   giadinh.add(family);
   }
   public void display()
   {
	   for(Family family :giadinh)
	   {
		   family.hienthi();
	   }
   }
   public void sapxepgiamdansotiendien()
   {
	   giadinh.stream().sorted(Comparator.comparing(Family::Tiendien).reversed()).forEach(gd->gd.hienthi());
   }
   public void sapxeptangdansotiennuoc()
   {
	   giadinh.stream().sorted(Comparator.comparing(Family::Tennuoc)).forEach(gd->gd.hienthi());
   }
}
