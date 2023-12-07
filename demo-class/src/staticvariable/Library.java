package staticvariable;

import java.util.Arrays;

public class Library {

  private static int bookCounter = 0;

  private static Librarian librarian;
  // private Librarian librarian;

  private Book[] books;

  public Library(Librarian librarian) {
    this.books = new Book[0];
    Librarian.librarian = librarian;
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
    Librarian librarian = new librarian("Jenny");
    Library library = new Library();
    library.addBook(new Book());
    System.out.println(library.bookCount()); // 1
    library.addBook(new Book());
    library.addBook(new Book());
    System.out.println(library.bookCount()); // 3


  }

}
