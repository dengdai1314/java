
public class Test {
	public static void main(String[] args) {
		int a = 19852;
		int b = 19255;
		int c = 123;
		int d = 789;
		Student student = new Student("С��");
		Seller seller = new Seller("������");
//		student.fillBlank(a, b);
		student.callHelp(a, b);
		seller.callHelp(c, d);
	}
}
