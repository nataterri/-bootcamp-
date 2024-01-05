public class Dog {
  private String name;
  // private var age; // we cannot use var for attribute

  public Dog(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }
}