package designpatterns.abstractfactory;

public class SqlConnection extends Connection {

	@Override
	public void Connect() {
		System.out.println("SqlConnection.Connect()");
	}

}
