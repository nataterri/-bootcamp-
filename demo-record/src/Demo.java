public class Demo {

  public static void main(String[] args) {
    // Allow All-args constructor only
    Student student = new Student("John", 20);
    System.out.println(student.name()); // getter
    // no setter in Record

    // toString
    System.out.println(student); // Student[name=John, age=20]

    // equals
    Student student2 = new Student("John", 20); 
    System.out.println(student.equals(student2)); // true

    // hashCode()
    System.out.println(student.hashCode()); // 71750729
    System.out.println(student2.hashCode()); // 71750729 
  }
  
}
