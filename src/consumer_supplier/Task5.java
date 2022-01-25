package consumer_supplier;

import java.util.Random;
import java.util.function.Supplier;

public class Task5 {
	
	public static String generateString() {
		
		String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		int len = 3;
		Random rndm = new Random();
		StringBuilder result = new StringBuilder();
		StringBuilder sb = new StringBuilder(len);
		for (int i = 0; i < len; i++)
			sb.append(alphabets.charAt(rndm.nextInt(alphabets.length())));
		result.append(sb);
		sb.append(alphabets.charAt(rndm.nextInt(alphabets.length())));
		sb.append(alphabets.charAt(rndm.nextInt(alphabets.length())));
		sb.reverse();
		result.append(sb);
		return result.toString();
	}
	
	public static void main(String[] args) {
		
		Supplier<Product> random = new Supplier<Product>() {
			
			public Product get() {
				  
				Random r = new Random();
			    String name = generateString();
			    int price = r.nextInt(100000);
			    String category  = generateString();
			    String grade  = generateString();
			    Product p = new Product(name,price,category,grade);
			    return p;		
			}
		};
		
		System.out.println(random.get().getName());
		System.out.println(random.get().getCategory());
		System.out.println(random.get().getPrice());
		System.out.println(random.get().getGrade());
	}

}
