import java.util.*;



/**
 * @author �޻��
 *
 * @package interface\\Applicator.java
 */
class Processor{
	public String name() {
		return getClass().getSimpleName();//��ȡ����
	}
	public Object process(Object input) {
		return input;
	}
}

class Upcase extends Processor{
	@Override
	public Object process(Object input) {
		// TODO �Զ����ɵķ������
		return ((String) input).toUpperCase();
	}
}

class Downcase extends Processor{
	@Override
	public Object process(Object input) {
		// TODO �Զ����ɵķ������
		return ((String)input).toLowerCase();
	}
}

class Splitter extends Processor{
	@Override
	public Object process(Object input) {
		// TODO �Զ����ɵķ������
		return Arrays.toString(((String)input).split(" "));
	}
}
public class Applicator {
	public static void apply(Processor p,Object s) {
		System.out.println("Using Processor"+p.name());
		System.out.println(p.process(s));
	}
	
	public static void main(String[] args) {
		String s = "This is test";
		apply(new Upcase(), s);
		apply(new Downcase(), s);
		apply(new Splitter(), s);
	}

}
