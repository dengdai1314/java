package collections;

import java.util.ArrayList;

public class ApplesAndOrangesWithGenerics {
	public static void main(String[] args) {
		ArrayList<Apple> apples = new ArrayList<Apple>();
		for (int i=1;i<3;i++) {
			apples.add(new Apple());
		}
		for (Apple apple : apples) {
			System.out.println("test"+apple.id());
		}
	}
}
