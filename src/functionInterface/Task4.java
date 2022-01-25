package functionInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import predicates.Product;

public class Task4 {
	
	static List<String> getList(List<Product> list){ 
		List<String> result = new ArrayList<>();
        for(Product p:list) {
        	if(p.getCategory().equalsIgnoreCase("Electronics")&&p.getPrice()>1000)
        	result.add(p.getName());
        }
        return result;
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
		
		Function<List<Product>, List<String>> fun = Task4::getList;  
		System.out.println("Products whose price is is >1000/- and belongs to electronic category: "+fun.apply(list));
	}

}
