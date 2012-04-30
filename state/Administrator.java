package designpatterns.state;

public class Administrator extends User {
	@Override
	public void view() {
		System.out.println("Admin viewing data");
	}

	@Override
	public void write() {
		System.out.println("Admin writing data");
	}
}
