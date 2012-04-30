package designpatterns.abstractfactory;

public class SqlResultSet extends ResultSet1 {

	@Override
	public void HasNext() {
		System.out.println("SqlResultSet.HasNext()");
	}

}
