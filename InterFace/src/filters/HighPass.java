package filters;

/**
 * @author 罗火金
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
		// TODO 自动生成的方法存根
		return input;
	}
}

