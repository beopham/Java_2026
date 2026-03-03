package OOP_Employee;

class loiemail extends Exception {
	public loiemail(String email) {
		// TODO Auto-generated constructor stub
		super(email);
	}
}

class loingaysinh extends Exception {
	public loingaysinh(String ngaysinh) {
		// TODO Auto-generated constructor stub
		super(ngaysinh);
	}
}

class loiten extends Exception {
	public loiten(String teb) {
		super(teb);
	}
}

class loisdt extends Exception {
	public loisdt(String sdth) {
         super(sdth);
	}
	// TODO Auto-generated constructor stub

}

public class Validator {
    public static boolean checkemail(String email) throws loiemail
    {
    	String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
    	if(email.matches(regex))
    	{
               return true;		
    	}
    	else {
			throw new loiemail("email k đúng định dạng");
		}
    }
    public static boolean checksdth(String sdth) throws loisdt
    {
    	String regex = "^0\\d{9}$";
    	if(sdth.matches(regex))
    	{
               return true;		
    	}
    	else {
			throw new loisdt("sdth k đúng định dạng");
		}
    }
    public static boolean checTen(String ten) throws loiten
    {
    	String regex = "^[a-zA-Z\\s\\p{L}]+$";
    	if(ten.matches(regex))
    	{
               return true;		
    	}
    	else {
			throw new loiten("tên k đúng định dạng");
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
