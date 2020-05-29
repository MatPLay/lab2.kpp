package fleet;

public abstract class Gun {
	protected int caliber;
	protected int barrelLength;
	
	public Gun(int caliber, int barrelLength)
	{
		this.caliber = caliber;
		this.barrelLength = barrelLength;
	}
	
	public abstract void shoot();
}
