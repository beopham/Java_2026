package Try_Catch;


class loiso extends Exception{
	public loiso(String bt) {
		super(bt);
	}
}
class loiemaiil extends Exception{
	public loiemaiil(String bt)
	{
		super(bt);
	}
}

class loisdt extends Exception{
	public loisdt(String tb) {
		super(tb);
	}
}
public class Validator
{
	public boolean checkso(String input) throws loiso
	{
		
		String regex = "\\d+";
		if(input.matches(regex))
		{
			return true;
		}
		else {
			throw new loiso ("phải nhập số k đc nhập chữ");
		}
	}
	public static boolean checkemmail(String input) throws loiemaiil
	{

		String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
		if(input.matches(regex))
		{
			return true;
		}
		else {
			throw new loiemaiil ("email k dúng định dạng");
		}
	}
	public static boolean checksdt(String input) throws loiemaiil
	{
		String regex = "^0\\d{9}$";
		if(input.matches(regex))
		{
			return true;
		}
		else {
			throw new loiemaiil ("sdth k dúng định dạng");
		}
	}
}