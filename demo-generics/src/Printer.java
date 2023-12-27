import java.util.ArrayList;
import java.util.List;

public class Printer<T extends Number> { // T is part of class defintion, and it can be bounded

  private List<T> values;

  public Printer() {
    this.values = new ArrayList<>();
  }

  public Printer(T value) {
    this.values = new ArrayList<>(List.of(value));
  }

  public void add(T value) {
    values.add(value);
  }

  public List<T> getValue() {
    return this.values;
  }

  public double sum() {
    double sum = 0;
    for (T t : this.values) {
      sum += (double) t; // T -> Wrapper Class -> (double) -> bug
    }
    return sum;
  }

  public static void main(String[] args) {
    Printer<Integer> integerPrinter = new Printer<>(10);
    // Printer<String> stringPrinter = new Printer<>("abc");
    
    Printer<Double> doublePrinter = new Printer<>(10.3);
    doublePrinter.add(5.5);
    doublePrinter.add(3.2);
    // doublePrinter.add(10L);

  }

}