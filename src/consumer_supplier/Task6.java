package consumer_supplier;

import java.util.Random;
import java.util.function.Supplier;

public class Task6 {
	
	public static void main(String[] args) {
		
		Supplier<Integer> random = new Supplier<Integer>() {
			
			public Integer get() {
				  
				Random r = new Random();
			    int otp = r.nextInt(10000000);
			    return otp;	
			}
		};
		
		System.out.println(random.get());
	}

}
