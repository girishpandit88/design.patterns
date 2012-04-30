package designpatterns.bridge;

public class Jpeg extends Image {

	@Override
	public void init() {
		System.out.println("Initializing .jpg image");
		platform.draw();
	}

}
