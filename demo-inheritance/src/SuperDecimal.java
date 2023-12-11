import java.math.BigDecimal;

// BigDecimal has NO the "final" keyword, so SuperDecimal can inherit it.
public final class SuperDecimal extends BigDecimal {

  public SuperDecimal() {
    super("0.0"); // new BigDecimal("0.0")
  }

  // Constructor
  private SuperDecimal(double value) {
    super(String.valueOf(value)); // new BigDecimal("3.0")
  }

  public static SuperDecimal valueOf(double value) {
    return new SuperDecimal(value);
  }

  public SuperDecimal multiply(SuperDecimal value) {
    BigDecimal bd = this; // upcast
    BigDecimal bdValue = value; // upcast
    return new SuperDecimal(bd.multiply(bdValue).doubleValue());
  }

  public static void main(String[] args) {
    SuperDecimal sd = new SuperDecimal(); // calling BigDecimal()

    SuperDecimal sd2 = SuperDecimal.valueOf(3.0);
    SuperDecimal sd3 = SuperDecimal.valueOf(4.0);

    // 3.0 x 4.0 (sd2 * sd3)
    // sd2, sd3 inherit all BigDecimal public instance methods
    SuperDecimal sd4 = sd2.multiply(sd3);
    System.out.println(sd4.doubleValue());

  }
}
