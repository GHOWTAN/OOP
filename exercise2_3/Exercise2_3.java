package exercise2_3;

public class Exercise2_3 {
	private int date;
	private int month;
	private int year;
	 
	public String toString(){
		return (date + "/"+month+"/"+year);
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
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
}
