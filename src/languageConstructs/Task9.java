package languageConstructs;

public class Task9 {
	
	public int maxBlock(String str) {
		  int count=0,temp=1;
		  for(int i=0;i<str.length()-1;i++){
		    if(str.charAt(i)==str.charAt(i+1)){
		      temp++;
		    }
		    else{
		      temp=1;
		    }
		    if(temp>count){
		      count=temp;
		    }
		  }
		  return count;
		}
}
