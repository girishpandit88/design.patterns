package designpatterns.factorymethod;

public class FactoryMethodTest {
	public static void main(String[] args) {
		FactoryMethodController controller = new FactoryMethodController();
		controller.setFactory(new FactoryMethodTextDocumentFactory());
		controller.setFactory(new FactoryMethodSpreadSheetDocumentFactory());
	}
}
