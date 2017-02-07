package exercise4_1;


public class Form {
	
	private int date;
	private int month;
	private int year;
	public static final String[] MONTHNAMES = {"January", "February",
		"March", "April", "May", "June", "July", "August",
		"September", "October", "November", "December"};
	
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

	public Form(){
		java.time.LocalDate today = java.time.LocalDate.now();
		date = today.getDayOfMonth();
		month = today.getMonthValue();
		year = today.getYear();
	}
	public Form(int date,int month,int year){
		this.date=date;
		this.month=month;
		this.year=year;
	}
	public Form(String st1){
		
		String[] values =st1.split("-");
		 date = Integer.parseInt(values[0]);
		 month = Integer.parseInt(values[1]);
		 year = Integer.parseInt(values[2]);
		
	}
	 
	public String toString(){
		return (date + "."+month+"."+year);
	}
	public String newtoString(){
		return (date + " of "+MONTHNAMES[month-1]+","+year);
	}
	
	public static void main(String[] args) {
		Form output1 = new Form("2-3-2014");
		System.out.println(output1.toString());	
		Form output2 = new Form(2,3,2014);
		System.out.println(output2.toString());
		Form output3 = new Form();
		System.out.println(output3.newtoString());
		
	}
	
	
}
