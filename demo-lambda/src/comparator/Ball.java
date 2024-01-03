package comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ball {

  private Color color;

  private double price;

  public Ball(Color color, double price) {
    this.color = color;
    this.price = price;
  }

  public Color getColor() {
    return this.color;
  }

  public double getPrice() {
    return this.price;
  }

  @Override
  public String toString() {
    return "Ball(" //
        + "price=" + this.price //
        + ",color=" + this.color.name() //
        + ")";
  }

  public static void main(String[] args) {
    List<Ball> balls = new ArrayList<>( //
        List.of(new Ball(Color.WHITE, 10.3), //
            new Ball(Color.BLACK, 7.5), //
            new Ball(Color.RED, 7.5), //
            new Ball(Color.YELLOW, 3.0), //
            new Ball(Color.BLACK, 3.0)));

    // Approach 1:
    Collections.sort(balls, new SortByColor());
    System.out.println(balls);

    Collections.sort(balls, new SortByPrice());
    System.out.println(balls);

    // Approach 2:
    // Lambda Expression:
    // 1) implementing the logic of the required method
    // 2) new the object with that implementation
    Comparator<Ball> sortByColor = (b1, b2) -> {
      return b2.getColor().name().compareTo(b1.getColor().name());
    };

    Comparator<Ball> sortByPrice = (b1, b2) -> {
      return b2.getPrice() > b1.getPrice() ? 1 : -1;
    };

    Comparator<Ball> sortByColorAndThenPrice =
        sortByColor.thenComparing(sortByPrice);

    Collections.sort(balls, sortByColorAndThenPrice);
    System.out.println(balls);

    // Sort by Price
    Collections.sort(balls, (b1, b2) -> b2.getPrice() > b1.getPrice() ? 1 : -1);
  }

}

