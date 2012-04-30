package designpatterns.state;

public class DbTable {
	User user;

	public void setUser(User user) {
		this.user = user;
	}

	public void displayState() {
		System.out.println("Current user is: " + user.toString());
	}

	public void view() {
		user.view();
	}

	public void write() {
		user.write();
	}

}
