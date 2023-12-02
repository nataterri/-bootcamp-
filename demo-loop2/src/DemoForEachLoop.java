public class DemoForEachLoop {
  public static void main(String[] args) {
    Integer[] integers = new Integer[] {100, -30, 20};

    for (Integer i : integers) {
      System.out.println("i=" + i);
    }

    for (int i = 0; i < integers.length; i++) {
      System.out.println("i=" + integers[i]);
    }

    String str = "abc,def,ijk,zxy";
    String[] parts = str.split(",");

    /*
     * for (int i = 0; i < parts.length; i++) { System.out.println(parts[i]); }
     */

    for (String s : parts) {
      System.out.println("parts=" + s);
    }

    // Example 1
    String str2 = "abcdefghijk";
    System.out.println("Final String=" + evenIdx(str2));
    System.out.println("Final String=" + evenIdx(""));
    System.out.println("Final String=" + evenIdx("abc")); // "ac"
    System.out.println("Final String=" + evenIdx("abcd")); // "ac"

    // Example 2:
    // Given String "abcdefg"
    // finalString "gfedcba"
    // char array
    System.out.println("Reversed String=" + reverse("abcdef")); // "fedcba"
    System.out.println("Reversed String=" + reverse("")); // ""
    System.out.println("Reversed String=" + reverse("abcde")); // "edcba"

  }

  public static String reverse(String s) {
    char[] result = s.toCharArray();
    // abcdefg (7 / 2 - 1) -> 2
    // abcefg ( 6 / 2 - 1)
    // a <-> g
    // b <-> f
    // when to stop?
    char temp; // local variable
    for (int i = 0; i < result.length / 2; i++) {
      temp = result[i];
      result[i] = result[result.length - i - 1];
      result[result.length - i - 1] = temp;
    }
    return String.valueOf(result);
  }

  public static String reverse2(String s) {
    String result = "";

    return result;
  }

  public static String evenIdx(String s) {

    char[] characters = s.toCharArray(); // toCharArray () -> new char[str2.length]
    // finalString -> "acegik"
    int arrLength = s.length() % 2 == 0 ? s.length() / 2 : s.length() / 2 + 1;
    char[] result = new char[arrLength];
    int idx = 0;
    for (int i = 0; i < characters.length; i++) {
      if (i % 2 == 0) {
        result[idx++] = characters[i];

      }
    }
    return String.valueOf(result);

  }
}


