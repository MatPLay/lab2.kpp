package fleet;

public class Carrier extends Ship{
	public final static int PLANES_LIMIT = 10;
	private Plane[] planes = new Plane[PLANES_LIMIT];
	private int planesCount = 0;
	
	public Carrier(String name, int displacement) {
		super(name, displacement, new AAGun(25, 1975)); //2Ì-3
		for(int i = 0; i < planes.length; i++)
			planes[i] = new Plane();
		planesCount = planes.length;
	}
	
	public boolean sendPlane() {
		if(planesCount > 0)
		{
			Plane sentPlane = planes[planesCount - 1].takeoff();
			planes[planesCount - 1] = null;
			planesCount--;
			
			sentPlane.bomb();
			sentPlane.land(this);
			
			return true;
		}
		return false;
	}
	
	public void takePlane(Plane plane) {
		if(planesCount < planes.length) {
			planes[planesCount] = plane;
			planesCount++;
		}
	}
}
