package exercise2_3;

import java.util.Scanner;

public class OutputString {

	public void process() {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many lines?");
		int number = sc.nextInt();
		Exercise2_3[] lines = new Exercise2_3[number];
		for(int i = 0;i<number;i++){
			sc.nextLine();
			lines[i]=new Exercise2_3();
			System.out.print("whats the date?");
			lines[i].setDate(sc.nextInt());
			System.out.print("whats the month?");
			lines[i].setMonth(sc.nextInt());
			System.out.print("whats the year?");
			lines[i].setYear(sc.nextInt());
			
		}
		System.out.println("Results");
		for(int i=0;i<number;i++){
			System.out.println(lines[i].getDate()+"/"+lines[i].getMonth()+"/"+lines[i].getYear());
		}

	}

	public static void main(String[] args) {
		OutputString program = new OutputString();
		program.process();
	}
	
}
