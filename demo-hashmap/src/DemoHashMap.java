import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DemoHashMap {
  public static void main(String[] args) {

    List<String> strings = new ArrayList<>();

    // Map:
    // 1. key value pair -> <key, value> -> one entry
    // 2. key must be unique
    Map<String, Integer> ageBook = new HashMap<>();

    // put()
    ageBook.put("John", 20);
    ageBook.put("John", 13); // Update 20 -> 13, because "John" is the key which exists in the map
    ageBook.put("Mary", 3); // add a new entry

    System.out.println(ageBook.size()); // 2

    for (Map.Entry<String, Integer> entry : ageBook.entrySet()) {
      System.out.println(entry.getKey() + " " + entry.getValue());
    }

    // get()
    System.out.println(ageBook.get("Mary")); // 3
    System.out.println(ageBook.get("John")); // 13
    System.out.println(ageBook.get("John")); // 13


    Map<Integer, String> winnerBook = new HashMap<>();
    winnerBook.put(1, "Tommy");
    winnerBook.put(1, "Peter");
    winnerBook.put(2, "Sally");
    winnerBook.put(3, "Jenny");
    winnerBook.put(null, "AAA");
    winnerBook.put(null, "BBB");

    for (Map.Entry<Integer, String> entry : winnerBook.entrySet()) {
      System.out.println(entry.getKey() + " " + entry.getValue());
    }

    System.out.println(winnerBook.get(null)); // BBB
    System.out.println(winnerBook.get(3)); // Jenny

    // Map<String, Book>
    Map<String, Book> bookMap = new HashMap<>();
    // put Book
    bookMap.put("John", new Book("ABC"));
    bookMap.put("John", new Book("IJK"));
    bookMap.put("Jenny", new Book("XYZ"));

    for (Map.Entry<String, Book> entry : bookMap.entrySet()) {
      System.out.println(entry.getKey() + " " + entry.getValue().getName());
    }
    // get Book name
    System.out.println(bookMap.get("Jenny").getName()); // XYZ

    // Map<Author, Book>
    Map<Author, Book> bookStore = new HashMap<>();
    bookStore.put(new Author("John"), new Book("ABC"));

    // if there is no equals() & hashCode() -> new entry
    // if there are equals() & hashCode() -> update
    bookStore.put(new Author("John"), new Book("BCD"));

    System.out.println(bookStore.size());
    // put() is not working without hashCode() or equals() method

    System.out.println(bookStore.get(new Author("John"))); // Book(name=BCD)
    // get() is not working without hashCode() or equals() method

    Author john = new Author("John");
    bookStore.put(john, new Book("ABC"));
    bookStore.put(john, new Book("BCD")); // if no equals() & hashCode() -> update

    System.out.println(bookStore.get(john)); // Book(name=BCD)

    System.out.println(bookStore.containsKey(new Author("John"))); // true
    System.out.println(bookStore.containsValue(new Book("BCD"))); // true

    System.out
        .println(bookStore.putIfAbsent(new Author("Ann"), new Book("IJK"))); // null, original value
    System.out
        .println(bookStore.putIfAbsent(new Author("Ann"), new Book("CCC"))); // IJK, original value
    System.out.println("get=" + bookStore.get(new Author("Ann"))); //

    // bookStore.keySet()
    
    // bookStore.values()

    // bookStore.remove

  }
}