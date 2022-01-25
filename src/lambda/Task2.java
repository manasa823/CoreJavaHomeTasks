package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

interface SecondBig{
	
	public int secondBig(List<Integer> list);
}

public class Task2 {
	
	public static void main(String[] args) {
		
		SecondBig result = (list)->{
			
			Collections.sort(list);
			int num = list.get(list.size()-2);
			return num;
		};
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(23);
		list.add(6);
		list.add(74);
		list.add(91);
		System.out.println(result.secondBig(list));
	}

}
