import java.math.BigInteger;

public class DemoNumber {
  public static void main(String[] args) {
    Float f1 = Float.valueOf(60000.0f);
    Number n1 = f1; // upcast
    System.out.println(n1.shortValue()); // -5536 (overflow)

    // Long, Short, Byte, Integer

    BigInteger bi1 = add(1, 3);
    BigInteger bi2 = add(2, 5);
    System.out.println(bi1.compareTo(bi2)); // -1
  }

  // public static Number add(Integer x, Integer y) {
  // return 2;
  // }

  public static BigInteger add(Number x, Number y) {
    long l1 = 0L;
    if (x instanceof Long) { // true -> means, the object of x is created by Long.class
      l1 = (Long) x;
    } else if (x instanceof Short) {
      l1 = (Short) x;
    } else if (x instanceof Byte) {
      l1 = (Byte) x;
    } else if (x instanceof Integer) {
      l1 = (Integer) x;
    }
    long l2 = 0L;
    if (y instanceof Long) { // true -> means, the object of y is created by Long.class
      l2 = (Long) y;
    } else if (y instanceof Short) {
      l2 = (Short) y;
    } else if (y instanceof Byte) {
      l2 = (Byte) y;
    } else if (y instanceof Integer) {
      l2 = (Integer) y;
    }
    return BigInteger.valueOf(l1 + l2);
  }
}
