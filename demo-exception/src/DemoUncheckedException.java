public class DemoUncheckedException {

  private double balance;

  public static void main(String[] args) {
    // Unchecked Exception (Run-time exception)
    // 1. It is not required to handle an unchecked exception thrown in the method
    

    double result;
    // Example 1: int / int
    try {
      System.out.println("before");
      result = divide(10, 0);
      System.out.println("after");
    } catch (ArithmeticException e) {
      System.out.println("ArithmeticException");
      result = 0.0d;
    }
    System.out.println("result=" + result);

    divide(3, 0); // I can still call divide(int, int) without handling the run-time exception

    // Example 2: double / double -> 10.0 / 0.0 -> infinite
    try {
      System.out.println("before");
      result = divide(10.0, 0.0);
      if (Double.isInfinite(result)) {
        System.out.println("result is infinite");
      }
      System.out.println("after");
    } catch (ArithmeticException e) {
      System.out.println("ArithmeticException");
      result = 0.0d;
    }
    System.out.println("result=" + result);
  }

  public static double divide(int x, int y) throws ArithmeticException { // 
    return x / y; // Potentially run-time exception - ArithmeticException
  }

  public static double divide(double x, double y) {
    return x / y; // / 0.0 -> infinite
  }

  public boolean deposit(double amount) {
    if (amount <= 0.0d)
      throw new IllegalArgumentException();
    this.balance += amount;
    return true;
  }
}
