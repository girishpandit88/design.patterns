package designpatterns.composite;

public class CompositeTest {
	public static void main(String args[]) {
		Folder folder = new Folder("My Documents", "rw", "BlowFish");
		Pdf s1 = new Pdf("Readme.pdf", "rw", "1.0");
		Pdf s2 = new Pdf("SalesReport.pdf", "rwx", "2.0");
		Pdf s3 = new Pdf("Resume.pdf", "r", "1.0.0.2");
		Folder folder1 = new Folder("Downloads", "rwx", "crash0verdrive");
		folder.addFile(s1);
		folder.addFile(s2);
		folder.addFile(s3);
		folder.addFile(folder1);
		folder.addFile(folder);
		folder.displayInfo();

	}
}
