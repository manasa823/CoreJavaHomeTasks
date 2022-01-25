package predicates;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Task4 {
	
	public static void main(String[] args) {
		
		Product p1 = new Product("Telivision", 40000, "Electronics", 1);
		Product p2 = new Product("Light", 400, "Electicals", 4);
		Product p3 = new Product("Mobile", 12000, "Electronics", 2);
		Product p4 = new Product("EarBuds", 97, "Electronics", 4);
		Product p5 = new Product("Fan", 1300, "Electicals", 3);
		
		List<Product> list = new ArrayList<>();
		
		list.add(p5);
		list.add(p4);
		list.add(p3);
		list.add(p2);
		list.add(p1);
		
		Predicate<String> predicate1 =  Task2::checkCategory;
		Predicate<Integer> predicate2 = Task3::checkPrice;
		
		for(Product p:list) {
			if(predicate1.test(p.getCategory())||predicate2.test(p.getPrice()))
				System.out.println(p.getName());
		}
	}
}
