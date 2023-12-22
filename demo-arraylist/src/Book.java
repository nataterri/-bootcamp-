import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Book {

  private String name;

  public Book(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  // must add for Override: 3 elements -> equals, hashCode, toString
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Book))
      return false;
    Book book = (Book) obj;
    return Objects.equals(this.name, book.getName());
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.name);
  }

  @Override
  public String toString() {
    return "Book(" //
        + "name=" + this.name //
        + ")";
  }

  public static void main(String[] args) {
    List<Book> books = new ArrayList<>();
    Book book = new Book("ABC");
    books.add(book);
    books.add(new Book("IJK"));
    books.add(new Book("XYZ"));

    // contains Book ABC
    // System.out.println(books.contains(new Book("ABC"))); // false, before overriding the equals() method
    System.out.println(books.contains(new Book("ABC"))); // true, after overriding the equals() method
    System.out.println(books.contains(book)); // true

    boolean found = false;
    for (Book b : books) {
      if ("ABC".equals(b.getName()))
        found = true;
    }

    // remove(Object obj)
    books.remove(new Book("IJK"));
    System.out.println(books);

  }
}


