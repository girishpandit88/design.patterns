package designpatterns.builder;

public abstract class TourBuilder {
	public abstract void BookHotel();

	public abstract void BookRestaurant();

	public abstract void BookTickets();

	public void BookExtras() {
	}
}
