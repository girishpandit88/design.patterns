package designpatterns.singleton;

public class Singleton {
	private static Singleton instance;

	private Singleton() {
		System.out.println("Singleton(): Initializing Instance");
	}

	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					System.out.println("getInstance(): First time getInstance was invoked!");
					instance = new Singleton();
				}
			}
		}

		return instance;
	}

	public void doSomething() {
		System.out.println("doSomething(): Singleton does something!");
	}
}