package literalpool;

public class DemoString {

  public static void main(String[] args) {
    // Quiz
    String str1 = "hello";
    String str2 = "hello"; // check if "hello" exists in String Literal Pool
    // so that JVM can reuse "hello" object by various object reference

    System.out.println(str1.equals(str2)); // true
    System.out.println(str1 == str2); // true, literal pool

    String str3 = "hello!";
    System.out.println(str1.equals(str3)); // false
    System.out.println(str1 == str3); // false, different value

    String str4 = new String("hello");
    System.out.println(str1.equals(str4)); // true
    System.out.println(str1 == str3); // false, "new" force creating an object

    String str5 = String.valueOf("hello");
    System.out.println(str1.equals(str5)); // true
    System.out.println(str1 == str5); // true, look up literal

    // Concatentation
    String str7 = "abc";
    String str8 = str7 + "def"; // there will be 2 string object in literal pool
    
    System.out.println("hello " + (str7 == str8)); // false

    //
    String str10 = new String("aaabbb"); // new a string in heap memory
    String str11 = "aaabbb";
    System.out.println(str10 == str11); // false

    String str13 = new String("aaabbb").intern(); // str13 -> literal pool "aaabbb"
    String str14 = "aaabbb";
    System.out.println(str13 == str14); // true

    if ("hello".equals(str5)) { // best practice to check the value of String
      System.out.println("str5 is equal to hello");
    }

    // Java Compiler would NOT look at the value assigned to object reference during the compile time
    // String str6 = null;
    // if (str6.equals("hello")) { // java.lang.NullPointerException
    //   System.out.println("It is bad practice to check string value");
    // }

  }
}
