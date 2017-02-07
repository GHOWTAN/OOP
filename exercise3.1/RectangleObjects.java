package exercise3_1;

public class RectangleObjects {

	public static void main(String[] args) {
		Exercise3_1 rectangle1 = new Exercise3_1();
		System.out.println("rectangle1 : left corner ("+rectangle1.getLeftX()+","+rectangle1.getLeftY()+"), right corner ("
		+rectangle1.getRightX()+","+rectangle1.getRightY()+"), width is "+rectangle1.width()+", height is "+rectangle1.height()+", area is "+
		rectangle1.area()+".");
		Exercise3_1 rectangle2 = new Exercise3_1(3,3);
		System.out.println("rectangle2 : left corner ("+rectangle2.getLeftX()+","+rectangle2.getLeftY()+"), right corner ("
		+rectangle2.getRightX()+","+rectangle2.getRightY()+"), width is "+rectangle2.width()+", height is "+rectangle2.height()+", area is "+
		rectangle2.area()+".");
		Exercise3_1 rectangle3 = new Exercise3_1(3,3,4,4);
		System.out.println("rectangle3 : left corner ("+rectangle3.getLeftX()+","+rectangle3.getLeftY()+"), right corner ("
		+rectangle3.getRightX()+","+rectangle3.getRightY()+"), width is "+rectangle3.width()+", height is "+rectangle3.height()+", area is "+
		rectangle3.area()+".");
	}

}
