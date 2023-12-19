public class ABC {

  private static int number = 2;

  private static String str = new String("Hello");

  private int value = 10;

  // static block: Will be executed no matter you have static variable or not
  static {
    System.out.println("Start static block, number=" + number); // 1
    number = 3;
    System.out.println("End static block, number" + number); // 2
  }

  // instance block: will be executed only when you "new" an object of ABC.class
  {
    System.out.println("Start instance block, this.value=" + this.value); // 5
    this.value++;
    System.out.println("End instance block, this.value=" + this.value); // 6
  }

  public static void main(String[] args) {
    //System.out.println("Start main(), number=" + number); // 3

    ABC abc = new ABC(); // 4
    System.out.println("this.value=" + abc.value); // 7

    // System.out.println("End main(), number=" + number); // 8
  }
}