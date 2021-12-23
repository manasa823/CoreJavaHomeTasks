package bouquet;

public class Bouquet {
	
	public static int getBouquetCost(Flowers f1, Flowers f2, Flowers f3) {
		
		return f1.getTotalCost()+f2.getTotalCost()+f3.getTotalCost();
	}

	public static void main(String[] args) {
		
		Flowers r = new Roses(1,10);
		Flowers j = new Jasmines(2,100);
		Flowers l = new Lillies(3,35);
		
		System.out.println("Cost of the Bouquet is: $"+getBouquetCost(r, j, l));
	}

}
