package lambda;

import java.util.TreeSet;

interface ReverseSet{
	
	public TreeSet<Integer> sort(TreeSet<Integer> set);
}

public class Task7 {
	
	public static void main(String[] args) {
		
		ReverseSet result = (set)->{
			
			return (TreeSet<Integer>) set.descendingSet();
		};

		TreeSet<Integer> set = new TreeSet<Integer>();
	
		set.add(82);
		set.add(299);
		set.add(2987);
		set.add(4);
		set.add(38);
		
		System.out.println(result.sort(set));
}
}