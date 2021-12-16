package loopsArrays;

import java.util.Scanner;

public class Task2 {
	
	public static boolean isPalindrome(int num) {
		
		String s = String.valueOf(num);
		StringBuilder sb = new StringBuilder(s);
		String rev = sb.reverse().toString();
		if(rev.equals(s)) {
			return true;
		}
		else
			return false;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		
		System.out.println(isPalindrome(num));
		sc.close();		
}
}
