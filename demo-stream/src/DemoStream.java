import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DemoStream {
  public static void main(String[] args) throws Exception {
    List<String> strings =
        new ArrayList<>(List.of("hello", "world", "vincent", "oscar"));
    List<String> result = new ArrayList<>();
    // filter out string with length <= 5,
    for (String s : strings) {
      if (s.length() > 5) {
        result.add(s);
      }
    }
    System.out.println(result);

    // stream()
    // list object can invoke stream() method
    List<String> result2 = strings.stream() // similar to for loop
        .filter(s -> s.length() > 5 && s.startsWith("v")) // Predicate: "s -> s.length() > 5"
        .collect(Collectors.toList());
    System.out.println(result2);

    List<Cat> cats = new ArrayList<>(
        List.of(new Cat("ABC", 2), new Cat("DEF", 3), new Cat("IJK", 1)));

    // stream(), name startsWith "I" && age < 2

    // Filter Cat, and return List<Cat>
    List<Cat> result3 = cats.stream() //
        .filter(e -> e.getName().startsWith("I") && e.getAge() < 2) //
        .collect(Collectors.toList());

    System.out.println(result3);

    // Filter Cat, and return List<String>
    // ["IJK", .... ]

    List<String> catNames = cats.stream() //
        .filter(e -> e.getName().startsWith("I") && e.getAge() < 2) //
        .map(e -> e.getName()) //
        .collect(Collectors.toList());

    System.out.println(catNames);
    System.out.println(cats);

    // Convert List<Cat> to List<Dog>

    List<Dog> dogs = cats.stream() //
        .filter(e -> {
          if (e.getAge() < 3)
            return true;
          return false;
        }).map(e -> {
          return new Dog(e.getAge());
        }).collect(Collectors.toList());

    List<Dog> dogs2 = new ArrayList<>();
    for (Cat cat : cats) {
      if (cat.getAge() < 3)
        dogs2.add(new Dog(cat.getAge()));
    }
    System.out.println(dogs2);

    List<Staff> staffs = new ArrayList<>(
        List.of(new Staff("John", 20000.0d), new Staff("John", 15000.0d)));

    double sum = 0.0d;
    for (Staff staff : staffs) {
      sum += staff.getSalary();
    }
    System.out.println(sum);

    double max = -1;
    for (Staff staff : staffs) {
      if (staff.getSalary() > max)
        max = staff.getSalary();
    }
    System.out.println("max salary=" + max);

    // stream
    List<Double> total = staffs.stream() //
        .map(e -> e.getSalary()) //
        .collect(Collectors.toList()); // terminate operation

    double sumOfSalary = staffs.stream() //
        .map(e -> e.getSalary()) //
        .mapToDouble(d -> d) // intermediate operation
        .sum(); // terminate opereation
    System.out.println(sumOfSalary);

    long countOfStaff = staffs.stream() //
        .map(e -> { // intermediate operation
          System.out.println("hello");
          return e;
        }).count(); // terminate opereation

    System.out.println("count=" + countOfStaff);

    // toSet()
    List<Cat> cats2 = new ArrayList<>(
        List.of(new Cat("DEF", 3), new Cat("DEF", 3), new Cat("IJK", 1)));
    Set<Cat> result4 = cats2.stream() //
        .collect(Collectors.toSet());

    System.out.println(result4); // [Cat(name=DEF, age=3), Cat(name=IJK, age=1)]

    // distinct -> remove duplicated elements
    List<Cat> result5 = cats2.stream() //
        .distinct() //
        .filter(e -> e.getAge() >= 3) //
        .collect(Collectors.toList());

    System.out.println(result5); // [Cat(name=DEF, age=3)]

  }
}


