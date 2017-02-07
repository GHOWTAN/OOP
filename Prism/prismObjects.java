package prism;

import java.util.Scanner;

public class prismObjects {
	public void process(){
		Scanner sc = new Scanner(System.in);
		System.out.println("how many rectangular prism?");
		int number = sc.nextInt();
		Prism[] objects = new Prism[number];
		
		for(int i = 0;i<number;i++){
			sc.nextLine();
			objects[i]=new Prism();
			System.out.print("Name of rectangular prism: ");
			objects[i].setPrismObjects(sc.nextLine());
			System.out.print("Whats height?");
			objects[i].setHeight(sc.nextDouble());
			System.out.print("Whats width?");
			objects[i].setWidth(sc.nextDouble());
			System.out.print("Whats depth?");
			objects[i].setDepth(sc.nextDouble());
		}
		System.out.println("Result: ");
		for(int i = 0;i<number;i++){
			System.out.println(objects[i].getPrismObjects() +" "+ objects[i].volume());
		}
	}
	
	
	
	
	public static void main(String[] args) {
		prismObjects program = new prismObjects();
		program.process();
		
	}

}























//	Prism p = new Prism();
//	p.prismObjects="prism1";
//	p.height = 2.1;
//	p.width = 2.1;
//	p.depth = 2.1;
//	System.out.println("height " + p.height);
//	System.out.println("width " + p.width);
//	System.out.println("depth " + p.depth);
//	System.out.println(p.prismObjects + " volumn " + p.volume());
//	p.prismObjects="prism2";
//	p.height = 2.5;
//	p.width = 2.5;
//	p.depth = 2.5;
//	System.out.println("height " + p.height);
//	System.out.println("width " + p.width);
//	System.out.println("depth " + p.depth);
//	System.out.println(p.prismObjects + " volumn " + p.volume());