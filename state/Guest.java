package designpatterns.state;

public class Guest extends User {

	@Override
	public void view() {
		System.out.println("Guest cannot view data");

	}

	@Override
	public void write() {
		System.out.println("Guest cannot write data");
	}

}
