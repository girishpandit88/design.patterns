package designpatterns.abstractfactory;

public class OracleConnection extends Connection {

	@Override
	public void Connect() {
		System.out.println("OracleConnection.Connect()");
	}

}
