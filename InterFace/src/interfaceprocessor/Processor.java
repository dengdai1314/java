package interfaceprocessor;

/**
 * @author �޻��
 *
 * @package interface\interfaceprocessor\Processor.java
 */
public interface Processor {
	default String name() {
		return getClass().getSimpleName();
	} 
	
	Object process(Object input);
}
