package intarray;

import java.util.Scanner;



public class IntArray {
	public int min,max;
	public int[] arrays;
	public IntArray(int min,int max){
		arrays = new int[max-min+1];
		
		for(int i= 1;i<max-min;i++){
			arrays[i]=min+i;
		}
	}
	
	public double ave(){
		int sum = 0;
		double ave=0;
		for(int i= 0;i<arrays.length;i++){
			sum +=arrays[i];
		}
		ave=(double)sum/(double)arrays.length;
		return ave;
	}
	
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("give a value as the min:");
		int min = scan.nextInt();
		System.out.println("give a value as the max:");
		int max = scan.nextInt();
		IntArray intarray= new IntArray(min,max);
		intarray.arrays[0]=min; intarray.arrays[max-min]=max;
		double aver = intarray.ave();
		for(int a : intarray.arrays){
			System.out.println(a);
		}
		System.out.println("average"+aver);
		}
		
}
