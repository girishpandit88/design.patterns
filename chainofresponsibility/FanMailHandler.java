package designpatterns.chainofresponsibility;

public class FanMailHandler extends MailHandler {

	public FanMailHandler(MailHandler handler) {
		super(handler);
	}

	@Override
	public void handle() {
		System.out.println("FanMailHandler handle");
		if (nextHandler == null)
			System.out.println("End of chain");
		else
			nextHandler.handle();
	}

}
