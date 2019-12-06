
import onjava.Operations;

class Bing implements Operations{
	@Override
	public void execute() {
		// TODO 自动生成的方法存根
		Operations.show("Operations.show('Bing')");
	}
}

class Crack implements Operations{
	@Override
	public void execute() {
		// TODO 自动生成的方法存根
		Operations.show("Operations.show(`Crack`)");
	}
}

class Twist implements Operations{
	@Override
	public void execute() {
		// TODO 自动生成的方法存根
		Operations.show("Operation.show(`Twist`)");
	}
}

public class Machine {
	public static void main(String[] args) {
		Operations.runOps(new Bing(),new Crack(),new Twist());
	}

}
