package designpatterns.adapter;

public class AACAdapter extends Plugin {
	private AACDecoder decoder = new AACDecoder();

	@Override
	public void decode() {
		System.out.println("AACAdapter");
		decoder.decodeStream();
	}

}
