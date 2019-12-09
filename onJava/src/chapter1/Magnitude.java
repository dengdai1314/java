package chapter1;

public class Magnitude {
	static Float f1 = 30000F;
	static Float f2 = f1+1;
	static Float f3 = 30000000000F;
	static Float f4 = f3+1;
	public static void main(String[] args) {
		System.out.println("f1="+f1+"f2="+f2);
		if(f1<f2) {
			System.out.println("f1<f2");
		}else {
			System.out.println("f1!<f2");
		}
		System.out.println("f3="+f3+"f4="+f4);
		if(f3<f4) {
			System.out.println("f3<f4");
		}else {
			System.out.println("f3!<f4");
		}
	}

}
