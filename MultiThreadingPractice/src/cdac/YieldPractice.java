package cdac;

public class YieldPractice implements Runnable {

	@Override
	public void run() {
		

		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName());
		}
		
	
		
	}
	
	public static void main(String[] args) {
		
		YieldPractice  th = new YieldPractice();
		
		Thread obj= new Thread(th);
		obj.setName("Custom thread");
		obj.start();
		Thread.yield();
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName());
		}
		
		
	}

}
