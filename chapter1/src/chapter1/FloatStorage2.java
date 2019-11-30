package chapter1;

import java.math.BigDecimal;

public class FloatStorage2 {
	public static void main(String[] args) {
		int limit = 9999;
		int length = String.valueOf(limit).length();//获取字符长度 = 4
		System.err.println("length=="+length);
		for(int i=1; i<=limit; i++) {
			int num0 = length - String.valueOf(i).length();
			StringBuilder value = new StringBuilder("0.");
			for (int j = 0; j < num0; j++) {
				value.append("0");
			}
			value.append(i);
			BigDecimal dBigDecimal = new BigDecimal(Double.parseDouble(value.toString()));
			if(dBigDecimal.scale()<=length) {
				System.err.println(dBigDecimal);
			}
		}
	}
}
