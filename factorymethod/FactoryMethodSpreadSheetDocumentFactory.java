package designpatterns.factorymethod;

public class FactoryMethodSpreadSheetDocumentFactory extends FactoryMethodDocumentFactory {

	@Override
	public FactoryMethodDocument create() {
		return new FactoryMethodSpreadSheetDocument();
	}

}
