package designpatterns.iterator;

import java.util.ArrayList;

public class PanCakeHouseMenuIterator implements BFIterator {

	ArrayList menuItems;
	int position = 0;

	public PanCakeHouseMenuIterator(ArrayList menuItems) {
		this.menuItems = menuItems;
	}

	@Override
	public boolean hasNext() {
		if (position >= menuItems.size() || menuItems.get(position) == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public Object next() {
		Object menuItem = menuItems.get(position);
		position++;
		return menuItem;
	}

}
