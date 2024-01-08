public class DemoThread {

    // Process? Thread?
    public static void main(String[] args) { // main thread
        System.out.println("main Start ...");
        // Runnable
        Runnable task1 = () -> System.out.println("task 1 running ...");

        // Thread
        Thread thread1 = new Thread(task1);
        thread1.start(); // main thread split itself, another thread is created

        Thread thread2 = new Thread(task1);
        thread2.start(); // main thread split itself, another thread is created

        // 1,000,000 lines of code ...
        for (int i = 0; i < 1_000_000_000; i++) {

        }

        CustomThread customThread = new CustomThread(); // Your task is already defined in the class
        customThread.start();

        System.out.println("main End ...");

    }
}
