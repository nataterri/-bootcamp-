package lamdba;

import java.util.Random;
import java.util.function.Supplier;

public class DemoSupplier {

  public static void main(String[] args) {
    Supplier<Integer> randomInteger = () -> new Random().nextInt(100) + 1; // 1 - 100
    System.out.println(randomInteger.get());

    Supplier<Book> emptyBook = () -> new Book();
    Book book = emptyBook.get();
    
  }

}