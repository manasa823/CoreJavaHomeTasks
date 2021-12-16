package basics;

import java.util.Scanner;

public class Task2 {

	public static void calculator(double num1, double num2, String operation) {
		
		if(operation.equalsIgnoreCase("addition")) {
			System.out.println("Addition of "+num1+" and "+num2+" is: "+(num1+num2));
		}
		
		if(operation.equalsIgnoreCase("subtraction")) {
			System.out.println("Subtraction of "+num1+" and "+num2+" is: "+(num1-num2));
		}
		
		if(operation.equalsIgnoreCase("multiplication")) {
			System.out.println("Multiplication of "+num1+" and "+num2+" is: "+(num1*num2));
		}
		
		if(operation.equalsIgnoreCase("division")) {
			System.out.println("Division of "+num1+" and "+num2+" is: "+(num1/num2));
		}
		
		if(operation.equalsIgnoreCase("reminder")) {
			System.out.println("Reminder to the division of "+num1+" and "+num2+" is: "+(num1%num2));
		}
		
		if(operation.equalsIgnoreCase("percentage")) {
			System.out.println("Percantage of "+num1+" to "+num2+" is: "+((num1/num2)*100));
		}
	}
	
	public static void  main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter two numbers:");
		
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		
		System.out.println("Please enter operation to be performed:");
		
		String operation = sc.next();
		
		calculator(num1,num2,operation);
		
		sc.close();
		
	}
}
