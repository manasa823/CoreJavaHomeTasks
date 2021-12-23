package powerConsumption;

public class Appliances {

	private int count;
	private int powerConsumed;
	
	public Appliances(int count, int powerConsumed) {
		super();
		this.count = count;
		this.powerConsumed = powerConsumed;
	}
	
	public int totalPowerConsumed() {
		return count*powerConsumed;
	}
}
