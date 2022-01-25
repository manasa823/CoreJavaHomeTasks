package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import consumer_supplier.Product;

public class Task1 {

	public static void main(String[] args) {
		
		Product p1 = new Product("Telivision", 40000, "Electronics", "Premium");
		Product p2 = new Product("Light", 400, "Electicals", "Moderate");
		Product p3 = new Product("Mobile", 12000, "Electronics", "Gold");
		Product p4 = new Product("Earbuds", 97, "Electronics", "Lite");
		Product p5 = new Product("Fan", 1300, "Electicals", "Silver");
		
		List<Product> list = new ArrayList<>();
		
		list.add(p5);
		list.add(p4);
		list.add(p3);
		list.add(p2);
		list.add(p1);
		
		list.stream().filter(p->p.getPrice()>1000)
				.collect(Collectors.toList())
				.forEach(p->System.out.println(p.getName()));
	}
}
