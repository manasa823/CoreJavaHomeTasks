package dateTime;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

public class Task4 {
	
	static Period getAge(LocalDate dob) {
		
		LocalDate date = LocalDate.now();
		Period age = Period.between(dob, date);
		return age;
	}
	
	public static void main(String[] args) {
		
		Function<LocalDate, Period> fun = Task4::getAge;
		Period p = fun.apply(LocalDate.of(1997,01,29));
		System.out.println("Age of the person: "+p.getYears()+"Y "+p.getMonths()+"M "+p.getDays()+"D");
	}
}
