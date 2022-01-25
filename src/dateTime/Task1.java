package dateTime;

import java.time.LocalDate;
import java.util.function.Predicate;

public class Task1 {
	
	static Boolean checkDate(LocalDate date) {
		
		if(date.equals(LocalDate.now().minusDays(1)))
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		
		Predicate<LocalDate> pre = Task1::checkDate;
		
		System.out.println(pre.test(LocalDate.of(2022,01,01)));		
	}
}
