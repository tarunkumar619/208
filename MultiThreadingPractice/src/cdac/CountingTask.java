package cdac;

class CountingTask implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("🔢 Counting: " + i+Thread.currentThread().getName() );
            try { Thread.sleep(2000); } catch (Exception e) {}
        }
    }
}