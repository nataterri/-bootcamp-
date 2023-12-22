import java.util.LinkedList;
import java.util.List;

public class DemoLinkedList {
  public static void main(String[] args) {
    List<String> ls = new LinkedList<>();
    ls.add("ABC");
    ls.add("XYZ");
    ls.add("IJK");
    System.out.println(ls);

    ls.remove(2); // remove by index, much slower than arraylist.remove(index)
    System.out.println(ls);
    ls.remove("XYZ");
    System.out.println(ls);

    // for-each, contains(), isEmpty()
    System.out.println(ls.get(0));

  }
}
