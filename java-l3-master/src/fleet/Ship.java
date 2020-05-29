package fleet;

public abstract class Ship {
	protected String name;
	protected int displacement;
	protected Gun gun;
	
	public Ship(String name, int displacement, Gun gun)
	{
		this.name = name;
		this.displacement = displacement;
		this.gun = gun;
	}
	
	public void swim() {
		//move instead of swim
	}
	
	public void shoot() {
		gun.shoot();
	}
}
