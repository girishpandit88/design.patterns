package designpatterns.abstractfactory;

public class AbstractFactoryTest {
	public static void main(String args[]) {
		System.out.println("Creating object using SqlFactory");
		transact(new SqlFactory());
		System.out.println("Creating object using OracleFactory");
		transact(new OracleFactory());
	}

	private static void transact(DbFactory factory) {
		Connection conn = factory.CreateConnection();
		conn.Connect();
		Command cmd = factory.CreateCommand();
		cmd.Execute();
		ResultSet1 rs = cmd.Execute();
		rs.HasNext();
		Transaction tr = factory.CreateTransaction();
		tr.Transac();
	}
}
