import java.util.Objects;

public class Staff { // similar to "record"

  private final String name;

  private final int age;

  public Staff(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String name() { // getter
    return this.name;
  }

  public int age() {
    return this.age;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Staff))
      return false;
    Staff staff = (Staff) obj;
    return Objects.equals(this.name, staff.name())
        && Objects.equals(this.age, staff.age());
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.name, this.age);
  }

  @Override
  public String toString() {
    return "Staff[" //
        + "name=" + this.name //
        + ",age=" + this.age //
        + "]";
  }
  
}