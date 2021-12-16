package languageConstructs;

public class Task10 {
	
	public int sumNumbers(String str) {
		  String temp = "";
				int sum = 0;
				
				for(int i=0;i<str.length();i++) {
					if(Character.isDigit(str.charAt(i))) {
						if(i<str.length()-1 && Character.isDigit(str.charAt(i+1))) {
						temp = temp +str.charAt(i);
						}
					else {
						temp = temp + str.charAt(i);
						sum = sum+Integer.parseInt(temp);
						temp="";
					}
					}
				}
				return sum;
		}
}
