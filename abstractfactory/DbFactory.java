package designpatterns.abstractfactory;

public abstract class DbFactory {
	public abstract Connection CreateConnection();

	public abstract Command CreateCommand();

	public abstract Transaction CreateTransaction();
}
