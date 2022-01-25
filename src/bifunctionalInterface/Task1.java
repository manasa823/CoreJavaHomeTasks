package bifunctionalInterface;

import java.util.function.BiFunction;

import consumer_supplier.Product;

public class Task1 {
	
	public static void main(String[] args) {
		
		BiFunction <String, Integer, Product> fun = (name, price) -> {
			
			Product p = new Product();
			p.setName(name);
			p.setPrice(price);
			return p;
		};
		
		Product p = fun.apply("Table", 6000);
		
		System.out.println("Product created with name: "+p.getName()+" and with price: "+p.getPrice());
		
		}
 }
