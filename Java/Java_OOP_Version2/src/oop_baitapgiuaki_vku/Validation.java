package oop_baitapgiuaki_vku;

public class Validation {
	public static void Number_Exception(String so) throws Number_Exception {
		String regex = "^\\d+$";
		if (!so.matches(regex)) {
			throw new Number_Exception("Bjn phải nhập vào số");
		}

		try {
             
             int id=Integer.parseInt(so);
             if(id<0)
             {
            	 throw new Number_Exception("Bạn phải nhập vào số lớn hơn 0");	 
             }
            
		} catch (Number_Exception e) {
			
		}
	}
	public static void Text_Exception(String ma) throws Text_Exception
	{
		String regex=" ^[a-zA-Z0-9]+$";
		if(!ma.matches(regex))
		{
			throw new Text_Exception("Mã hộ gia đình k hợp lệ");
		}
	}
}
