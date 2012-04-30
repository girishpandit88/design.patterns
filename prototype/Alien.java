package designpatterns.prototype;

public class Alien extends Monster {

	@Override
	public void Attack() {
		System.out.println("Alien Attack");
	}

	@Override
	public void LoadTextures() {
		System.out.println("Alien Textures");

	}

	@Override
	public void LoadSound() {
		System.out.println("Alien Sound");

	}

	@Override
	public Monster Clone() throws CloneNotSupportedException {
		return (Alien) this.clone();
	}

}
