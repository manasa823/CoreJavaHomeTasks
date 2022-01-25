package lambda;

public class Task4 implements Runnable{

	@Override
	public void run() {
		
		for(int i=1;i<=10;i++)
			System.out.println(i);
	}
	
	public static void main(String[] args) {
		
		Task4 obj = new Task4();
		Thread t = new Thread(obj);
		t.start();
	}

}
