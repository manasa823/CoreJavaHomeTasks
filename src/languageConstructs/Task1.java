package languageConstructs;

public class Task1 {
	
	public int caughtSpeeding(int speed, boolean isBirthday) {
		  
		  int result = 0;
		  
		  if(isBirthday){
		    
		    if(speed<=65){
		      result = 0;
		    }
		    
		    if(speed>65 && speed<=85){
		      result = 1;
		    }
		    
		    if(speed>85){
		      result = 2;
		    }
		    
		  }
		  
		  if(!(isBirthday)){
		    
		    if(speed<=60){
		      result = 0;
		    }
		    
		    if(speed>60 && speed<=80){
		      result = 1;
		    }
		    
		    if(speed>80){
		      result = 2;
		    }
		    
		  }
		  return result;
		}
}
