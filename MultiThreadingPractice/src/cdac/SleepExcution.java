package cdac;

public class SleepExcution {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			
			try {
				Thread.sleep(3000);
				System.out.println("🖨️ Printing Document " + i+Thread.currentThread().getName() );
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}

	}

}
