package designpatterns.iterator;

import java.util.ArrayList;

public class PanCakeHouseMenu {
	ArrayList menuItems;

	public PanCakeHouseMenu() {
		menuItems = new ArrayList();
		addItem("Pancake Bread", "Bread made out of Pancakes", true, 1.99);
		addItem("Regular Bacon and Pancake", "Pancake served with hot bacon and cheese", false, 2.49);
		addItem("Blueberry Pancakes", "Pancake dough beat with blueberries", false, 3.05);
	}

	private void addItem(String string, String string2, boolean b, double d) {
		MenuItem menuItem = new MenuItem(string, string2, b, d);
		menuItems.add(menuItem);
	}

	public BFIterator createIterator() {
		return new PanCakeHouseMenuIterator(menuItems);
	}
}
