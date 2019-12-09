package chapter1;

public class Float2Integral {
	public static void main(String[] args) {
		double double1 = Double.NaN;
		System.out.println("double1(NaN)=="+double1);
		System.out.println("double->long=="+(long)double1);
		System.out.println("double->int=="+(int)double1);
		
		double1 = 3e30;
		System.out.println("double1(3e30)=="+double1);
		System.out.println("long(3e30)=="+(long)double1);
		System.out.println("int(3e30)=="+(int)double1);
		
		double1 = -8e28;
		System.out.println("double1(-8e28)=="+double1);
		System.out.println("long(-8e28)=="+(long)double1);
		System.out.println("int(-8e28)=="+(int)double1);
		
		double1 = Double.POSITIVE_INFINITY;
		System.out.println("double1(positive)=="+double1);
		System.out.println("(long)Infinity=" + (long)double1);
	    System.out.println("(int)Infinity=" + (int)double1);
	    
	    double1 = Double.NEGATIVE_INFINITY; //负无穷
	    System.out.println("double1(negative)=="+double1);
	    System.out.println("(long)-Infinity=" + (long)double1);
	    System.out.println("(int)-Infinity=" + (int)double1);
	    
	    double1 = -12345678.6; //在int类型的取值范围内
	    System.out.println("double1(-12345678.6)=="+double1);
	    System.out.println("(long)-12345678.6=" + (long)double1);
	    System.out.println("(int)-12345678.6=" + (int)double1);
	    System.out.println("(byte)-12345678.6=" + (byte)double1);
	    System.out.println("(int)(char)-12345678.6=" + (int)(char)double1);
	    System.out.println("(short)-12345678.6=" + (short)double1);
	}
}
