package designpatterns.abstractfactory;

public class SqlFactory extends DbFactory {

	@Override
	public Connection CreateConnection() {
		return new SqlConnection();
	}

	@Override
	public Command CreateCommand() {
		return new SqlCommand();
	}

	@Override
	public Transaction CreateTransaction() {
		return new SqlTransaction();
	}

}
