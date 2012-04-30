package designpatterns.templatemethod;

public abstract class CaffeineBeverageWithHook {
	void prepareRecipe() {
		boilWater();
		brew();
		pourinCup();
		if (customerWantsCondiments()) {
			addCondiments();
		}
	}

	private boolean customerWantsCondiments() {
		return true;
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
