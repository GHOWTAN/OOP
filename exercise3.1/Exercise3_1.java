package exercise3_1;

public class Exercise3_1 {
	private int leftX;
	private int leftY;
	private int rightX;
	private int rightY;
	
	public Exercise3_1(){
		this.leftX=0;
		this.leftY=0;
		this.rightX=1;
		this.rightY=1;
	}
	public Exercise3_1(int rightX, int rightY){
		this.leftX=0;
		this.leftY=0;
		this.rightX=rightX;
		this.rightY=rightY;
	}
	public Exercise3_1(int leftX, int leftY, int rightX, int rightY){
		this.leftX=leftX;
		this.leftY=leftY;
		this.rightX=rightX;
		this.rightY=rightY;
	}
	
	public int getLeftX() {
		return leftX;
	}
	public void setLeftX(int leftX) {
		this.leftX = leftX;
	}
	public int getLeftY() {
		return leftY;
	}
	public void setLeftY(int leftY) {
		this.leftY = leftY;
	}
	public int getRightX() {
		return rightX;
	}
	public void setRightX(int rightX) {
		this.rightX = rightX;
	}
	public int getRightY() {
		return rightY;
	}
	public void setRightY(int rightY) {
		this.rightY = rightY;
	}
	
	public int width(){
		return Math.abs(rightX-leftX);
	}
	public int height(){
		return Math.abs(rightY-leftY);
	}
	public int area(){
		return height()*width();
	}
}
