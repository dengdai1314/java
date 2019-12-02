
/**
 * @author 罗火金
 *
 */
abstract class Uninstantiable{
	abstract void f();
	abstract int g();
}
public class Instantiable extends Uninstantiable{

	@Override
	void f() {
		// TODO 自动生成的方法存根
		
	}

	@Override
	int g() {
		// TODO 自动生成的方法存根
		return 0;
	}
	public static void main(String[] args) {
		Uninstantiable uiUninstantiable = new Instantiable();
	}
	
}
