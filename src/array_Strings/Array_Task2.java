package array_Strings;

public class Array_Task2 {

		public static void getNumbers(int[] a) {
			
			int big=a[0],small=a[0];
			
			for(int i=0;i<a.length;i++) {
				if(a[i]>big) {
					big = a[i];
				}
				if(a[i]<small) {
					small=a[i];
				}
			}
			System.out.println("Smallest number: "+small);
			System.out.println("Biggest number: "+big);
		}
		
		public static void main(String[] args) {
			
			int[] a = {10,3,72,28,92,17};
			getNumbers(a);
		}
	}
