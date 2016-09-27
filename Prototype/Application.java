package Prototype;

public class Application {

	public static void main(String[] args) {
		Cubic cubic = new Cubic(12, 20, 66);
		System.out.println("cubic的长、宽、高：");
		System.out.println(cubic.length + "," + cubic.width + ","
				+ cubic.heigth);
		try {
			Cubic cubicCopy = (Cubic) cubic.cloneMe();
			cubicCopy.setHeigth(100);
			System.out.println("cubicCopy的长、宽、高：");
			System.out.println(cubicCopy.length + "," + cubicCopy.width + ","
					+ cubicCopy.heigth);
			System.out.println(cubic.length + "," + cubic.width + ","
					+ cubic.heigth);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		Goat goat = new Goat();
		goat.setColor(new StringBuffer("白颜色的山羊"));
		System.out.println("goat是" + goat.getColor());
		try {
			Goat goatCopy = (Goat) goat.cloneMe();
			System.out.println("goatCopy是" + goatCopy.getColor());
			System.out.println("goatCopy将自己的颜色改变成黑色");
			goatCopy.setColor(new StringBuffer("黑颜色的山羊"));
			System.out.println("goat仍然是" + goat.getColor());
			System.out.println("goatCopy是" + goatCopy.getColor());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
