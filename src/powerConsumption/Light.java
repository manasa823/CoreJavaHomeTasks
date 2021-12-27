package powerConsumption;

public class Light implements Appliances {

	private int power;

	public Light(String condition, int power) {
		
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
