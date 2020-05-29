package fleet;

public class Plane {

	public Plane takeoff() {
		return this;
	}
	
	public void bomb() {
		//democracy
	}
	
	public void land(Carrier carrier) {
		carrier.takePlane(this);
	}
}
