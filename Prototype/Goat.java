package Prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Goat implements Prototype, Serializable {

	StringBuffer color;
	
	public StringBuffer getColor() {
		return color;
	}

	public void setColor(StringBuffer color) {
		this.color = color;
	}

	@Override
	public Object cloneMe() throws CloneNotSupportedException {
		Object object = null;
		try {
			ByteArrayOutputStream outOne = new ByteArrayOutputStream();
			ObjectOutputStream outTwo = new ObjectOutputStream(outOne);
			outTwo.writeObject(this);    //将原型对象写入对象输出流
			ByteArrayInputStream inOne = new ByteArrayInputStream(outOne.toByteArray());
			ObjectInputStream inTwo = new ObjectInputStream(inOne);
			object = inTwo.readObject();  //创建新的对象，原型的复制品
		} catch (Exception e) {
			e.printStackTrace();
		}
		return object;
	}

}
