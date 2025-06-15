package cdac;

public class MultiThreadMultiTask {
	

	public static void main(String[] args) {
	
    Thread printingThread = new Thread(new PrintingTask());
    Thread countingThread = new Thread(new CountingTask());
    Thread messageThread = new Thread(new MessageTask());

    printingThread.start();
    countingThread.start();
    messageThread.start();	
	}
}
