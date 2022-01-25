package lambda;

import java.util.NavigableMap;
import java.util.TreeMap;

interface ReverseMap{
	
	public NavigableMap<Integer,String> revSort(TreeMap<Integer,String> map);
}

public class Task9 {
	
	public static void main(String[] args) {
		
		ReverseMap result = (map)->{
			
			return map.descendingMap();
		};

		TreeMap<Integer,String> map = new TreeMap<Integer,String>();
	
		map.put(301, "Ajay");
		map.put(313, "Supraja");
		map.put(306, "Harika");
		map.put(354, "Sindhura");
		map.put(342, "Uday");
		
		System.out.println(result.revSort(map));
}
}