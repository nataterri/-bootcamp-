public class DemoStringBuilder {
  public static void main(String[] args) {
    // String: +=, concat()
    String x = "abc";
    x += "def";
    x = x.concat("def"); // pass by value -> new String()
    System.out.println(x); // abcdefdef

    // StringBuilder (Holder)
    StringBuilder sb = new StringBuilder("abc");
    sb.append("def").append("def"); // pass by reference (another layer) -> point to new object
    System.out.println(sb.toString()); // abcdefdef

    // while loop -> counter
    // 123 456 789 101112...
    int counter = 4; // 123 456 789 101112
    StringBuilder sb2 = new StringBuilder(""); // ""
    // counter = 3 // 123 456 789
    int num = 0;
    while (counter-- > 0) {
      // sb2.append(++num).append(++num).append(++num);
      for (int i = 0; i < 3; i++) {
        sb2.append(++num);
      }
      if (counter > 0) {
        sb2.append(" "); // delete space in ""
      }
    }
    System.out.println(sb2.toString()); // "123 456 789 101112 "

    sb2.setLength(0);
    counter = 4; // aaa bbb ccc ddd
    char z = 'a';
    while (counter-- > 0) {
      for (int i = 0; i < 3; i++) {
        sb2.append(z);
      }
      if (counter > 0) {
        sb2.append(" ");
      }
      z++;
    }
    System.out.println(sb2.toString()); // "aaa bbb ccc ddd"

    System.out.println(sb2.reverse().toString()); // "ddd ccc bbb aaa"

    System.out.println(sb2.insert(4, "bootcamp").toString()); // ddd bootcampccc bbb aaa

    System.out.println(sb2.delete(0, 6).toString()); // otcampccc bbb aaa

    sb2.setCharAt(2, 'J');
    System.out.println(sb2.toString());

    System.out.println(sb2.charAt(2)); // 'J'

    System.out.println(sb2.toString()); //
    sb2.replace(2, 6, "abc");
    System.out.println(sb2.toString()); // otabcccc bbb aaa

    System.out.println(sb2.isEmpty()); // false
    System.out.println(sb2.length()); // 16
    System.out.println(sb2.substring(0, 3)); // "ota"

    StringBuilder s1 = new StringBuilder("abc");
    StringBuilder s2 = new StringBuilder("abc");
    System.out.println(s1 == s2); // false
    System.out.println(s1.toString().equals(s2.toString())); // true

    System.out.println(s1.compareTo(s2)); // 0

    System.out.println(stringConcat()); // 875875
    System.out.println(stringBuilderAppend()); // 353500

  }

  public static long stringConcat() {
    long start = System.nanoTime();
    String s = "";
    for (int i = 0; i < 1000; i++) {
      s = s.concat("a");
    }
    long end = System.nanoTime();
    return end - start;
  }

  public static long stringBuilderAppend() {
    long start = System.nanoTime();
    StringBuilder s = new StringBuilder();
    for (int i = 0; i < 1000; i++) {
      s.append("a");
    }
    long end = System.nanoTime();
    return end - start;
  }
}
