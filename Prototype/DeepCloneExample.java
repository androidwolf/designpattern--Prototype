package Prototype;

class Geometry implements Cloneable {
	int height;
	Rectangle rectangle;

	public Geometry(int height, Rectangle rectangle) {
		this.height = height;
		this.rectangle = rectangle;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Geometry object = (Geometry) super.clone();
		object.rectangle = (Rectangle) rectangle.clone();
		return object;
	}

}

class Rectangle implements Cloneable {
	double m, n;

	public Rectangle(double m, double n) {
		this.m = m;
		this.n = n;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class DeepCloneExample {
	public static void main(String[] args) {
		Geometry geometry = new Geometry(100, new Rectangle(10, 20));
		try {
			Geometry geometryCopy = (Geometry) geometry.clone();
			System.out.println("geometry对象中的rectangle矩形的长和宽：");
			System.out.println(geometry.rectangle.m + "," + geometry.rectangle.n);
			System.out.println("geometryCopy对象中的rectangle矩形的长和宽：");
			System.out.println(geometryCopy.rectangle.m + "," + geometryCopy.rectangle.n);
			System.out.println("geometry对象修改其中的rectangle矩形的长和宽：");
			geometry.rectangle.m = 100;
			geometry.rectangle.n = 200;
			System.out.println("geometry对象中的rectangle矩形的长和宽：");
			System.out.println(geometry.rectangle.m + "," + geometry.rectangle.n);
			System.out.println("geometryCopy对象中的rectangle矩形的长和宽：");
			System.out.println(geometryCopy.rectangle.m + "," + geometryCopy.rectangle.n);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
