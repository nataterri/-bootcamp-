import java.math.BigDecimal;

public class Circle extends Shape {

  private double radius;

  public Circle() {
    // super(); // calling Shape()
  }

  public Circle(double radius) {
    // super(); // calling Shape()
    this.radius = radius;
  }

  public Circle(double radius, String color) {
    super(color);
    this.radius = radius;
  }

  public double getRadius() {
    return this.radius;
  }

  // Circle extends Shape
  // so it has to implement all abstract methods in Parent abstract class
  @Override
  public double area() {
    return BigDecimal.valueOf(this.radius) //
        .multiply(BigDecimal.valueOf(this.radius)) //
        .multiply(BigDecimal.valueOf(Math.PI)) //
        .doubleValue();
    // divide() -> 10 / 3 -> 3.333333, x.divide(y, 2, RoundingMode.HALF_UP)
  }

  public static void main(String[] args) {
    Circle circle = new Circle(3.4d, "RED");
    System.out.println(circle.area());
  }
}

