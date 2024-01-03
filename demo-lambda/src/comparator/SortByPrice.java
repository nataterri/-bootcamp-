package comparator;

import java.util.Comparator;

public class SortByPrice implements Comparator<Ball> {

  @Override
  public int compare(Ball b1, Ball b2) {
    return b2.getPrice() > b1.getPrice() ? 1 : -1;
  }

}
