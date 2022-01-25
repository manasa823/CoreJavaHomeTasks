package consumer_supplier;

import java.util.function.Consumer;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task1 {
	
	static String medium;
	static Logger logger = Logger.getLogger("MyLog");  
	
	static void getMedium(String med){  
          medium=med;
    } 
	
    static void printValue(Product p) throws Exception{  
    	
    	if(medium.equalsIgnoreCase("console"))
    		System.out.println(p.getName());
    	
    	if(medium.equalsIgnoreCase("file")) {
    		
    		FileHandler fh = new FileHandler("C:\\Users\\manasa.channamaraju\\git\\Java8\\Java8\\LogFile.log");  
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();  
            fh.setFormatter(formatter);   
            logger.info(p.getName());  
    	}
    }  
	
	public static void main(String[] args) {
		
		Product p1 = new Product("Telivision", 40000, "Electronics", "Premium");

		Consumer<String> consumer1 = Task1::getMedium;  
	    consumer1.accept("file");
	    Consumer<Product> consumer2 = t -> {
			try {
				printValue(t);
			} catch (Exception e) {
				e.printStackTrace();
			}
		};  
        consumer2.accept(p1);
	}
}
