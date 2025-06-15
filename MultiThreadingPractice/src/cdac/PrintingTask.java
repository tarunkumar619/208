package cdac;


class PrintingTask implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("🖨️ Printing Document " + i+Thread.currentThread().getName() );
            try { Thread.sleep(3000); } catch (Exception e) {}
        }
    }
}

