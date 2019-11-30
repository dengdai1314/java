import java.util.jar.Attributes.Name;

import javax.naming.spi.DirStateFactory.Result;

public class Student {
	public String name = null;
	
	public Student (String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
//	public int calcADD(int a,int b) {
//		return  a+b;
//	}
	
//	public int useCalculatour(int a,int b) {
//		return new Calculator().add(a, b);
//	}
//	
//	public void fillBlank(int a,int b) {
//		int result = useCalculatour(a, b);
//		System.out.println(name+"使用计算器"+a+"+"+b+"="+result);
//	}
	
//	public void callHelp(int a,int b) {
//		new SuperCalculator().add(a, b, this);
//	}
//	
//	public void fillBlank(int a,int b,int result) {
//		System.out.println(name + "求助小红计算:" + a + " + " + b + " = " + result);
//	}

	public class doHomeWork implements doJob{
		@Override
		public void fillBack(int a, int b, int result) {
			// TODO Auto-generated method stub
			System.out.println(name + "求助小红计算:" + a + " + " + b + " = " + result);
		}
	}
	
	public void callHelp(int a, int b) {
		new SuperCalculator().add(a, b, new doHomeWork());
	}
}
