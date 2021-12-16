package languageConstructs;

public class Task2 {
	
	public boolean isSix(int a, int b) {
		
		boolean result = false;
		
		if(a==6 || b==6 || a+b==6 || Math.abs(a-b)==6) {
			result = true;
		}
		return result;
	}
}
