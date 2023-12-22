import java.util.ArrayList;
import java.util.List;

public class DemoArrayList {
  public static void main(String[] args) throws Exception {

    // Before Java 1.5 (No Generic)
    // ???
    // List anything =

    //
    ArrayList<String> ss = new ArrayList<String>(); // still OKAY

    // After 1.7
    ArrayList<String> strings = new ArrayList<>();
    strings.add("ABC");
    strings.add("IJK");
    strings.add("XYZ");
    System.out.println(strings.size()); // 3

    // for-each
    for (String s : strings) {
      System.out.println(s);
    }

    strings.remove(2);
    System.out.println(strings); // [ABC, IJK]
    strings.remove(new String("ABC"));
    System.out.println(strings); // [IJK]

    ArrayList<String> anotherList =
        new ArrayList<>(List.of("1234", "2345", "0000"));
    strings.addAll(anotherList);
    System.out.println(strings); // [IJK, 1234, 2345, 0000]

    // removeAll
    ArrayList<String> removedList = new ArrayList<>(List.of("2345", "IJK"));
    strings.removeAll(removedList);
    System.out.println(strings); // [1234, 0000]

    strings.add(1, "CCC"); // insert "CCC" into the postion of index 1
    System.out.println(strings);

    strings.set(1, "DDD"); // update element by index
    System.out.println(strings); // [1234, DDD, 0000]

    System.out.println(strings.subList(1, 2)); // endIndex (exclusive)

    System.out.println(strings.indexOf("0000")); // 2

    // List<> is an Interface implemented by ArrayList.class
    List<String> strings2 = new ArrayList<>();
    strings2.add("ABC");
    strings2.remove(0);
    System.out.println(strings2); // []

    if (strings.contains("DDD")) { //
      System.out.println("contains DDD");
    }

    if (!strings.isEmpty()) {
      strings.add("AAA");
    }

    // Difference:
    List<String> arrlist1 = new ArrayList<>(List.of("John", "Mary", "Peter"));
    List<String> arrlist2 = List.of("John", "Mary", "Peter");

    arrlist1.add("Sally"); // OK
    arrlist1.remove("Mary"); // OK
    arrlist1.set(1, "Jenny");

    // arrlist2.set(1, "Jenny"); // java.lang.UnsupportedOperationException
    // arrlist2.add("Sally"); // java.lang.UnsupportedOperationException

    // 
    // List<Book> 

    List<String> ls = new ArrayList<>(100); // capacity (array length)
    System.out.println(ls.size()); // size = 0 (how many elements)

    

  }
}
