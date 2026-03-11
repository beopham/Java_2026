package OOP_NEU_K63;

import java.util.ArrayList;

public class QuanLiPhong {
	private ArrayList<Phong> quanli;

	public QuanLiPhong() {
		this.quanli = new ArrayList<Phong>();
	}

	public QuanLiPhong(ArrayList<Phong> quanli) {
		this.quanli = quanli;
	}

	public ArrayList<Phong> getQuanli() {
		return quanli;
	}

	public void setQuanli(ArrayList<Phong> quanli) {
		this.quanli = quanli;
	}

	public void them(Phong ph) {
		quanli.add(ph);
	}
    public void tongsophong()
    {
 
    	System.out.println("Tổng số phòng"+ quanli.size());
    }
	public boolean sosanh(Phong p1, Phong p2) {
		if (p1.getDongia() < p2.getDongia()) {
			return true;
		} else {
			return false;
		}

	}
    public void tinhphdacbiet()
    {
    	for(Phong ph : quanli)
    	{
    		if(ph instanceof PhongDacBiet)
    		{
    			PhongDacBiet phdb= (PhongDacBiet) ph;
        		int dongia=0;
        		dongia=(phdb.getViTri()+phdb.getChiSoPhucVu())*phdb.getGiaCoBan();
        	    System.out.println("giá phòng đặc biệt là" + dongia);	
    		}
    		
    	}
    }
    public void tinhphloaithuong()
    {
    	for(Phong ph : quanli)
    	{
    		if(ph instanceof PhongLoaiThuong)
    		{
    			PhongLoaiThuong phlt= (PhongLoaiThuong) ph;
        		int dongia=0;
        		dongia=phlt.getHeSoPhong()*phlt.getGiaCoBan();
        	    System.out.println("giá phòng đặc biệt là" + dongia);	
    		}
    		
    	}
    }
    public void hienthiphong()
    {
    	for(Phong ph : quanli)
    	{
    		if(ph instanceof PhongDacBiet)
    		{
    			PhongDacBiet phdb= (PhongDacBiet) ph;
        	     phdb.display();
    		}
    		
    	}
    	for(Phong ph : quanli)
    	{
    		if(ph instanceof PhongLoaiThuong)
    		{
    			PhongLoaiThuong phlt= (PhongLoaiThuong) ph;
        	    phlt.display();
    		}
    		
    	}
    }
}
