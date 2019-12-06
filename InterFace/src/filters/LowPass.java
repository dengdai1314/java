package filters;

/**
 * @author �޻��
 *
 * @package interface\filters\LowPass.java
 */
public class LowPass extends Filter {
    double cutoff;

    public LowPass(double cutoff) {
        this.cutoff = cutoff;
    }

    @Override
    public Waveform process(Waveform input) {
        return input; // Dummy processing �ƴ���
    }
}