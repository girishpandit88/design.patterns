package designpatterns.prototype;

public class Geth extends Monster {

	@Override
	public void Attack() {
		System.out.println("Geth Attack");

	}

	@Override
	public void LoadTextures() {
		System.out.println("Geth Textures");

	}

	@Override
	public void LoadSound() {
		System.out.println("Geth Sound");

	}

	@Override
	public Monster Clone() throws CloneNotSupportedException {
		return (Geth) this.clone();
	}

}
