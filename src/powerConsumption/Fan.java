package powerConsumption;

public class Fan implements Appliances {
	
	private int power;

	public Fan(String condition, int power) {
		
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
