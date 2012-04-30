package designpatterns.abstractfactory;

public class OracleCommand extends Command {

	@Override
	public ResultSet1 Execute() {
		System.out.println("OracleCommand.Execute()");
		return new OracleResultSet();
	}

}
