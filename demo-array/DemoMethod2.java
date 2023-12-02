public class DemoMethod2 {

  public static void main(String[] args) {
    System.out.println(append("abc", "def")); // abcdef
    System.out.println(getLastChar("world")); // d
    System.out.println(isStartedWith("world", "wor")); // true
    System.out.println(remove("world", "or")); // wld

  }

  public static void sound(String animal) {
    // Early Return
    if ("ABC".equals(animal)) {
      return; // similar to break
    }
    if ("Dog".equals(animal)) {
      System.out.println("wo wo");
      return; // similar to break
    } else if ("Cat".equals(animal)) {
      System.out.println("meow");
      return; // similar to break
    }
    System.out.println("Default sound...");
  }

  public static String sound2(String animal) {
    if ("ABC".equals(animal)) {
      return "";
    }
    if ("Dog".equals(animal)) {
      return "wo wo";
    } else if ("Cat".equals(animal)) {
      return "meow";
    }
    return "Default sound...";
  }

  public static void notifyCustomer1() {
    if (sendEmail()) {
      return;
    }
    sendSMS();
  }

  public static boolean notifyCustomer2() {
    if (sendEmail()) {
      return true;
    } else if (sendSMS()) {
      return true;
    }
    return false;
  }

  public static boolean notifyCustomer3() {
    return sendEmail() || sendSMS();
  }

  public static boolean sendEmail() {
    return false;
  }

  public static boolean sendSMS() {
    return false;
  }

  // s2 = "def";
  // return "abcdef"
  public static String append(String s1, String s2) {
    String result = s1.concat(s2);
    return result;
  }

  // Get the last character of the String s
  // if s length < 1, return ' ' (space character)
  public static char getLastChar(String s) {
    char result = s.charAt(s.length() - 1);
    return result;
  }

  // s -> "helloworld"
  // prefix -> "hello"
  // return true
  public static boolean isStartedWith(String s, String prefix) {
    // boolean result = s.startsWith(prefix)
    boolean result = s.indexOf(prefix) == 0;
    return result;
  }

  // s -> "world"
  // toBeRemove -> "or"
  // return "wld"

  public static String remove(String s, String toBeRemoved) {
    String result = s.replace(toBeRemoved, "");
    return result;
  }
}


