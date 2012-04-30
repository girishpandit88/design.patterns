package designpatterns.facade;

public class TwoPassEqualizer extends Equalizer {

	@Override
	public void setHigh() {
		System.out.println("2passeq set to high");
	}

	@Override
	public void setMid() {
		System.out.println("2passeq set to mid");

	}

	@Override
	public void setLow() {
		System.out.println("2passeq set to low");

	}

}
