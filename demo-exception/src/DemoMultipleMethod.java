public class DemoMultipleMethod {

  public static void main(String[] args) {
    // call methodA
    int result = methodA(5, 10);
    System.out.println(result);
  }

  public static int methodA(int x, int y) {
    // call methodB
    int resultB = methodB(x, y);
    return resultB;
  }

  public static int methodB(int x, int y) {
    // call methodC
    int resultC = methodC(x, y);
    return resultC;
  }

  public static int methodC(int x, int y) throws SomeCheckedException {
    // what is the difference of throwing checked or unchecked exxception in methodC?
    // Checked exceptions enforce handling requirements, while unchecked exceptions provide flexibility to the caller.
  }

  // public static int methodC(int x, int y) {
  // throws new UncheckedException();
}


