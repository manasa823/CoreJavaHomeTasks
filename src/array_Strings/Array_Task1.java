package array_Strings;

public class Array_Task1 {
	
	public static int missingNumber(int[] a) {
		
		int sum=0,sumOfNum = 100*101/2;
		int missingNum;
		
		for(int i=0;i<a.length;i++) {
			sum = sum + a[i];
		}
		
		missingNum = sumOfNum-sum;
		return missingNum;
		
	}
	
	public static void main(String[] args) {
		
		int[] a = new int[100];
		for(int i=1;i<=100;i++) {
			a[i-1]=i;
		}	
		a[37]=0;
		System.out.println(missingNumber(a));
	}
}
