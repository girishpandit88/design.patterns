package designpatterns.facade;

public class HighPassFlanger extends Flanger {

	@Override
	public void setValue() {
		System.out.println("HighPassFlanger");
	}
}
