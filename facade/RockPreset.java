package designpatterns.facade;

public class RockPreset extends Preset {

	@Override
	public void apply() {
		System.out.println("Preset -> RockPreset applied...");
		HighPassFlanger hpf = new HighPassFlanger();
		Echo echo = new Echo();
		TwoPassEqualizer eq = new TwoPassEqualizer();
		hpf.setValue();
		echo.set();
		eq.setHigh();
	}

}
