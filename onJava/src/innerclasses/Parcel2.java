package innerclasses;

public class Parcel2 {
	class Contents{
		private int i = 11;
		
		public int value() {return i;}
	}
	
	class Destination{
		private String label;
		
		Destination(String wherTo) {
			// TODO 自动生成的构造函数存根
			label = wherTo;
		}
		
		String readLabel() {return label;}
	}
	
	public Destination to(String s) {
		return new Destination(s);
	}
	
	public Contents contents() {
		return new Contents();
	}
	
	private void ship(String dest) {
		// TODO 自动生成的方法存根
		Contents c = contents();
		Destination d = to(dest);
		System.out.println(d.readLabel());
	}
	
	public static void main(String[] args) {
		Parcel2 p = new Parcel2();
		p.ship("Tasmania");
		Parcel2 q = new Parcel2();
		Parcel2.Contents c = q.contents();
		Parcel2.Destination d = q.to("Borneo");
	}
}
