package filters;

/**
 * @author �޻��
 *
 * @package interface\filters\Waveform.java
 */
public class Waveform {
	private static long counter;
	private final long id = counter++;
	
	@Override
	public String toString() {
		// TODO �Զ����ɵķ������
		return "Waveform "+id;
	}
}

