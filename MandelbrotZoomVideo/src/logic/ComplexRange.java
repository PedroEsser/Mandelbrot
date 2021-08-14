package logic;

import gradient.LinearGradient;
import gradient.NumericGradient;
import gradient.Gradient;

public class ComplexRange implements Gradient<Complex>{

	private final NumericGradient re, im;
	
	public ComplexRange(NumericGradient re, NumericGradient im) {
		this.re = re;
		this.im = im;
	}

	public ComplexRange(Complex start, Complex end) {
		this.re = new LinearGradient(start.getRe(), end.getRe());
		this.im = new LinearGradient(start.getIm(), end.getIm());
	}


	@Override
	public Complex valueAt(double percent) {
		return new Complex(re.valueAt(percent), im.valueAt(percent));
	}
	
	

}
