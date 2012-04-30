package designpatterns.iterator;

public class IteratorTest {
	public static void main(String args[]) {
		PanCakeHouseMenu pm = new PanCakeHouseMenu();
		DinnerMenu dm = new DinnerMenu();
		Waitress waitress = new Waitress(pm, dm);
		waitress.printMenu();
	}
}
