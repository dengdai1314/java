package interfaceprocessor;
import filters.BandPass;
import filters.Filter;
import filters.HighPass;
import filters.LowPass;
import filters.Waveform;
import interfaces.filters.*;

/**
 * @author 罗火金
 *
 * @package interface\interfaceprocessor\FilterProcessor.java
 */


 class FilterAdapter implements Processor{
	 Filter filter;
	 
	public FilterAdapter(Filter filter) {
		// TODO 自动生成的构造函数存根
		this.filter = filter;
	}
	
	public String name() {
		return filter.name();
	}
	
	@Override
	public Waveform process(Object input) {
		// TODO 自动生成的方法存根
		return filter.process((Waveform) input);
	}
 }
 
 class FilterProcessor  {
	public static void main(String[] args) {
		Waveform w = new Waveform();
		Applicator.apply(new FilterAdapter(new LowPass(1.0)), w);
        Applicator.apply(new FilterAdapter(new HighPass(2.0)), w);
        Applicator.apply(new FilterAdapter(new BandPass(3.0, 4.0)), w);
	}
}
 