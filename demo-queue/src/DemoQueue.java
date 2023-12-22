import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DemoQueue {
  public static void main(String[] args) {
    List<String> ls = new LinkedList<>();
    // ls.add, remove, get
    ls.add("ABC");
    ls.add("IJK");

    String result = ls.get(0); // ABC
    ls.remove(0);

    // List vs Queue
    // 1. We cannot access the middle elements in the queue. Just get the object from the queue head
    // 2. Queue is FIFO (First in First out)
    Queue<String> qs = new LinkedList<>();
    qs.add("ABC");
    qs.add("IJK");

    System.out.println(qs.poll()); // ABC
    System.out.println(qs.poll()); // IJK

    System.out.println(qs.size()); // 0

    Deque<String> ds = new LinkedList<>();
    ds.add("ABC"); // same as addLast()
    ds.add("IJK"); // same as addLast()

    // addLast
    ds.addLast("Last");
    // addFirst
    ds.addFirst("First");
    // pollLast
    System.out.println(ds.pollLast()); // "Last"
    // pollFirst
    System.out.println(ds.pollFirst()); // "First"

    // peek(), just look up, not retrieval
    System.out.println(ds.peekFirst()); // ABC
    System.out.println(ds.peekLast()); // IJK

    // removeLast()
    System.out.println(ds.removeLast()); // "IJK"
    // removeFirst()
    System.out.println(ds.removeFirst()); // "ABC"
    
    // Difference pollLast() and removeLast() ?
    System.out.println("poll element from empty deque: " + ds.poll()); // null
    System.out.println("remove element from empty deque: " + ds.remove()); // java.util.NoSuchElementException

  }
}
