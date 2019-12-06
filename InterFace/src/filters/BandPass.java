package filters;

/**
 * @author 罗火金
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
		// TODO 自动生成的方法存根
		return input;
	}
}
