package designpatterns.abstractfactory;

public class OracleFactory extends DbFactory {

	@Override
	public Connection CreateConnection() {
		return new OracleConnection();
	}

	@Override
	public Command CreateCommand() {
		// TODO Auto-generated method stub
		return new OracleCommand();
	}

	@Override
	public Transaction CreateTransaction() {
		// TODO Auto-generated method stub
		return new OracleTransaction();
	}

}
