package filters;

/**
 * @author �޻��
 *
 * @package interface\filters\BandPass.java
 */
public class BandPass extends Filter {
	double lowCutoff,highCutoff;
	
	public BandPass (double lowcut,double highcut) {
		lowCutoff = lowcut;
		highCutoff = highcut;
	}
	
	@Override
	public Waveform process(Waveform input) {
		// TODO �Զ����ɵķ������
		return input;
	}
}
