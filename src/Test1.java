package test1;

import java.util.Scanner;



public class Test1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("your name?");
		String name = input.nextLine();
		System.out.println("hello " + name);
		//input.close();
	}

}
