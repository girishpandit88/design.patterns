package designpatterns.iterator;

public class Waitress {
	PanCakeHouseMenu pancakemenu;
	DinnerMenu dinnermenu;

	public Waitress(PanCakeHouseMenu panCakeHouseMenu, DinnerMenu dinnerMenu) {
		this.pancakemenu = panCakeHouseMenu;
		this.dinnermenu = dinnerMenu;
	}

	public void printMenu() {
		BFIterator pancakeIterator = pancakemenu.createIterator();
		BFIterator dinnermenuIterator = dinnermenu.createIterator();
		System.out.println("MENU\n-------\nBREAKFAST");
		printMenu(pancakeIterator);
		System.out.println("MENU\n-------\nLUNCH");
		printMenu(dinnermenuIterator);
	}

	public void printMenu(BFIterator iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItems = (MenuItem) iterator.next();
			System.out.println(menuItems.getName() + ", ");
			System.out.println(menuItems.getDescription() + ", ");
			System.out.println(menuItems.getClass() + "$");
		}
	}
}
