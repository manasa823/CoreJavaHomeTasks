package languageConstructs;

public class Task6 {

	public boolean shareDigit(int a, int b) {
		  
		  boolean result = false;
		  
		  if(a/10==b/10 || a/10==b%10 || a%10==b/10 || a%10==b%10){
		    result = true;
		  }
		  return result;
		}
}
