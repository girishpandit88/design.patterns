package designpatterns.composite;

public class Pdf extends File {

	String version;

	public Pdf(String name, String attributes, String version) {
		super(name, attributes);
		this.version = version;
	}

	@Override
	public void displayInfo() {
		System.out.println("Name: " + name);
		System.out.println("Attributes: " + attributes);
		System.out.println("Version: " + version);
	}

}
