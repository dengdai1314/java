package filters;

/**
 * @author 罗火金
 *
 * @package interface\filters\Waveform.java
 */
public class Waveform {
	private static long counter;
	private final long id = counter++;
	
	@Override
	public String toString() {
		// TODO 自动生成的方法存根
		return "Waveform "+id;
	}
}

