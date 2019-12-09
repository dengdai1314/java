// polymorphism/Sandwich.java
// Order of constructor calls
// {java polymorphism.Sandwich}
package polymorphism;

class Meal {
	Meal(){
		System.out.println("meal");
	}
}

class Bread {
	Bread(){
		System.out.println("bread");
	}
}

class Chess {
	Chess(){
		System.out.println("chess");
	}
}

class Lettuce {
	Lettuce(){
		System.out.println("lettuce");
	}
}

class Lunch extends Meal{
	Lunch(){
		System.out.println("lunch");
	}	
}

class PortableLunch extends Lunch{
	PortableLunch(){
		System.out.println("portableLunch");
	}
}

public class Sandwich extends PortableLunch{
	private Bread bread = new Bread();
	private Chess chess = new Chess();
	private Lettuce lettuce = new Lettuce();
	
	public Sandwich() {
		// TODO Auto-generated constructor stub
		System.out.println("SANDWICH");
	}
	public static void main(String[] args) {
		new Sandwich();
	}
	
}
