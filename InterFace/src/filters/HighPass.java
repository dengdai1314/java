package filters;

/**
 * @author �޻��
 *
 * @package interface\filters\HighPass.java
 */

public class HighPass extends Filter{
	double cutoff;
	
	public HighPass(double cutoff) {
		this.cutoff = cutoff;
	}
	
	@Override
	public Waveform process(Waveform input) {
		// TODO �Զ����ɵķ������
		return input;
	}
}

