package functionInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import predicates.Product;

public class Task2 {
	
	static Integer addList(List<Product> list){ 
		int sum=0;
        for(Product p:list) {
        	if(p.getPrice()>1000)
        	sum = sum + p.getPrice();
        }
        return sum;
    }  
	
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
		
		Function<List<Product>, Integer> fun = Task2::addList;  
		System.out.println("Sum of cost of all Products greater than 1000: "+fun.apply(list));
	}

}
