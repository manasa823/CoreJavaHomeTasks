package primitiveInterface;

import java.util.function.IntConsumer;

public class Task2 {

	public static void main(String[] args) {
		
		IntConsumer intc = n -> {
			
			System.out.println(Math.pow(n, 2));
		};
		
		intc.accept(26);
	}
}
