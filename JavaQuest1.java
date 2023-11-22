public class JavaQuest1 {

  public static void main(String[] args) {

    System.out.println("I am going to add two numbers together:");
    int first = 31;
    int second = 42;

    System.out.println("The first one: " + first); // 31
    System.out.println("The second one: " + second); // 42

    int sum = first + second;
    System.out.println("The sum is " + sum); // 73

    // subtraction
    int subtract = second - first; 
    System.out.println("The subtraction reuslt is " + subtract); // 11

    // another sum
    byte b1 = 60;
    byte b2 = 70;
    sum = b1 + b2;
    System.out.println("The another sum reuslt is " + sum); // 130

    // declare two boolean variable with true and false value
    boolean varB = false;
    boolean varC = true;
    
    System.out.println("The variable varB is " + varB); // False
    System.out.println("The variable varC is " + varC); // True

    // Reading Example
    float fnumber = -130.20f; // By default, numbers are treated as double in Java.
    // Use suffix 'f' with value to make it float.
    double dnumber = -20.50;
    System.out.println("The variable fnumber is " + fnumber); // -130.2
    System.out.println("The variable dnumber is " + dnumber); // -20.5

    // Find reminder. Declare variable a & reminder
    int a = 7;
    int b = 3;
    // Fix it
    int reminder = 7 % 3; 
    System.out.println("The variable reminder is " + reminder); // 1

    // declare a variable x and assign value to it.
    int e = 7;
    int o = 8;
    int y = 4;
    int x = 2;
    int result = e - o * x / y;
    System.out.println("The result is " + result);
  }
}
