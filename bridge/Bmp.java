package designpatterns.bridge;

public class Bmp extends Image {

	@Override
	public void init() {
		System.out.println("Initializing .bmp image");
		platform.draw();
	}

}
