package designpatterns.factorymethod;

public class FactoryMethodSpreadSheetDocument extends FactoryMethodDocument {

	@Override
	public void open() {
		System.out.println("SpreadSheetDocument");
	}
}
