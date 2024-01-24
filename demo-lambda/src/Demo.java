import lomboks.Person;

public class Demo {
  public static void main(String[] args) {
    // Inner Class
    Walkable person = new Walkable() {
      @Override
      public void walk() {
        System.out.println("walking ...");
      }
    };
    person.walk(); // walking ...

    // Lambda Expression
    // 1. We don't need to write down method signature for the walk() method. Why?
    // because the interface has only one method, so compiler knows the code block must refer to the walk method.
    // 2. "()" is the input parameters of the walk method.
    // 3. As walk method is void return type, you don't have to return anything inside the code block.
    // 4. Limitation: It can only be used when there is ONLY ONE method in interface (Functional Interface)
    // 5. if there is only one statement inside the code block, don't need to add {} and return;
    // 6. Don't need to specify the input parameter types
    Walkable person2 = () -> {
      System.out.println("I am a person and walking ...");
      System.out.println("hello world");
    };
    person2.walk();

    // What we learned in Week 3
    Walkable person3 = new Person();
    person3.walk();

    // (salary, bonus), refers to the compute(int x, int y) in the interface Calculable
    // Approach 1 to handle one code statement
    Calculable compensation = (salary, bonus) -> salary + bonus;
    System.out.println(compensation.compute(10, 3)); // 13

    // Approach 2 to handle one code statement
    Calculable multiply = (price, quantity) -> {
      return price * quantity;
    };
    System.out.println(multiply.compute(1000, 3)); // 3000
  }
}