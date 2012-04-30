package designpatterns.bridge;

public class BridgeTest {
	public static void main(String args[]) {
		Platform p = new Windows();
		Image img = new Jpeg();
		img.setPlatForm(p);
		img.init();
		p = new Mac();
		img = new Bmp();
		img.setPlatForm(p);
		img.init();
	}
}
