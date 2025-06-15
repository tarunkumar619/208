package cdac;

public class ThreadPriorityDemo {
	public static void main(String[] args) {
        MyThreadP t1 = new MyThreadP();
        MyThreadP t2 = new MyThreadP();
        MyThreadP t3 = new MyThreadP();
        MyThreadP t4 = new MyThreadP();

        t1.setName("Thread-low");
        t2.setName("Thread-mid");
        t3.setName("Thread-high	");
        t4.setName("Thread-3");

        // Set priorities
        t1.setPriority(Thread.MIN_PRIORITY);    // 1
        t2.setPriority(Thread.NORM_PRIORITY);   // 5
        t3.setPriority(Thread.MAX_PRIORITY);    // 10
        t3.setPriority(3); 

        // Start all threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
