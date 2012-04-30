package designpatterns.adapter;

public class WMAPlugin extends Plugin {

	@Override
	public void decode() {
		System.out.println("WMAPlugin Decode");
	}

}
