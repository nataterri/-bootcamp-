// Kind of Class
public record Student(String name, int age) { // final attribute

  public static int test = 1;

  public void read() {
    System.out.println("i am reading ...");
  }

  public static void sleep() {
    System.out.println("i am sleeping ...");
  }

  // public Student() {

  // }

  // public Student(String name) {
  //   this.name = name;
  // }

  // All attributes in "record" have been "final"
  // public void setName(String name) {
  // this.name = name;
  // }
}