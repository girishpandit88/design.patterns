package designpatterns.flyweight;

public class Character {
	private int size;
	private Position position;
	private char ch;
	private String font;
	private static int count = 0;

	public Character(String font, char ch, int size, Position position2) {
		this.font = font;
		this.ch = ch;
		this.size = size;
		this.position = position2;
		++count;
	}

	public int getSize() {
		return size;
	}

	public Position getPosition() {
		return position;
	}

	public char getCh() {
		return ch;
	}

	public String getFont() {
		return font;
	}

	public static int getCount() {
		return count;
	}

}
