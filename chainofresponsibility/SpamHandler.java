package designpatterns.chainofresponsibility;

public class SpamHandler extends MailHandler {

	public SpamHandler(MailHandler handler) {
		super(handler);
	}

	@Override
	public void handle() {
		System.out.println("SpamHandler handle");
		if (nextHandler == null)
			System.out.println("End of chain");
		else
			nextHandler.handle();
	}

}
