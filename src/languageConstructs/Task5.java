package languageConstructs;

public class Task5 {
	
	public boolean inOrder(int a, int b, int c, boolean bOk) {
		  
		  boolean result = false;
		  
		  if(bOk){
		    if(c>b){
		      result = true;
		    }
		  }
		  
		  if(!bOk){
		    if(b>a && c>b){
		      result = true;
		    }
		  }
		  return result;
		}
}
