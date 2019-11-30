// polymorphism/Frog.java
// Cleanup and inheritance
// {java polymorphism.Frog}
package polymorphism;

class Characteristic{
	private String s;
	
	Characteristic(String s) {
		// TODO Auto-generated constructor stub
		System.out.println("Creating Characteristic " + s);
	}
	
	protected void dispose() {
		System.out.println("disposing Characteristic " + s);
	}
}

class Description{
	private String s;
	
	Description(String s){
		this.s = s;
		System.out.println("Creating Description " + s);
	}
	
	protected void dispose() {
		System.out.println("disposing Description " + s);
	}
}

class LivingCreature{
	private Characteristic p = new Characteristic("is alive");
	private Description t = new  Description("Basic Living Creature");
	
	public LivingCreature() {
		// TODO Auto-generated constructor stub
		System.out.println("LivingCreature dispose");
	}
	
	protected void dispose() {
		System.out.println("LivingCreature dispose");
		t.dispose();
		p.dispose();
	}
}

class Animal extends LivingCreature{
	private Characteristic p = new Characteristic("has heart");
	private Description t =  new Description("Animal not Vegetable");
	
	public Animal() {
		// TODO Auto-generated constructor stub
		System.out.println("Animal()");
	}
	
	@Override
	protected void dispose() {
		// TODO Auto-generated method stub
		System.out.println("Animal dispose");
		t.dispose();
		p.dispose();
		super.dispose();
	}
}

class Amphibian extends Animal{
	private Characteristic p = new Characteristic("can live in water");
	private Description t = new Description("Both water and land");
	
	public Amphibian() {
		// TODO Auto-generated constructor stub
		System.out.println("Amphibian");
	}
	
	@Override
	protected void dispose() {
		// TODO Auto-generated method stub
		System.out.println("Amphibian dispose");
		t.dispose();
		p.dispose();
		super.dispose();
	}
}

public class Frog extends Amphibian{
	private Characteristic p = new Characteristic("Croaks");
	private Description t = new Description("Eats bugs");
	
	public Frog() {
		System.out.println("Frog()");
	}
	
	@Override
	protected void dispose() {
		// TODO Auto-generated method stub
		System.out.println("Frog dispose");
		t.dispose();
		p.dispose();
		super.dispose();
	}
	
	public static void main(String[] args) {
		Frog frog = new Frog();
		System.out.println("Bye!");
		frog.dispose();
	}

}
