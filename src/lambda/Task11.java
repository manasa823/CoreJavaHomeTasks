package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

interface RevEmp{
	
	public List<String> reverse(List<String> list);
}

public class Task11 {
	
	public static void main(String[] args) {
		
		RevEmp result = (list)->{
			
			Collections.sort(list,Collections.reverseOrder());
			return list;
		};
		
		List<String> employees = new ArrayList<String>();
		
		employees.add("Aarya");
		employees.add("Meghana");
		employees.add("Aarav");
		employees.add("Atharv");
		employees.add("Pratham");

		System.out.println(result.reverse(employees));
	}

}
