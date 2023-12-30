import java.util.Objects;

public class Cat {

  private String name;

  private int age;

  private final Eye[] eyes = new Eye[2]; // 

  public Cat(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  // public Eye[] getEyes() {
  //   return this.eyes;
  // }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Cat))
      return false;
    Cat cat = (Cat) obj;
    // return cat.getAge() == this.age //
    // && cat.getName().equals(this.name);
    return Objects.equals(cat.getAge(), this.age)
        && Objects.equals(cat.getName(), this.name);
        // && Objects.equals(cat.getEyes(), this.eyes)
  }

  @Override
  public int hashCode() { // hashcode -> represent object address
    return Objects.hash(this.name, this.age);
    // return Objects.hash(this.name, this.age, this.eyes);
  }

}
