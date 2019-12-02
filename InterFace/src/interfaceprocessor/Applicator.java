package interfaceprocessor;

/**
 * @author ÂÞ»ð½ð
 *
 * @package interface\interfaceprocessor\Applicator.java
 */
public class Applicator {
	public static void apply(Processor p,Object s) {
		System.out.println("Useing processor"+p.name());
		System.out.println(p.process(s));
	}
}
