package chapter1;
  
public class Integral2Float {
	public static void main(String[] args) {
		int intPos = 987654321; //�ܴ��int����
		int intNeg = -987654321; //��С��int����
		long longPos = 1234567890123456789L; //�ܴ��long����
		long longNeg = -1234567890123456789L; //��С��long����
		float fPos = intPos;
		float fNeg = intNeg;
		double dPos = intPos;
		double dNeg = intNeg;
		System.out.println("�ܴ��int����ֵ��" + intPos);
		System.out.println("ת��Ϊfloat��ֵΪ��" + fPos);
		System.out.println("ת��Ϊdouble��ֵΪ��" + dPos);
		System.out.println("��С��int����ֵ��" + intNeg);
		System.out.println("ת��Ϊfloat��ֵΪ��" + fNeg);
		System.out.println("ת��Ϊdouble��ֵΪ��" + dNeg);
		fPos = longPos;
		fNeg = longNeg;
		dPos = longPos;
		dNeg = longNeg;
		System.out.println("�ܴ��long����ֵ��" + longPos);
		System.out.println("ת��Ϊfloat��ֵΪ��" + fPos);
    	System.out.println("ת��Ϊdouble��ֵΪ��" + dPos);
    	System.out.println("��С��long����ֵ��" + longNeg);
    	System.out.println("ת��Ϊfloat��ֵΪ��" + fNeg);
    	System.out.println("ת��Ϊdouble��ֵΪ��" + dNeg);
   }
}
