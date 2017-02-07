package homework;

import java.util.Scanner;

public class Homework {
	private double numerator;
	private double denumerator;

	// constructor
	public Homework() {
		this.numerator = 0;
		this.denumerator = 1;
	}

	public Homework(double numerator, double denumerator) {
		this.numerator = numerator;
		this.denumerator = denumerator;
	}
	// setter and getter

	public double getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public double getDenumerator() {
		return denumerator;
	}

	public void setDenumerator(int denumerator) {
		this.denumerator = denumerator;
	}

	public String rationalForm(String numm,String denn) {
		numm = Double.toString(getNumerator());
		denn=Double.toString(getDenumerator());
		return numm + '/' + denn;
	}
	
	public String Multi(double numerator1, double denum1,double numerator2, double denum2){
		double multinum= numerator1*numerator2;
		double multiden= denum1*denum2;
		
		Homework hw= new Homework(multinum,multiden);
		String stringNum=Double.toString(hw.getNumerator());
		String stringDen=Double.toString(hw.getDenumerator());
		return hw.rationalForm(stringNum,stringDen);
	
	}
	
	public double method(double num,double den) {
		num=getNumerator();
		den=getDenumerator();
		return numerator / denumerator;
	}
	public double valueRational(double numerator1, double denum1,double numerator2, double denum2){
		double numm=numerator1*numerator2;
		double denn=denum1*denum2;
	
		Homework hw=new Homework(numm,denn);
		return hw.method(numm, denn);
	}
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter numerator 1 :");
		double scanNum1=scan.nextDouble();
		System.out.println("Enter denumerator 1:");
		double scanDen1=scan.nextDouble();
		System.out.print("Enter numerator 2 :");
		double scanNum2=scan.nextDouble();
		System.out.println("Enter denumerator 2:");
		double scanDen2=scan.nextDouble();
		Homework hw = new Homework(scanNum1/scanDen1,scanNum2/scanDen2);

		System.out.println(hw.valueRational(scanNum1,scanDen1,scanNum2,scanDen2));
	
		System.out.println(hw.Multi(scanNum1,scanDen1,scanNum2,scanDen2));
	}
}
