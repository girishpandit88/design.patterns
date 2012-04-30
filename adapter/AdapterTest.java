package designpatterns.adapter;

public class AdapterTest {
	public static void main(String args[]) {
		AACAdapter adapter = new AACAdapter();
		PlayACC(adapter);
	}

	static void PlayACC(Plugin p) {
		p.decode();
	}

}
