package basics;

import java.util.Scanner;

public class Task1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter Your Name:");
		
		String name = sc.next();
		
		System.out.println("Hello "+name);
		
		sc.close();
		
	}
}
