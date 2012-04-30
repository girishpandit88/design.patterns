package designpatterns.facade;

public class FacadeTest {
	public static void main(String args[]) {
		MediaPlayer player = new MediaPlayer();
		player.setPreset(new RockPreset());
		player.applyPreset();
		player.play();
	}
}
