package calculator;

import java.util.List;

public class CheckOut {

  // call formula()
  // Force the method caller to pass an object implementing Adjustment interface
  public static <T extends Adjustment> double calculate(List<T> items, double adjustment) {
    double total = 0.0d;
    for (T item : items) {
      total += item.adjust(adjustment); // because T is bounded by a contract Adjustment.class
    }
    return total;
  }

}
