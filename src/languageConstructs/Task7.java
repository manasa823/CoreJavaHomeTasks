package languageConstructs;

public class Task7 {

	public int sumLimit(int a, int b) {
		  
		  int al = String.valueOf(a).length();
		  int suml = String.valueOf(a+b).length();
		  
		  if(suml>al){
		    return a;
		  }
		  else{
		    return a+b;
		  }
		}
}
