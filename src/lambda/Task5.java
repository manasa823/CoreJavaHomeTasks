package lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

interface Reverse{
	
	public List<Integer> reverse(List<Integer> list);
}

public class Task5 {
	
	public static void main(String[] args) {
		
		Reverse result = (list)->{
			
			list.sort(Comparator.reverseOrder());
			return list;
		};
		
		List<Integer> values = new ArrayList<Integer>();
		
		values.add(212);
		values.add(34);
		values.add(9);
		values.add(-10);
		values.add(477);

		System.out.println(result.reverse(values));
	}

}
