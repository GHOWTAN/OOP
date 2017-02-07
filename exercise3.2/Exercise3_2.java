package exercise3_2;


public class Exercise3_2 {
	
	private int date;
	private int month;
	private int year;

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

	public Exercise3_2(){
		java.time.LocalDate today = java.time.LocalDate.now();
		date = today.getDayOfMonth();
		month = today.getMonthValue();
		year = today.getYear();
	}
	public Exercise3_2(int date,int month,int year){
		this.date=date;
		this.month=month;
		this.year=year;
	}
	public Exercise3_2(String st1){
		
		String[] values =st1.split("-");
		 date = Integer.parseInt(values[0]);
		 month = Integer.parseInt(values[1]);
		 year = Integer.parseInt(values[2]);
		
	}
	 
	public String toString(){
		return (date + "."+month+"."+year);
	}
	
	
	public static void main(String[] args) {
		Exercise3_2 output1 = new Exercise3_2("2-3-2014");
		System.out.println(output1.toString());	
		Exercise3_2 output2 = new Exercise3_2(2,3,2014);
		System.out.println(output2.toString());
		Exercise3_2 output3 = new Exercise3_2();
		System.out.println(output3.toString());
		
	}
	
	
}
