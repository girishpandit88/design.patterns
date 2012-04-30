package designpatterns.bridge;

public class Mac extends Platform {

	@Override
	public void draw() {
		System.out.println("Drawing image on Mac platform");
	}
}
