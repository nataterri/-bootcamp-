import java.math.BigDecimal;

public class Calculator {

  private BigDecimal x; // 0.2

  private BigDecimal y; // 0.1

  public Calculator(BigDecimal x, BigDecimal y) {
    this.x = x;
    this.y = y;
  }

  public double add() { // 0.3
    return this.x.add(y).doubleValue();
  }

  public double subtract() { // 0.1
    return this.x.subtract(y).doubleValue();
  }

  public static Calculator of(double x, double y) {
    return new Calculator(BigDecimal.valueOf(x), BigDecimal.valueOf(y));
  }

  public static void main(String[] args) {
    Calculator c1 =
        new Calculator(BigDecimal.valueOf(0.2), BigDecimal.valueOf(0.1));

    Calculator c2 = Calculator.of(0.2, 0.1);
    System.out.println(c2.add()); // 0.3
    System.out.println(c2.subtract()); // 0.1

  }
}

