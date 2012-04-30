package designpatterns.prototype;

public class Cyborg extends Monster {

	@Override
	public void Attack() {
		System.out.println("Cyborg Attack");
	}

	@Override
	public void LoadTextures() {
		System.out.println("Cyborg Textures");

	}

	@Override
	public void LoadSound() {
		System.out.println("Cyborg Sound");

	}

	@Override
	public Monster Clone() throws CloneNotSupportedException {
		return (Cyborg) this.clone();
	}
}
