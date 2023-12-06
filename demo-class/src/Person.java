// blueprint, to produce Person objects
public class Person {

  // Attributes
  private String lastName;
  private String firstName;

  private int age; // 0

  // Empty Constructor (Produce Person's object)
  public Person() {

  }

  public Person(String firstName) {
    this.firstName = firstName;
  }

  public Person(String lastName, String firstName) {
    this.lastName = lastName;
    this.firstName = firstName;
  }

  public Person(String lastName, String firstName, int age) {
    // this.lastName = lastName;
    // this.firstName = firstName;
    this(lastName, firstName);
    this.age = age;
  }

  // Instance Method 
  // 1. Belongs to the object (Person p1 = new Person(); p1.swim())
  // 2. Able to control the instance variable by "this"

  // Static Method
  // 1. Belongs to the class (ClassName.staticMethod() -> Person.swim(3))
  // 2. Not able to read / write instance variable
  // 3. The return value completely derived by the input parameters

  // Instance Method (Object method)
  // Setter
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  // Getter
  public String getLastName() {
    return this.lastName;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public String getFullName() {
    // if lastNAme -> "", return "John"
    // if lastName -> "x", return "John X"
    if (this.lastName == null)
      return this.firstName;
    return this.lastName.isEmpty() ? this.firstName
        : this.firstName.concat(" ").concat(this.lastName);
  }

  public String getFullName(boolean isCapLetter) {
    String fullName = this.firstName.concat(" ").concat(this.lastName);
    return isCapLetter ? fullName.toUpperCase() : fullName.toLowerCase();
  }

  //
  public String getFullName2() {
    return this.firstName.substring(0, 1).toUpperCase()
        .concat(this.firstName.substring(1, this.firstName.length()))
        .concat(" ") //
        .concat(this.lastName.substring(0, 1).toUpperCase())
        .concat(this.lastName.substring(1, this.lastName.length()));

  }

  public static void swimming() {
    System.out.println(" I'm swimming"); // cannot use object data
  }

  public void swim() { // void method can be with or without "return"
    int a = 1;
    if (a > 2)
      return;
    System.out.println(this.firstName + " is swimming.");
  }

  public int eat() { // int method has to be with "return"
    int b = 10;
    if (b > 12) {
      return 100;
    }
    return -1;
  }

  public static void main(String[] args) {
    Person p1 = new Person();
    p1.setFirstName("John");
    Person p2 = new Person();
    p2.setFirstName("Peter");

    Person p3 = p1;
    p3.setFirstName("Mary");

    Person p4 = new Person("Tommy");
    p4.setFirstName("Jenny");
    System.out.println(p4.getFirstName()); // "Jenny"
    System.out.println(p3.getFirstName()); // "Mary"
    System.out.println(p1.getFirstName()); // "Mary"
    System.out.println(p2.getFirstName()); // "Peter"

    Person p5 = new Person("Ken", "Wong");
    System.out.println("p5 full name=" + p5.getFullName()); // "Ken Wong"
    System.out.println("p5 full name=" + p5.getFullName(true)); // "KEN WONG"
    System.out.println("p5 full name=" + p5.getFullName(false)); // "ken wong"


    // Person p5 = new Person("chris", "chan");
    // "Chris Chan"
    // substring()

    // Static vs Instance Method
    // Call Instance Method
    Person p6 = new Person("Jenny");
    p6.setLastName("Chan");
    p6.swim(); // Jenny is swimming

    // Call Static Method
    Person.swimming(); // I'm swimming

  }
}


