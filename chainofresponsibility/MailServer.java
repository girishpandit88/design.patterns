package designpatterns.chainofresponsibility;

public class MailServer {
	MailHandler handler;

	public void setHandler(MailHandler handler) {
		this.handler = handler;
	}

	public void processMails() {
		handler.handle();
	}
}
