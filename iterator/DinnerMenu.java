package designpatterns.iterator;

public class DinnerMenu {
	static final int MAX_ITEMS = 6;
	int numberofItems = 0;
	MenuItem[] menuItems;

	public DinnerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];

		addItem("Veg BLT", "{Fakin} Bacon with lettuce and tomatoes on whole wheat", true, 2.99);
		addItem("BLT", "Bacon with lettuce and tomatoes on whole wheat", false, 2.99);
		addItem("HotDog", "A hotdog with onion, tomatoes, topped with cheese", false, 3.05);
	}

	public void addItem(String name, String description, boolean veg, double price) {
		MenuItem menuItem = new MenuItem(name, description, veg, price);
		if (numberofItems >= MAX_ITEMS) {
			System.err.println("Sorry, menu is full! Can't add item to menu");
		} else {
			menuItems[numberofItems] = menuItem;
			numberofItems++;
		}
	}

	public BFIterator createIterator() {
		return new DinnerMenuIterator(menuItems);
	}
}
