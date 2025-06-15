package cdac;

class MessageTask implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("💬 Sending message " + i+Thread.currentThread().getName() );
            try { Thread.sleep(4000); } catch (Exception e) {}
        }
    }
}