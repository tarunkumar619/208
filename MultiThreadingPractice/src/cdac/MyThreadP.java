package cdac;

class MyThreadP extends Thread {
    public void run() {
        for (int i = 1; i <= 1; i++) {
            System.out.println(Thread.currentThread().getName() + 
                               " with priority " + 
                               Thread.currentThread().getPriority() + 
                               " → printing " + i);
        }
    }
}