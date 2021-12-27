package powerConsumption;

public class TV implements Appliances {

	private int power;

	public TV(String condition, int power) {
		
		if(condition.equalsIgnoreCase("on"))
			this.power = power;
		if(condition.equalsIgnoreCase("off"))
			this.power=0;
	}

	@Override
	public int totalPowerConsumed() {
		return power;
	}
}
