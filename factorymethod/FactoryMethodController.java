package designpatterns.factorymethod;

public class FactoryMethodController {
	FactoryMethodDocument document;
	FactoryMethodDocumentFactory factory;

	public void init() {
		document = factory.createDocument();
		document.open();
	}

	public void setFactory(FactoryMethodDocumentFactory factory) {
		this.factory = factory;
		System.out.println(this.factory.getClass());
	}
}
