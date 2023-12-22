package box;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {

  public T t;

  public T getT() {
    return t;
  }

  public void setT(T t) {
    this.t = t;
  }

  public static <T> Box<T> createBox(T t) {
    Box<T> box = new Box<>();
    box.setT(t);
    return box;
  }

  public static double calculate(Box<Shape> box) {
    return box.getT().area(); //
  }

  public static void addShape(List<Shape> ls, Shape shape) {
    ls.add(shape);
  }

  public static void addShape2(List<? extends Shape> ls, Shape shape) {
    List<Shape> ls2 = (List<Shape>) ls;
    ls2.add(shape);
  }

  public static void addShape3(List<? super Circle> ls, Shape shape) {
    ls.add(new SmallCircle(4.0));
    ls.add(new Circle(3.0));
    // ls.add(new Shape());
  }

  public static <U extends Shape> void xxx(U u) {
    u.area();
  }

  // public static void addShape2(List<? super Circle> ss, Circle shape) {
  // ss.add(new Circle(3.0));
  // ss.add(new Shape());
  // }

  public static void main(String[] args) {
    Box<Circle> circleBox = new Box<>();
    circleBox.setT(new Circle(3.0));
    // calculate(circleBox);
    // error, Box<Circle> <-> Box<Shape> is not Parent relationship
    // Circle <-> Shape is Parent relationship

    Box<Shape> shapeBox = new Box<>();
    shapeBox.setT(new Circle(3.0));
    calculate(shapeBox);

    //
    List<? extends Object> xs = new ArrayList<Circle>();
    // Object o = xs.get(0);

    List<? extends Shape> ls = new ArrayList<Shape>();
    addShape2(ls, new Circle(4.0));
    System.out.println(ls.size()); // 1

    List<Shape> ll = (List<Shape>) ls;
    ll.add(new Shape());
    System.out.println(ll.size()); // 2


    ls = new ArrayList<Circle>();

    Shape s = new Circle(3.0);
    System.out.println(s.area()); // 28.xxx
    Circle c = (Circle) s;


    s = new Shape();
    System.out.println(s.area()); // -1
  }

}

