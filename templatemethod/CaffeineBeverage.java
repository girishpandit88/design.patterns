package designpatterns.templatemethod;

public abstract class CaffeineBeverage {
	final void prepareRecipe() {
		boilWater();
		brew();
		pourinCup();
		addCondiments();
	}

	abstract void addCondiments();

	private void pourinCup() {
		System.out.println("Pouring in cup...");
	}

	abstract void brew();

	private void boilWater() {
		System.out.println("Boiling water...");
	}
}
