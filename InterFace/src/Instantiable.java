
/**
 * @author �޻��
 *
 */
abstract class Uninstantiable{
	abstract void f();
	abstract int g();
}
public class Instantiable extends Uninstantiable{

	@Override
	void f() {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	int g() {
		// TODO �Զ����ɵķ������
		return 0;
	}
	public static void main(String[] args) {
		Uninstantiable uiUninstantiable = new Instantiable();
	}
	
}
