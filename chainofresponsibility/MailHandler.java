package designpatterns.chainofresponsibility;

public abstract class MailHandler {
	protected MailHandler nextHandler;

	public MailHandler(MailHandler handler) {
		nextHandler = handler;
	}

	public abstract void handle();
}
