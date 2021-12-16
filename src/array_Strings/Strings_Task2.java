package array_Strings;

public class Strings_Task2 {
	
	public static boolean isRotational(String s1, String s2) {
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		String temp = s1.concat(s1);
		if(temp.contains(s2)) {
			return true;
		}
		else
			return false;
	}

	public static void main(String[] args) {
		System.out.println(isRotational("Hello","heoll"));
	}
}
