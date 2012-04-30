package designpatterns.iterator;

public class DinnerMenuIterator implements BFIterator {

	MenuItem[] menu;
	int position = 0;

	public DinnerMenuIterator(MenuItem[] items) {
		this.menu = items;
	}

	@Override
	public boolean hasNext() {
		if (position >= menu.length || menu[position] == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public Object next() {
		MenuItem menuItem = menu[position];
		position++;
		return menuItem;
	}

}
