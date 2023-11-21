public class DemoString {
  public static void main(String[] args) {
    String emailAddress = "nata.terri@gmail.com";
    // String s = 3; // s is declared by String, so you cannot assign int value 
    int i = "hello"; // i is declared by int, you cannot assign String value

    System.out.println(emailAddress); // nata.terri@gmail.com

    // Operations -> append
    String str = "hello" + " " +"world";
    System.out.println(str); // "helloworld"

    // Always look at the code inside the bracket first
    // Step 1: "hello" + " " + "world" -> "hello world"
    // Step 2: System.out.println() -> Print out
    System.out.println("hello" + " " +"world"); //"hello world"

    String str1 = "hello";
    System.out.println(str1); //"hello"
    System.out.println(str1.length()); // 5
    str1 = str 1 + "world";
    System.out.println(str1.length ()); // 10

    str1 += "!!!";
    System.out.println(str1.length ()); // 13

    // No "-", "*", "/" in String
    // String supporrts "+", "+="

    }
  
}
