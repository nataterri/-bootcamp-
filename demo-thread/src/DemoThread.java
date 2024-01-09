public class DemoThread {

  // Process? Thread?
  public static void main(String[] args) { // main thread
    System.out.println("main Start ...");
    // Runnable
    Runnable task1 = () -> {
      try {
        Thread.sleep(2000); // 2000ms = 2s
      } catch (InterruptedException e) {

      }
      // Thread current = Thread.currentThread();
      System.out.println("Thread ID:" + Thread.currentThread().getId()
          + ", Thread Name:" + Thread.currentThread().getName());
      System.out.println("task 1 running ...");
    };

    Runnable task2 = () -> System.out.println("task 2 running ...");

    // Thread
    Thread thread1 = new Thread(task1);
    thread1.start(); // main thread spilt itself, another thread is created

    Thread thread2 = new Thread(task1);
    thread2.start(); // main thread spilt itself, another thread is created

    // 1,000,000 lines of code ...
    // for (int i = 0; i < 100_000_000; i++) {

    // }

    CustomThread customThread = new CustomThread(); // Your task is already defined in the class
    customThread.start();

    try {
      thread1.join();
      thread2.join();
      customThread.join();
    } catch (InterruptedException e) { // checked exception

    }


    System.out.println("main End ...");
  }
}