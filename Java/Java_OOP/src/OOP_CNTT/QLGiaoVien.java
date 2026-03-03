package OOP_CNTT;

import java.util.ArrayList;

public class QLGiaoVien {
	private ArrayList<CBGV> canBogv;

	public QLGiaoVien(ArrayList<CBGV> canBogv) {
		this.canBogv = canBogv;
	}

	public QLGiaoVien() {
		this.canBogv = new ArrayList<CBGV>();
	}

	public void them(CBGV canbo) {
		canBogv.add(canbo);
	}
    public void xoagv(String masogv)
    {
    	boolean xoa=canBogv.removeIf(canbo->canbo.getMaGiaovienn().equalsIgnoreCase(masogv));
    	if(xoa)
    	{
    		System.out.println("đã xóa thành công");
    	}
    	else {
    		System.out.println("k xóa đc nha lêu lêu");
		}
    }
    public void hienthi()
    {
    	for(CBGV gv : canBogv)
    	{
    		gv.display();
    	}
    }
}
