public class Student implements Comparable<Student> {

  private int score;

  private String name;

  public Student(int score, String name) {
    this.score = score;
    this.name = name;
  }

  public int getScore() {
    return this.score;
  }

  public String getName() {
    return this.name;
  }

  // public int compareTo(T o);
  // students.add(new Student(40, "Peter"));
  // students.add(new Student(10, "John"));
  // students.add(new Student(98, "Ann"));
  // students.add(new Student(29, "John"));
  // Ann 98 -> John 29 -> John 10 -> Peter 40
  @Override
  public int compareTo(Student s) {
    if (s.getName().compareTo(this.name) > 0) {
      return -1;
    } else if (s.getName().compareTo(this.name) == 0) {
      if (s.getScore() > this.score) {
        return 1;
      } else {
        return -1;
      }
    } else {
      return 1;
    }
  }

  @Override
  public String toString() {
    return "Student(" //
        + "name=" + this.name //
        + " ,score=" + this.score //
        + ")";
  }

}
