package exer1;


import java.util.Arrays;
import java.util.Scanner;

public class Exer1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("how many values?");
		int size = input.nextInt();
		int[] values= new int[size];
		System.out.println("values?");
		for(int i=0 ;i<size;i++){
			values[i]=input.nextInt();
		}
		Arrays.sort(values);
		for(int sortint : values){
			System.out.println(sortint);
		}
	}

}
