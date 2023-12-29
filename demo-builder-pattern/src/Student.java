import java.util.ArrayList;
import java.util.List;

public class Student {
  // Builder Pattern Advantages:
  // 1. If you want to control the access to setter after the object created, builder pattern is a good choice.
  // 2. You don't have to create too much constructors, according to the attributes

  private String name;

  private int age;

  private List<String> subjects;

  // 10 fields ... all arguments constructors -> 1 constructor
  // 9 fields constructor? N constructors ...

  private Student(String name, int age, List<String> subjects) {
    this.name = name;
    this.age = age;
    this.subjects = subjects;
  }

  private Student(Builder builder) {
    this.name = builder.name;
    this.age = builder.age;
    this.subjects = builder.subjects;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String name;
    private int age;
    private List<String> subjects;

    public Builder name(String name) { // setter
      this.name = name;
      return this;
    }

    public Builder age(int age) { // setter
      this.age = age;
      return this;
    }

    public Builder subjects(List<String> subjects) { // setter
      this.subjects = subjects;
      return this;
    }

    public Student build() {
      return new Student(this);
    }

  }

  public static void main(String[] args) {
    Student student =
        new Student("John", 13, new ArrayList<>(List.of("Maths", "English")));

    Student student2 = new Student.Builder() //
        .name("Peter") //
        .age(15) //
        .subjects(new ArrayList<>(List.of("Maths", "English"))) //
        .build();

    Student student3 = Student.builder() //
        .name("Jenny") //
        .age(17) //
        .subjects(new ArrayList<>(List.of("Maths", "English"))) //
        .build();

    Student student4 = Student.builder() //
        .name("Tommy") //
        .build();
  }

}
