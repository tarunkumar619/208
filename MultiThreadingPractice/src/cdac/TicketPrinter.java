package cdac;

class TicketPrinter implements Runnable {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + " is printing ticket number: " + i);
            try {
                Thread.sleep(1000); // time taken to print
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
