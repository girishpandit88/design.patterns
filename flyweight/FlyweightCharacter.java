package designpatterns.flyweight;

public class FlyweightCharacter {
	private static int count = 0;
	private String font;
	private int size;
	private char ch;

	public FlyweightCharacter(String font, int size, char ch) {
		this.font = font;
		this.size = size;
		this.ch = ch;
		++count;
	}

	public static int getCount() {
		return count;
	}

}
