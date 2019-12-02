package interfaceprocessor;

import java.util.Arrays;

/**
 * @author �޻��
 *
 * @package interface\interfaceprocessor\StringProcessor.java
 */
interface StringProcessor extends Processor{
	String process(Object input);
    String s = "If she weighs the same as a duck, she's made of wood"; // [2]
    
    public static void main(String[] args) {
    	Applicator.apply(new Upcase(), s);
    	Applicator.apply(new Downcase(), s);
    	Applicator.apply(new Splitter(), s);
	}
}

class Upcase implements StringProcessor{
	@Override
	public String process(Object input) {
		// TODO �Զ����ɵķ������
		return ((String) input).toUpperCase();
	}
}
class Downcase implements StringProcessor{
	@Override
	public String process(Object input) {
		// TODO �Զ����ɵķ������
		return ((String) input).toLowerCase();
	}
}
class Splitter implements StringProcessor{
	@Override
	public String process(Object input) {
		// TODO �Զ����ɵķ������
		return Arrays.toString(((String) input).split(" "));
	}
}