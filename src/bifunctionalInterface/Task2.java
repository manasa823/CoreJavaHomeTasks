package bifunctionalInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiFunction;


import consumer_supplier.Product;

public class Task2 {
	
public static void main(String[] args) {
		
		Product p1 = new Product("Telivision", 40000, "Electronics", "Premium");
		Product p2 = new Product("Light", 400, "Electicals", "Moderate");
		Product p3 = new Product("Earbuds", 97, "Electronics", "Lite");
		Product p4 = new Product("Fan", 1300, "Electicals", "Silver");
		
		BiFunction <Product, Integer, Integer> fun = (product, quantity) -> product.getPrice()*quantity;
		
		Map<Product, Integer> map = new HashMap<>();
		map.put(p1, 1);
		map.put(p2, 4);
		map.put(p3, 5);
		map.put(p4, 3);
		
		int cartCost = 0;
		
		for(Entry<Product, Integer> e:map.entrySet()) {
			
			cartCost = cartCost + fun.apply(e.getKey(),e.getValue());
		}
		
		System.out.println("Total cost of the cart: "+cartCost);

}
}
