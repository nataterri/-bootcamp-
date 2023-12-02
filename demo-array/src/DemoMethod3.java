import java.util.Arrays;

public class DemoMethod3 {
  public static void main(String[] args) {
    int[] beforeArr = new int[] {3, 5, 10};
    System.out.println(sum(beforeArr)); // 18

    System.out.println("beforeArr AddOne(): " + Arrays.toString(beforeArr)); // [3, 5, 10]
    int[] afterArr = addOne(beforeArr);
    System.out.println("afterArr AddOne(): " + Arrays.toString(beforeArr)); // [4, 6, 11]
    System.out.println("afterArr AddOne(): " + Arrays.toString(afterArr)); // [4, 6, 11]

    String before = "abc";
    System.out.println("before=" + before); // abc

    String after = concatHello2(before);

    System.out.println("before= " + before); // abc
    System.out.println("after=" + after); // abchello
  }

  public static int sum(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    return sum;
  }

  // Wrong Approach
  public static int[] addOne(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      arr[i]++;
    }
    return arr;
  }

  // Correct Approach
  public static void addOne2(int[] arr) { // Pass by reference
    for (int i = 0; i < arr.length; i++) {
      arr[i]++;
    }
  }

  // Wrong Approach
  public static void concatHello(String s) { // String is "Pass by value"
    s = s.concat("hello");
  }

  // Correct Approach
  public static String concatHello2(String s) { // String is "Pass by value"
    s = s.concat("hello");
    return s;
  }

  // Primitives + Wrapper CLasses + String (17 types) -> Pass by value
  // array and classes -> Pass by reference

}


