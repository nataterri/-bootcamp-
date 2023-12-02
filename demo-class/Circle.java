public class Circle {

  private double radius;

  // Empty Constructor
  public Circle() {}

  // Argument Constructor
  public Circle(double radius) {
    this.radius = radius;
  }

  // Getter
  public double getRadius() {
    return this.radius;
  }

  // Setter
  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double diameter() {

  }

  public double area() {

  }

  // Main - new a circle
  public static void main(String[] args) {
    Circle circle = new Circle(); // radius =0.0
    circle.setRadius(3.2d);
    System.out.println(circle.getRadius()); // 3.2

    Circle circle2 = new Circle(3.4d);
    System.out.println(circle2.getRadius()); // 3.4

    double radiusOfCircle1 = 3.0;
    double AreaOfCircle1 = radiusOfCircle1 * radiusOfCircle1 * 3.14;
    System.out.println(AreaOfCircle1);
  }


}
