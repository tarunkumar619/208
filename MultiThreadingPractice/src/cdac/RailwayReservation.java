package cdac;

public class RailwayReservation {
    public static void main(String[] args) {
        TicketPrinter printer = new TicketPrinter(); // shared task

        Thread counter1 = new Thread(printer, "Counter-1");
        Thread counter2 = new Thread(printer, "Counter-2");
        Thread counter3 = new Thread(printer, "Counter-3");

        counter1.start();
        counter2.start();
        counter3.start();
    }
}
