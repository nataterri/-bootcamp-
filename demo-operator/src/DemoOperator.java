public class DemoOperator {

  public static void main(String[] args) {

    int x = 2;
    x++;
    ++x;
    x += 1;
    x = x + 1; // 6

    // Difference between a++ and ++a
    // PreIncrement
    int a = 5;
    int preIncrement = ++a; // a is incremented by 1 first, and then being assigned to the variable
    // a -> 6 first, then preIncrement -> 6
    System.out.println("preIncrement=" + preIncrement); // 6
    System.out.println("a=" + a); // 6

    int c2 = 1;
    c2++;
    int postIncrement2 = c2;

    // PostIncrement
    int b = 5;
    int postIncrement = b++; // assign the value of variable a to postIncrement first, a incremented by 1
    // postIncrement -> 5, b -> 6
    System.out.println("postIncrement=" + postIncrement); // 5
    System.out.println("b=" + b); // 6

    int c = 1;
    int postIncrement3 = c;
    c++;

    // Conditional Operators
    // && || !
    // Example 1 - AND
    if (c == 2 && b == 4) { // && -> Both two conditions need to be fulfilled
      // (c == 2) -> true
      // (b == 4) -> false
      // (true && false) -> false
      System.out.println("example 1=yes");
    } else {
      System.out.println("example 1=no"); // print
    }
    // Example 2 - OR
    if (c == 2 || b == 4) { // && -> Either conditions be fulfilled
      // (c == 2) -> true
      // (b == 4) -> false
      // (true || false) -> true
      System.out.println("example 2=yes"); // print
    } else {
      System.out.println("example 2=no");
    }
    // Example 3 - AND OR
    String h = "hello";
    if (c == 2 && (b == 4 || "hello".equals(h))) {
      // (c == 2) -> true
      // (b == 4) -> false
      // "hello".equals(h) -> true
      // (true && (false || true)) -> true
      System.out.println("example 3=yes"); // print
    } else {
      System.out.println("example 3=no");
    }
    // Example 4 - AND
    if (c == 1 && b == 6) {
      // (c == 1) -> false
      // (b == 6) will NOT be executed
      System.out.println("example 4=yes");
    }
    // Example 5 - AND OR
    if (c == 1 || b == 4 && "hello".equals(h)) {
      // b == 4 -> false
      // "hello".equals(h) -> true
      // c == 1 -> false
      // false || false && true
      // false || false
      // false
      System.out.println("example 5=yes");
    } else {
      System.out.println("example 5=no");
    }

    // Example 6 -AND OR
    if (h.charAt(3) == 'e' || b == 6) {
      // h.charAt(3) -> 'l'
      // b == 6 -> true
      // false || true
      // true
      System.out.println("example =6yes");

    }

    // 20231122 14:00
    // Comparsion oerators NOT only exists in if statemnts
    // boolean -> && ||
    boolean b1 = true && false;
    System.out.println("b1=" + b1);// false

    boolean b2 = false;
    boolean b3 = true;

    boolean result = b2 || b3;
    System.out.println("Result=" + result);// true

    boolean result2 = b2 || b3 && b1;
    System.out.println("result2=" + result2);// false


    if (b1 == false) { // !b1
      System.out.println("example 7=b1 is false"); // print
    }

    if (!b1) {// b1 == false
      System.out.println("example 7=b1 is false"); // print

    }

    if (b1 == true) { // b1
      System.out.println("example 8=b1 is true"); // not print
    }

    if (b1) {// b1 == true
      System.out.println("example 8=b1 is true"); // not print
    }

    int g = 0;
    if (b1 == false) {
      g = 10; //
    }

    int k = b1 == false ? 10 : 0;
    System.out.println("k=" + k);
    // if b1 is false, assign 10 to k, otherwise 0

    int a1 = 10;
    int a2 = 4;
    int min;

    if (a1 < a2) {
      min = a1;
    } else { // a1 == a2 or a1> a2
      min = a2;
    }
    System.out.println("min= + min");

    int number = 13;
    boolean isOdd;
    // %
    if (number % 2 == 0) {
      isOdd = false;
    } else {
      isOdd = true;
    }
    System.out.println("Odd Number:" + isOdd); // Odd Number: true

    double totalAmount = 0;
    int itemTotal = 2211;
    double feeRate = 0.03;
    // if itemTotal > 3000, NO transportation fee, otherwise +3% transportation fee
    // if (itemTotal > 3000) {
    // totalAmount = itemTotal;
    // } else {
    /// totalAmount = itemTotal * (1 + feeRate);
    // }
    double transportationFee = 0.0d;
    if (itemTotal <= 3000) {
      transportationFee = itemTotal * feeRate;
    }
    totalAmount = itemTotal + transportationFee;

    System.out.println("Total Amount" + totalAmount); // 2277.33

    // >, <, >=, !
    boolean isPassed = false;
    if (!isPassed) { // == false
      System.out.println("isPassed is false");
    }
    isPassed = true; // re-assignment
    if (isPassed) { // == true
      System.out.println("isPassed is true");

      String str = "www.apple.com";
      if (str.length() < 10 || "apple".equals(str)) {
        System.out.println("length < 10 or www.apple.com");

        String s = " "; // empty string, length = 0
        System.out.println(); // 0
        s += "hello";
        if (!s.isEmpty()) {
          System.out.println("s is not empty");
        }

      }

    }
  }
}
