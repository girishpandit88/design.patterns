package designpatterns.builder;

public class LuxuryTour extends TourBuilder {

	@Override
	public void BookHotel() {
		System.out.println("LuxuryTour Hotel Booking");

	}

	@Override
	public void BookRestaurant() {
		System.out.println("LuxuryTour Restaurant Booking");
	}

	@Override
	public void BookTickets() {
		System.out.println("LuxuryTour Tickets Booking");

	}

	public void BookExtras() {
		System.out.println("LuxuryTour Casino Booking");
	}

}
