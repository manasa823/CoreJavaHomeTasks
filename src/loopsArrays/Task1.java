package loopsArrays;

public class Task1 {
	
	public static void generatePyramid(int num, int x) {
		
		int n=0;
		
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(n+" ");
				n=n+x;
			}
			System.out.print("\n");
		}
	}
	
	public static void main(String[] args) {
		generatePyramid(6,3);
	}

}
