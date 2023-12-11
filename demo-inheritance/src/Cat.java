public class Cat extends Animal {

  // Cat Class inherit all public attributes, methods
  // Cat did NOT inherit constructor

  public Cat() {
    // super(); // implicitly call Animal() constructor
  }

  public static void main(String[] args) {
    Cat cat = new Cat(); // Create a Cat Object -> Cat() -> call Animal()
    cat.setAge(2);
    System.out.println(cat.getAge()); // 2

  }

}