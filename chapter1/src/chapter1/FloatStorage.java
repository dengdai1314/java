package chapter1;

import java.math.BigDecimal;

public class FloatStorage {
	public static void main(String[] args) {
		System.out.println("使用BigDecimal 存储的浮点类型值");
		for(int i=1;i<=9;i++) {
			double d = Double.parseDouble("0."+i);
			System.out.println(d);
			BigDecimal BD = new BigDecimal(d);
			System.out.println(BD);
		}
	}
}
