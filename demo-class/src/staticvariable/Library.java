package staticvariable;

import java.util.Arrays;

public class Library {

  private static int bookCounter = 0;

  private static Librarian librarian;
  // private Librarian librarian;

  private Book[] books;

  public Library(Librarian librarian) {
    this.books = new Book[0];
    Library.librarian = librarian;
  }

  public String librarianName() {
    return librarian.getName();
  }

  public int bookCount() { // instance method can access static variable
    return bookCounter;
  }

  public void addBook(Book book) {
    bookCounter++;
    Book[] newBooks = Arrays.copyOf(this.books, this.books.length + 1);
    newBooks[newBooks.length - 1] = book;
  }

  public static void main(String[] args) {

    Librarian librarian = new Librarian("Jenny");
    Library library = new Library(librarian);
    library.addBook(new Book());
    System.out.println(library.bookCount()); // 1
    library.addBook(new Book());
    library.addBook(new Book());
    System.out.println(library.bookCount()); // 3

    Librarian librarian2 = new Librarian("Tommy");
    Library library2 = new Library(librarian2);

    System.out.println(library.librarianName()); // Tommy
    System.out.println(library2.librarianName()); // Tommy
  }
}
