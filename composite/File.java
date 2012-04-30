package designpatterns.composite;

public abstract class File {
	protected String name;
	protected String attributes;

	public File(String name, String attributes) {
		this.name = name;
		this.attributes = attributes;
	}

	public abstract void displayInfo();

}
