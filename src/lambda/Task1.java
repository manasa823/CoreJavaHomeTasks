package lambda;

interface Palindrome{
	
	public boolean ifPalindrome(String s);
}

public class Task1 {

	public static void main(String[] args) {
		
		Palindrome result=(s)->{
			
			StringBuilder st = new StringBuilder(s);
			String r = st.reverse().toString();	
			if(r.equalsIgnoreCase(s))
				return true;
			else
				return false;	
		};
		
		if(result.ifPalindrome("nannannan"))
				System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
}
