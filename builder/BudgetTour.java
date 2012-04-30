package designpatterns.builder;

public class BudgetTour extends TourBuilder {

	@Override
	public void BookHotel() {
		System.out.println("BudgetTour Hotel Booking");
	}

	@Override
	public void BookRestaurant() {
		System.out.println("BudgetTour Restaurant Booking");
	}

	@Override
	public void BookTickets() {
		System.out.println("BudgetTour Tickets Booking");

	}

}
