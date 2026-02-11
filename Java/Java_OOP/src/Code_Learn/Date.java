package Code_Learn;

public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date()
	{
		
	}

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void hienthi()
	{
		String day=String.valueOf(this.day);
		String month=String.valueOf(this.month);
		String year=String.valueOf(this.year);
		if(day.length()==1)
		{
			day="0"+day;
		}
		else if (month.length()==1)
		{
			month="0"+month;
		}
		System.out.println(day+ "/" +month+"/" + year);
	}
	
}
