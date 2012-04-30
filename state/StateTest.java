package designpatterns.state;

public class StateTest {
	static DbTable table = new DbTable();

	public static void main(String args[]) {
		UseTable(new Administrator());
		UseTable(new Guest());
		UseTable(new Programmer());
	}

	private static void UseTable(User user) {
		table.setUser(user);
		table.displayState();
		table.write();
		table.view();
	}
}
