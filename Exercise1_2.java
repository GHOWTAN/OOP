package exercise1_2;

import java.util.Scanner;

public class Exercise1_2 {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("How many values?");
		int size = input.nextInt();
		int[] values = new int [size];
		System.out.println("Values?");
		for(int i = 0; i < size;i++){
			values[i] = input.nextInt();
		}
		System.out.println("your values:");
		for(int num: values){
			System.out.println(num);
		}
	}
}
