package Prototype;

class Circle implements Cloneable {
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Object clone() throws CloneNotSupportedException {
		Object object = super.clone();
		return object;
	}
}

public class CloneExample {

	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.setRadius(198.99);
		try {
			Circle circleCopy = (Circle) circle.clone();
			System.out.println("circle对象中的数据：" + circle.getRadius());
			System.out.println("circleCopy对象中的数据：" + circleCopy.getRadius());
			circle.setRadius(200);
			System.out.println("circle对象中的数据：" + circle.getRadius());
			System.out.println("circleCopy对象中的数据：" + circleCopy.getRadius());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
