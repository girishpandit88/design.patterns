package designpatterns.factorymethod;

public class FactoryMethodTextDocument extends FactoryMethodDocument {

	@Override
	public void open() {
		System.out.println("Text Document");
	}

}
