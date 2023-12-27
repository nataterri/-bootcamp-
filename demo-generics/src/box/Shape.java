package box;

import java.util.ArrayList;
import java.util.List;

public class Shape {

  public double area() {
    return -1.0;
  }

  // Static Method: Sum Up all area from the class objects (circle/ Square)
  public static <T extends Shape> double area1(List<T> shapes) { // anything wrong?
    double sum = 0.0d;
    for (T t : shapes) {
      sum += t.area();
    }
    return sum;
  }

  public static double area3(List<? extends Shape> shapes) { // anything wrong?
    double sum = 0.0d;
    for (Shape t : shapes) {
      sum += t.area();
    }
    return sum;
  }

  public static void add(List<? super Shape> shapes, Shape shape) { // anything wrong?
    shapes.add(shape);
  }

  public static double area2(List<Shape> shapes) { // anything wrong?
    double sum = 0.0d;
    for (Shape t : shapes) {
      sum += t.area();
    }
    return sum;
  }



  public static void main(String[] args) {
    List<Circle> circles = new ArrayList<>();
    circles.add(new Circle(3.0));
    circles.add(new Circle(4.0));
    System.out.println(area1(circles));

    List<Square> squares = new ArrayList<>();
    squares.add(new Square(3.0));
    squares.add(new Square(4.0));
    System.out.println(area1(squares));

    List<Shape> shapes = new ArrayList<>();
    shapes.add(new Circle(3.0));
    shapes.add(new Square(4.0));
    System.out.println(area2(shapes));

    // System.out.println(area2(squares));

    area3(shapes);
    area1(shapes);
  }

}