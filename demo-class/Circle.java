public class Circle {

  private double radius; //

  // Empty Constructor
  public Circle() {

  }
  // Argument Constructor
  public Circle(double radius) {
    this.radius = radius;
  }
  // Getter - Instance method
  public double getRadius() {
    return this.radius;
  }
  // Setter - Instance method
  public void setRadius(double x) {
    this.radius = this.radius + x;
  }

  // Instance method
  public double diameter() { 
    return this.radius * 2; // double * int
  }

  // Instance method
  public double area() {
    // return this.radius * this.radius * 3.14;
    // Math library
    return Math.pow(this.radius, 2) * Math.PI;
  }

}