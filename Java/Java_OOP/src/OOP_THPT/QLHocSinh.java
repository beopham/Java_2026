package OOP_THPT;

import java.util.ArrayList;

public class QLHocSinh {
     private ArrayList<HocSinh> hocsinh;
     public QLHocSinh() {
 		this.hocsinh = new ArrayList<HocSinh>();
 	 }
      
	 public QLHocSinh(ArrayList<HocSinh> hocsinh) {
		this.hocsinh = hocsinh;
	 }
     
	 public void them(HocSinh hocSinh)
	 {
		 hocsinh.add(hocSinh);
	 }
     public void display()
     {
    	 for(HocSinh hs :hocsinh)
    	 {
    		 hs.display();
    	 }
     }
     public void hstren20()
     {
    	 for(HocSinh hs :hocsinh)
    	 {
    		 if(hs.getTuoi()>20)
    		 {
    			 hs.display();		 
    		 }
    	
    	 }
     }
     public void hstuoi23_que_dn()
     {
    	 for(HocSinh hs :hocsinh)
    	 {
    		 if(hs.getTuoi()==23 && hs.getQueQuan().equalsIgnoreCase("Đà Nẵng"))
    		 {
    			 hs.display();		 
    		 }
    	
    	 }
     }
}
