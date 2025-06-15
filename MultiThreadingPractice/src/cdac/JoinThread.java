package cdac;

public class JoinThread implements Runnable {

	@Override
	public void run() {
		
		for(int i=0;i<=5;i++) {
			System.out.println(Thread.currentThread().getName());
	}	
		
	}
	
	public static void main(String[] args) {
		try {
		Thread t1 = new Thread(new JoinThread());
		Thread.currentThread().setName("Main Thread");
		t1.setName("Custom thread");
		t1.start();
		
		t1.join();
			
		
for(int i=0;i<=5;i++) {
		System.out.println(Thread.currentThread().getName());
}			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
