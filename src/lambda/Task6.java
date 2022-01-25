package lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

interface Sorting{
	
	public List<String> sort(List<String> employees);
}

public class Task6 {
	
	public static void main(String[] args) {
		
		Sorting result = (employees)->{
			
			employees.sort(Comparator.naturalOrder());
			return employees;
		};

	List<String> employees = new ArrayList<String>();
	
		employees.add("Aarya");
		employees.add("Meghana");
		employees.add("Aarav");
		employees.add("Atharv");
		employees.add("Pratham");

	
		System.out.println(result.sort(employees));
}
}
