package designpatterns.abstractfactory;

public class OracleResultSet extends ResultSet1 {

	@Override
	public void HasNext() {
		System.out.println("OracleResultSet.HasNext()");
	}

}
