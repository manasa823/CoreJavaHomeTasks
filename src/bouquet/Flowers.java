package bouquet;

public class Flowers {
	
	private int cost;
	private int count;

	
	public Flowers(int cost, int count) {
		super();
		this.cost = cost;
		this.count = count;
	}
	
	public int getTotalCost() {
		return count*cost;
	}
	
}
