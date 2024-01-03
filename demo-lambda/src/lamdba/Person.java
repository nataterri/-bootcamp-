package lamdba;

import java.util.function.Predicate;

// Wrong Example (We should not use a class to implements Predicate)
// Instead, we should use predicate by lambda expression
public class Person implements Predicate<Integer> {

  private int age;

  public Person(int age) {
    this.age = age;
  }

  @Override
  public boolean test(Integer adultAge) {
    return this.age >= adultAge;
  }

  public int getAge() {
    return this.age;
  }

  public static void main(String[] args) {
    Person person = new Person(20);
    person.test(18);
  }
}
