package designpatterns.bridge;

public abstract class Image {

	protected Platform platform;

	public void setPlatForm(Platform platform) {
		this.platform = platform;
	}

	public abstract void init();
}
