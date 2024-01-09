import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorDemo {
  public static void main(String[] args) throws InterruptedException {
    List<String> vector = new Vector<>();

    List<String> arrayList = new ArrayList<>();

    Runnable vectorAdd = () -> {
      for (int i = 0; i < 1_000_000; i++) {
        vector.add("x");
      }
    };

    Runnable arrayListAdd = () -> {
      for (int i = 0; i < 1_000_000; i++) {
        arrayList.add("x");
      }
    };

    Thread worker1 = new Thread(vectorAdd);
    Thread worker2 = new Thread(vectorAdd);
    worker1.start();
    worker2.start();
    worker1.join();
    worker2.join();
    System.out.println(vector.size()); // 2000000

    worker1 = new Thread(arrayListAdd);
    worker2 = new Thread(arrayListAdd);
    worker1.start();
    worker2.start();
    worker1.join();
    worker2.join();
    System.out.println(arrayList.size()); // 1xxxxxx

  }
}
