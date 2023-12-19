public class Cow extends Animal {

  public String eat(String food) {
    return "[Cow] i am eating " + food + " ...";
  }

  // Polymorphism + Overloading (Not Overriding)
  public static void main(String[] args) {
    Animal cow = new Cow(); // Compile-time / Run time
    // Compile time: cow object can access which methods
    System.out.println(cow.eat()); // the object has 2 methods: eat(), eat(String)
    // "cow" object reference is declared by Animal
    // so it can call eat() only, but not eat(String food).

    // Run time: Find the object pointing to.
    // The object is created by "Cow" class.

    // System.out.println(cow.eat("sushi")); // Compile error: Animal.class has no eat(String) method

    Animal cow2 = new Animal();
    // cow2.eat("sushi"); // Compile error: Animal.class has no eat(String) method

  }

}

