package designpatterns.chainofresponsibility;

public class ChainofResponsibilityTest {
	public static void main(String args[]) {
		SpamHandler spam = new SpamHandler(null);
		FanMailHandler fanmail = new FanMailHandler(spam);
		SalesMailHandler sales = new SalesMailHandler(fanmail);
		MailServer ms = new MailServer();
		ms.setHandler(sales);
		ms.processMails();
	}
}
