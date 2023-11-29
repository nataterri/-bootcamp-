public class DemoMethod {
  // main -> method name
  // public -> or private
  // static method -> tool
  // void -> no return type
  public static void main(String[] args) {
    // javac -> compile command, converting .java -> .class
    // java -> run .class file
    int x = 2;
    int y = 10;
    x *= 2; // 4
    x += y;
    System.out.println("x=" + x); // 14

    x = 2;
    y = 100;
    x *= 2; // 4
    x += y;
    System.out.println("x" + x); // 104

    // Trigger Method
    int result10 = sum(10, 3);
    System.out.println(result10); // 13
    System.out.println(sum(2, 4)); // 6
    System.out.println(sum(-10, -30)); // -40

    // Find if any method with 3 int input parameters
    int result13 = sum2(10, 3, 20);
    int result14 = sum3(10, 3, 'c');

    double result15 = sum4(2.3, 2.5);
    System.out.println("result15=" + result15); // 4.8

    double result11 = divide(10, 3);
    System.out.println(result11); // 3.3333
    System.out.println(divide(7, 2)); // 3.5

    double v = (double) 7 / 2; // double / int -> double, int / int -> int
    System.out.println("v=" + v); // 3.5

  }

  // Method name: sum
  // Return type: int
  // Parameters: No parameter, one or more than one parameter
  // f(x1, x2) = x1 + x1
  // y = x1 + x2
  public static int sum(int x1, int x2) {
    int total = x1 + x2;
    return total;
  }

  // Method Signature: sum(int x1, int x2, int x3)
  public static int sum2(int x1, int x2, int x3) {
    int total = x1 + x2 + x3;
    return total;
  }

  // Method Signature: sum(int x1, int x2, char x3)
  public static int sum3(int x1, int x2, char x3) {
    int total = x1 + x2 + x3;
    return total;
  }
  public static double sum4( double x1, double x2) {
    double total = x1 + x2;
    return total;
  }

  public static int subtract(int x1, int x2) {
    int total = x1 - x2;
    return total;
  }

  public static int multiply(int x1, int x2) {
    int total = x1 * x2;
    return total;
  }

  public static double divide(int x1, int x2) {
    double total = (double) x1 / x2; // x1 is int and x2 is int, so x1/ x2 -> int
    return total;



  }
}
