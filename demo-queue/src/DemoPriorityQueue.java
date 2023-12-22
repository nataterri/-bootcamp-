import java.util.PriorityQueue;
import java.util.Queue;

public class DemoPriorityQueue {
  public static void main(String[] args) {
    PriorityQueue<String> qs = new PriorityQueue<>(new SortByDesc());

    qs.add("h");
    qs.add("a");
    qs.add("x");

    System.out.println(qs); // priority queue does not guarantee the order during sysout

    System.out.println(qs.poll()); // x
    System.out.println(qs.poll()); // h
    System.out.println(qs.poll()); // a


  }
}