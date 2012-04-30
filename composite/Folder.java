package designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends File {
	public Folder(String name, String attributes, String encryption) {
		super(name, attributes);
		this.encryption = encryption;
	}

	private List<File> files = new ArrayList<File>();
	private String encryption;

	@Override
	public void displayInfo() {
		System.out.println("Name: " + name);
		System.out.println("Attributes: " + attributes);
		System.out.println("Encryption: " + encryption);
		for (File file : files) {
			file.displayInfo();
		}
	}

	public void addFile(File file) {
		if (file.equals(this))
			System.out.println("Source " + file.name + " and destination " + this.name
					+ " same, please check and try again!!!");
		else
			files.add(file);
	}

	public void removeFile(File file) {
		files.remove(file);
	}

}
