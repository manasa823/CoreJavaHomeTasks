package dateTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.function.Supplier;

public class Task2 {

	public static void main(String[] args) {
		
		Supplier<LocalDate> random = new Supplier<LocalDate>() {
			
			public LocalDate get() {
				
				LocalDate date = LocalDate.now();
				int day = DayOfWeek.from(date).getValue(); 
				date = date.plusDays(7-(day+3));
				return date;
			}
		};
		System.out.println(random.get());
		System.out.println(DayOfWeek.from(random.get()));
	}
}
