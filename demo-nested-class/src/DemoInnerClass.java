public class DemoInnerClass { // Outer Class

  private Calculator calculator;

  public void setCalculator(Calculator calculator) {
    this.calculator = calculator;
  } 

  public class Calculator { // Inner Class

  }

  public static void main(String[] args) {
    DemoInnerClass d = new DemoInnerClass();
    DemoInnerClass.Calculator c = d.new Calculator();

    DemoInnerClass.Calculator c2 = new DemoInnerClass().new Calculator();

    // c = c2;
  }
}
