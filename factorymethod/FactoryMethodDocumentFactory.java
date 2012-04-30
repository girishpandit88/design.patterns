package designpatterns.factorymethod;

public abstract class FactoryMethodDocumentFactory {
	public abstract FactoryMethodDocument create();

	FactoryMethodDocument createDocument() {
		FactoryMethodDocument d = create();
		return d;
	}
}
