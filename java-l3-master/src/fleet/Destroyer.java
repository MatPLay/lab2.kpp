package fleet;

public class Destroyer extends Ship{
	public final static int TORPEDOES_LIMIT = 4;
	private Torpedo[] torpedoes = new Torpedo[TORPEDOES_LIMIT];
	private int torpedoesCount = 0;
	
	public Destroyer(String name, int displacement) {
		super(name, displacement, new MainCaliberGun(57, 4275)); //À-220Ì
		for(int i = 0; i < torpedoes.length; i++)
			torpedoes[i] = new Torpedo();
		torpedoesCount = torpedoes.length;
	}
	
	public boolean launchTorpedo() {
		if(torpedoesCount > 0)
		{
			torpedoes[torpedoesCount - 1].blow();
			torpedoes[torpedoesCount - 1] = null;
			torpedoesCount--;
			
			return true;
		}
		return false;
	}
}
