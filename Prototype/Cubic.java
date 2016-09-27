package Prototype;

public class Cubic implements Prototype, Cloneable {

	double length,width,heigth;
	
	public Cubic(double length, double width, double heigth) {
		this.length = length;
		this.width = width;
		this.heigth = heigth;
	}
	
	public void setLength(double length) {
		this.length = length;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}

	@Override
	public Object cloneMe() throws CloneNotSupportedException {
		Object object = (Cubic)clone();        //���ô�Object��̳е�clone����
		return object;
	}

}
