package lambda;

import java.util.NavigableMap;
import java.util.TreeMap;

interface ReverseEmp{
	
	public NavigableMap<String,Integer> revSort(TreeMap<String,Integer> map);
}

public class Task10 {
	
	public static void main(String[] args) {
		
		ReverseEmp result = (map)->{
			
			return map.descendingMap();
		};

		TreeMap<String,Integer> map = new TreeMap<String,Integer>();
	
		map.put("Ajay",301);
		map.put("Supraja",313);
		map.put("Harika",306);
		map.put("Sindhura",354);
		map.put("Uday",342);
		
		System.out.println(result.revSort(map));
}
}