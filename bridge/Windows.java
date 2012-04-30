package designpatterns.bridge;

public class Windows extends Platform {

	@Override
	public void draw() {
		System.out.println("Drawing image on Windows platform");
	}

}
