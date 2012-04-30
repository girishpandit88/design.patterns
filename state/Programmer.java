package designpatterns.state;

public class Programmer extends User {

	@Override
	public void view() {
		System.out.println("Programmer viewing data");
	}

	@Override
	public void write() {
		System.out.println("Programmer writing data");
	}

}
