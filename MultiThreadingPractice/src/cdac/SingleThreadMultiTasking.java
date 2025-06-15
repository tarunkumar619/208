package cdac;

public class SingleThreadMultiTasking {
    public static void main(String[] args) {
        System.out.println("Single Thread Started: " + Thread.currentThread().getName());

        task1(); // Kaam 1
        task2(); // Kaam 2
        task3(); // Kaam 3

        System.out.println("All Tasks Done!");
    }

    static void task1() {
        System.out.println("📦 Task 1: Packing items...");
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
    }

    static void task2() {
        System.out.println("🚚 Task 2: Delivering items...");
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
    }

    static void task3() {
        System.out.println("✅ Task 3: Confirming delivery...");
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
    }
}
