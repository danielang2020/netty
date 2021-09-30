package io.netty.example.my;

import java.util.ArrayList;

/**
 *
 * @program: netty
 * @author: daniel
 * @create: 2021-09-14 09:52
 **/
public class MemLeakDemo {
	public static void main(String[] args) {
		ArrayList<Fruit> fruits = new ArrayList<>();
		Fruit fruit = new Fruit();
		fruit.setName("apple");
		fruits.add(fruit);
		fruit = null;
		fruits.remove(0);
		System.out.println(fruits.get(0).getName());
	}
}

class Fruit{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

