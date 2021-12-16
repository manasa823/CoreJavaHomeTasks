package languageConstructs;

public class Task3 {
	
	public int teaParty(int tea, int candy) {
		  
		  int result = 0;
		  
		  if(tea>=5 && candy>=5){
		    
		    if(tea>=2*candy || candy>=2*tea){
		    result = 2;
		    }
		    
		    else{
		    result = 1;
		    }
		  }
		  
		  else{
		    result = 0;
		  }
		  return result;
		}
}
