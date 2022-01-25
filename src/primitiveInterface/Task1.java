package primitiveInterface;

import java.util.function.IntPredicate;

public class Task1 {

	public static void main(String[] args) {
		
		IntPredicate intp = (n) -> {
			
			int count = 0;
			for(int i=1;i<=n;i++) {
				if(n%i==0)
					count++;
			}
			if(count==2)
				return true;
			else
				return false;
		};
		
		System.out.println("Is given number prime? "+intp.test(3));
	}
}
