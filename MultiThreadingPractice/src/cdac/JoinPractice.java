package cdac;
import java.lang.Thread;

public class JoinPractice implements Runnable  {

	@Override
	public void run() {

		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName());
		}
		
	}
public static void main(String[] args) {
	
    Thread th =new Thread ( new JoinPractice() , "our custom thread"); 
    try {
    th.start(); 
   
		th.join();
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName());
		}
		
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
	
	
}
