import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoComparable {
  public static void main(String[] args) {

    List<Student> students = new ArrayList<>();
    students.add(new Student(40, "Peter"));
    students.add(new Student(10, "John"));
    students.add(new Student(98, "Ann"));
    students.add(new Student(29, "John"));
    System.out.println(students); // [Student(score=40), Student(score=10), Student(score=98), Student(score=29)]

    // Comparable
    Collections.sort(students);
    System.out.println(students); // [Student(name=Ann ,score=98), Student(name=John ,score=29), Student(name=John ,score=10), Student(name=Peter ,score=40)]

    // Comparator
    Collections.sort(students, new SortByScore());
    System.out.println(students); // [Student(name=John ,score=10), Student(name=John ,score=29), Student(name=Peter ,score=40), Student(name=Ann ,score=98)]
  }
}
