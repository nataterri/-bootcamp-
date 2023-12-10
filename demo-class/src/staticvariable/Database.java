package staticvariable;

public class Database {

  private static String[] strings = new String[0]; // strings is Class Data

  // instance (final vs non-final)
  // int number; -> Setter
  // final int number = 3; -> No setter

  // final vs static final
  // 1. "final" is still instance variable, the object can call it by "this"
  // 2. "static final" is constant

  // No static and No final (instance variable)
  // static
  // final (instance variable)
  // static final

  private final int hoursPerDay = 24; // Constant instance variable

  private static final int MINUTES_PER_HOUR = 60; // Constant (MINUTES_PER_HOUR is Class Data)

  public static void add(String str) {
    String[] newArr = new String[strings.length + 1];
    for (int i = 0; i < strings.length; i++) {
      newArr[i] = strings[i];
    }
    newArr[newArr.length - 1] = str;
    strings = newArr;
  }

  public static String get(int index) {
    if (!isIndexValid(index)) // isIndexValid()
      return null;
    return strings[index];
  }

  public static boolean isIndexValid(int index) {
    return index >= 0 && index < strings.length;
  }

  public static boolean remove(int index) {
    if (!isIndexValid(index))
      return false;
    String[] arr = new String[strings.length - 1];
    int j = 0;
    for (int i = 0; i < strings.length; i++) {
      if (index == i)
        continue;
      arr[j++] = strings[i];
    }
    strings = arr;
    return true;
  }

  public String read(int index) {
    return strings[index];
  }

  public static void main(String[] args) {
    // We do not need to create Database object in order to operate static variable
    Database.add("hello");
    System.out.println(Database.get(0)); // hello
    System.out.println(Database.get(1)); // null

    Database d1 = new Database();
    Database d2 = new Database();

    System.out.println(d1.read(0)); // hello
    Database.add("world"); // ["hello", "world"]
    Database.remove(0); // ["world"]
    System.out.println(Database.get(0)); // world

    System.out.println(Database.MINUTES_PER_HOUR); // 60

  }

}