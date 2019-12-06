package filters;

/**
 * @author �޻��
 *
 * @package interface\filters\Filter.java
 */
public class Filter {
	public String name() {
		return getClass().getSimpleName();
	}
	public Waveform process(Waveform input) {
		return input;
	}

}
