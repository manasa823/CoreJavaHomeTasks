package primitiveInterface;

import java.util.Random;
import java.util.function.IntSupplier;

public class Task3 {

	public static void main(String[] args) {
		
		IntSupplier ints = () -> {
			
			Random r = new Random();
		    int num = r.nextInt(5000);
		    return num;	
		};
		
		System.out.println(ints.getAsInt());
	}
}
