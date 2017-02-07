package prism;

public class Prism {
	private String prismObjects;
	private double height, width, depth;
	



	public void setPrismObjects(String prismObjects) {
		this.prismObjects = prismObjects;
	}

	public String getPrismObjects() {
		return prismObjects;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
	}


	public double getDepth() {
		return depth;
	}


	public void setDepth(double depth) {
		this.depth = depth;
	}


	public double volume(){
		return height*width*depth;
	}
}
