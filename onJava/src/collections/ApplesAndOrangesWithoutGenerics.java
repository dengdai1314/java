package collections;

import java.util.ArrayList;

import org.omg.CORBA.PRIVATE_MEMBER;

class Apple {
	private static long counter;
	private final long id = counter++;
	public long id() {
		return id;
	}
}
class Orange{}
public class ApplesAndOrangesWithoutGenerics {
	public static void main(String[] args) {
		ArrayList applesArrayList = new ArrayList();
		for(int i=0;i<3;i++){
			applesArrayList.add(new Apple());
		}
		applesArrayList.add(new Orange());
		for(Object a:applesArrayList) {
			((Apple) a).id();
		}
	}
}
