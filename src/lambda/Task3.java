package lambda;

interface IsRotation{
	
	public boolean isRotation(String s1, String s2);
}

public class Task3 {
	
	public static void main(String[] args) {
		
		IsRotation result = (s1,s2)->{
			
			s1=s1.toLowerCase();
			s2=s2.toLowerCase();
			String temp = s1.concat(s1);
			if(temp.contains(s2)) {
				return true;
			}
			else
				return false;
		};
		
		if(result.isRotation("Hello","llohe"))
			System.out.println("Rotational");
		else
			System.out.println("Non-Rotational");
	}

}
