package designpatterns.facade;

public class MediaPlayer {
	Preset preset;

	public void setPreset(Preset preset) {
		this.preset = preset;
	}

	public void applyPreset() {
		preset.apply();
	}

	public void play() {
		System.out.println("Media player playing...");
	}
}
