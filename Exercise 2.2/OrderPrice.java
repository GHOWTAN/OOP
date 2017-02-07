package exercise_2_2;

import java.util.Scanner;

public class OrderPrice {

	public void process() {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many products?");
		int number = sc.nextInt();
		Order[] products = new Order[number];
		
		for(int i = 0;i<number;i++){
			sc.nextLine();
			
			products[i]= new Order();
			System.out.print("Name of the product: ");
			products[i].setName(sc.nextLine());
			System.out.print("Whats the price? ");
			products[i].setPrice(sc.nextDouble());
			System.out.print("Whats the quantity? ");
			products[i].setQuantity(sc.nextInt());
		}
		
		System.out.println("Result ");
		for(int i = 0; i< number; i++){
			System.out.println(products[i].getName() + " Order price is : " + products[i].orderPrice());
		}

	}
	public static void main(String[] args) {
		OrderPrice program = new OrderPrice();
		program.process();
	}

}
