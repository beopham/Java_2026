package OOP_Student;

class InvalidFullNameException extends Exception{
	public InvalidFullNameException(String ten) {
		  super(ten);
	}
}
class InvalidDOBException extends Exception{
	public InvalidDOBException(String ngaythang) {
		  super(ngaythang);
	}
}
class InvalidPhoneNumberException extends Exception{
	public InvalidPhoneNumberException(String sdt) {
		  super(sdt);
	}
}

public class Validator{
    public static boolean checkten(String ten) throws InvalidFullNameException
    {
    	if(ten.length()>=10 && ten.length()<=50)
    	{
            return true;    		
    	}
    	else {
			throw new InvalidFullNameException("Tên tối thiểu phải 10 kí tự và k quá 50 kí tự");
		}

    }
    public static boolean checkngaysinh(String sdth) throws InvalidDOBException
    {
        String regex = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/\\d{4}$";
    	if(sdth.matches(regex))
    	{
            return true;    		
    	}
    	else {
			throw new InvalidDOBException("Ngày Sinh K đúng định dạng");
		}

    }
    public static boolean checksdth(String sdth) throws InvalidPhoneNumberException
    {
        String regex = "^(090|098|091|031|035|038)\\d{7}$";
    	if(sdth.matches(regex))
    	{
            return true;    		
    	}
    	else {
			throw new InvalidPhoneNumberException("Số điện thoại k chính xác");
		}

    }
}
