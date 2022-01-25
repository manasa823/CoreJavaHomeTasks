package consumer_supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Task4 {
	
	static void getProducts(List<Product> product) {
		
		for(Product p:product) {
			if(p.getGrade().equalsIgnoreCase("premium")){
				p.setName(p.getName()+"*");
				System.out.println(p.getName());
			}
		}
	}
	
	public static void main(String[] args) {
		
		Product p1 = new Product("Telivision", 40000, "Electronics", "Premium");
		Product p2 = new Product("Light", 400, "Electicals", "Moderate");
		Product p3 = new Product("Mobile", 12000, "Electronics", "Premium");
		Product p4 = new Product("Earbuds", 97, "Electronics", "Lite");
		Product p5 = new Product("Fan", 1300, "Electicals", "Premium");
		
		List<Product> list = new ArrayList<>();
		
		list.add(p5);
		list.add(p4);
		list.add(p3);
		list.add(p2);
		list.add(p1);
		
		Consumer<List<Product>> consumer1 = Task4::getProducts;  
	    consumer1.accept(list);
	}

}
