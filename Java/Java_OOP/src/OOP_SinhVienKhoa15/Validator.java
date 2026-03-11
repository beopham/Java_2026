package OOP_SinhVienKhoa15;

class loidiem extends Exception{
	public loidiem(String diem) {
		// TODO Auto-generated constructor stub
	   super(diem);
	}
}
class loiten extends Exception {
	public loiten(String ten) {
		super(ten);
	}
}

class loingaysinh extends Exception {
	public loingaysinh(String ngaysinh) {
		// TODO Auto-generated constructor stub
		super(ngaysinh);
	}
}


public class Validator {
     public static boolean checkloidiem(String ten) throws loidiem
     {
    	 //String regrex="";
    	 String regex = "^([0-9](\\.[0-9]{1,2})?|10(\\.0{1,2})?)$";
    	 if(ten.matches(regex))
    	 { 
    		 return true; 
    	 }
    	 else {
			throw new loidiem("Bạn phải nhập váo số nha");
		}
     }
     
     public static boolean checkloiten(String ten) throws loiten
     {
     	String regex = "^[a-zA-Z\\s\\p{L}]+$";
    	 if(ten.matches(regex))
    	 {
    		 return true;
    	 }
    	 else {
			throw new loiten("Tên k đúng định dạng");
		}
     }
     public static boolean checkngaysinh(String ngaysinh) throws loingaysinh
     {
     	String regex = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$";
     	if(ngaysinh.matches(regex))
     	{
                return true;		
     	}
     	else {
 			throw new loingaysinh("ngày sinh k đúng định dạng");
 		}
     }
     
}
