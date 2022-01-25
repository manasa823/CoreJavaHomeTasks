package lambda;

import java.util.TreeSet;

interface SortEmp{
	
	public TreeSet<String> sort(TreeSet<String> emp);
}

public class Task8 {
	
	public static void main(String[] args) {
		
		SortEmp result = (emp)->{
			
			return emp;
		};

		TreeSet<String> set = new TreeSet<String>();
	
		set.add("Archana");
		set.add("Pramith");
		set.add("Chetana");
		set.add("Aadvik");
		set.add("Sashank");
		
		System.out.println(result.sort(set));
}
}