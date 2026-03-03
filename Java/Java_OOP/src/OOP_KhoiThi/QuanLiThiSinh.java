package OOP_KhoiThi;

import java.util.ArrayList;

public class QuanLiThiSinh {
	private ArrayList<ThiSinh> quanlithisinh;

	public QuanLiThiSinh() {
		this.quanlithisinh = new ArrayList<ThiSinh>();
	}

	public QuanLiThiSinh(ArrayList<ThiSinh> quanlithisinh) {
		this.quanlithisinh = quanlithisinh;
	}
    public void themThisinh(ThiSinh thisinh)
    {
    	quanlithisinh.add(thisinh);
    }
    public void hienthi()
    {
    	quanlithisinh.forEach(thisinh->thisinh.display());
    }
    public void timkiem(String sobaodanh)
    {
    	boolean tk=false;
    	for(ThiSinh ts : quanlithisinh)
    	{
    		tk=true;
    		if(ts.getSoBaoDanh().equalsIgnoreCase(sobaodanh))
    		{
    			ts.display();
    		}
    	}
    	if(tk==false)
    	{
    		System.out.println("k có số báo danh");
    	}
    }
    
}
