import java.util.*;



/**
 * @author 罗火金
 *
 * @package interface\\Applicator.java
 */
class Processor{
	public String name() {
		return getClass().getSimpleName();//获取类名
	}
	public Object process(Object input) {
		return input;
	}
}

class Upcase extends Processor{
	@Override
	public Object process(Object input) {
		// TODO 自动生成的方法存根
		return ((String) input).toUpperCase();
	}
}

class Downcase extends Processor{
	@Override
	public Object process(Object input) {
		// TODO 自动生成的方法存根
		return ((String)input).toLowerCase();
	}
}

class Splitter extends Processor{
	@Override
	public Object process(Object input) {
		// TODO 自动生成的方法存根
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
