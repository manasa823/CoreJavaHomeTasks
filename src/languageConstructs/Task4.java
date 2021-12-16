package languageConstructs;

public class Task4 {
	
	public int blueTicket(int a, int b, int c) {
		  
		  int result = 0;
		  
		  if(a+b==10 || b+c==10 || a+c==10){
		    result = 10;
		  }
		  
		  if(result!=10 && (a+b==b+c+10 || a+b==a+c+10)){
		    result = 5;
		  }
		  
		  return result;
		}
}
