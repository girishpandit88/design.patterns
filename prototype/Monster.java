package designpatterns.prototype;

public abstract class Monster implements Cloneable {
	public abstract void Attack();

	public abstract void LoadTextures();

	public abstract void LoadSound();

	public abstract Monster Clone() throws CloneNotSupportedException;
}
