public class StringBuilderDemo {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();

    StringBuffer sbf = new StringBuffer();
    sbf.append("hello").append("world");
    System.out.println(sbf.toString()); // helloworld

    // StringBuilder vs StringBuffer
    // Runnable -> 2 Threads append "x" 1_000_000 times -> StringBuilder
    // Runnable -> 2 Threads append "x" 1_000_000 times -> StringBuffer

    Runnable appendStringBuilder = () -> {
      for (int i = 0; i < 1_000_000; i++) {
        sb.append("x");
      }
    };
    Runnable appendStringBuffer = () -> {
      for (int i = 0; i < 1_000_000; i++) {
        sbf.append("x");
      }
    };
    // Test String Builder
    Thread worker1 = new Thread(appendStringBuilder);
    Thread worker2 = new Thread(appendStringBuilder);

    sb.setLength(0); // similar to clear()
    worker1.start();
    worker2.start();
    try {
      worker1.join();
      worker2.join();
    } catch (InterruptedException e) {

    }
    System.out.println(sb.length());

    // Test String Buffer
    worker1 = new Thread(appendStringBuffer);
    worker2 = new Thread(appendStringBuffer);

    sbf.setLength(0); // similar to clear()
    worker1.start();
    worker2.start();
    try {
      worker1.join();
      worker2.join();
    } catch (InterruptedException e) {

    }
    System.out.println(sbf.length());
  }
}