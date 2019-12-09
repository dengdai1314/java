package chapter1;
  
public class Integral2Float {
	public static void main(String[] args) {
		int intPos = 987654321; //很大的int正数
		int intNeg = -987654321; //很小的int负数
		long longPos = 1234567890123456789L; //很大的long正数
		long longNeg = -1234567890123456789L; //很小的long负数
		float fPos = intPos;
		float fNeg = intNeg;
		double dPos = intPos;
		double dNeg = intNeg;
		System.out.println("很大的int正数值：" + intPos);
		System.out.println("转换为float后值为：" + fPos);
		System.out.println("转换为double后值为：" + dPos);
		System.out.println("很小的int负数值：" + intNeg);
		System.out.println("转换为float后值为：" + fNeg);
		System.out.println("转换为double后值为：" + dNeg);
		fPos = longPos;
		fNeg = longNeg;
		dPos = longPos;
		dNeg = longNeg;
		System.out.println("很大的long正数值：" + longPos);
		System.out.println("转换为float后值为：" + fPos);
    	System.out.println("转换为double后值为：" + dPos);
    	System.out.println("很小的long负数值：" + longNeg);
    	System.out.println("转换为float后值为：" + fNeg);
    	System.out.println("转换为double后值为：" + dNeg);
   }
}
