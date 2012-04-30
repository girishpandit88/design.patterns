package designpatterns.facade;

public class LowPassFlanger extends Flanger {

	@Override
	public void setValue() {
		System.out.println("LowPassFlanger");
	}

}
