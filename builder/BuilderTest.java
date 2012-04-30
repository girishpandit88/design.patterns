package designpatterns.builder;

public class BuilderTest {
	public static void main(String args[]) {
		BudgetTour bt = new BudgetTour();
		TourAgent agent1 = new TourAgent(bt);
		agent1.BuildTour();

		LuxuryTour lt = new LuxuryTour();
		TourAgent agent2 = new TourAgent(lt);
		agent2.BuildTour();

	}
}
