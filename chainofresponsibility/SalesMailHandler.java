package designpatterns.chainofresponsibility;

public class SalesMailHandler extends MailHandler {

	public SalesMailHandler(MailHandler handler) {
		super(handler);
	}

	@Override
	public void handle() {
		System.out.println("SalesHandler handle");
		if (nextHandler == null)
			System.out.println("End of chain");
		else
			nextHandler.handle();
	}

}
