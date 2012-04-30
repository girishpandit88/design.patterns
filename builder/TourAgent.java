package designpatterns.builder;

public class TourAgent {
	TourBuilder builder;

	public TourAgent(TourBuilder tb) {
		builder = tb;
	}

	public void BuildTour() {
		builder.BookHotel();
		builder.BookRestaurant();
		builder.BookTickets();
		builder.BookExtras();
	}
}
