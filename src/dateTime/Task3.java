package dateTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.function.Supplier;

public class Task3 {
	
	public static void main(String[] args) {
		
		Supplier<ZonedDateTime> sup = new Supplier<ZonedDateTime>(){
			
			public ZonedDateTime get() {
				
				ZonedDateTime time = ZonedDateTime.now();
				ZoneId est = ZoneId.of("America/New_York");
				System.out.println("In IST: "+time);
				ZonedDateTime zone= time.withZoneSameInstant(est);
				return zone;
			}
		};
		
		ZonedDateTime t = sup.get();
		 System.out.println("In EST: "+t);
	}

}
