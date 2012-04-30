package designpatterns.factorymethod;

public class FactoryMethodTextDocumentFactory extends FactoryMethodDocumentFactory {

	@Override
	public FactoryMethodDocument create() {
		return new FactoryMethodTextDocument();
	}

}
