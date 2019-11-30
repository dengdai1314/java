
public class Seller {
	public String name = null;
	
	public Seller(String name) {
		this.name = name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public class doHomeWork implements doJob{
		@Override
		public void fillBack(int a, int b, int result) {
			// TODO Auto-generated method stub
			System.out.println(name + "«Û÷˙–°∫ÏÀ„’À:" + a + " + " + b + " = " + result + "‘™");
		}
	}
	
	public void callHelp(int a, int b) {
		new SuperCalculator().add(a, b, new doHomeWork());
	}
}
