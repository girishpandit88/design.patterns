package designpatterns.abstractfactory;

public class SqlCommand extends Command {

	@Override
	public ResultSet1 Execute() {
		System.out.println("SQLCommand.Execute()");
		return new SqlResultSet();
	}

}
