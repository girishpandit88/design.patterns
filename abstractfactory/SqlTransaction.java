package designpatterns.abstractfactory;

public class SqlTransaction extends Transaction {

	@Override
	public void Transac() {
		System.out.println("SqlTransaction.Transac()");
	}

}
