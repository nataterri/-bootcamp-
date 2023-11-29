import java.util.Arrays;

public class JavaQuest6 {
  /**
   * Expected output: 1 1 2 3 5 8 13 21 ...
   * 
   */
  // Count the target of character in a String.
  public static void main(String[] args) {
    // for loop to print first 15 numbers in Fibonacci Sequence

    int a1 = 0;
    int a2 = 1;
    int a3 = 0;
    int[] arr = new int[15];
    for (int i = 0; i < 15; i++) {
      a1 = a2;
      a2 = a3;
      a3 = a1 + a2;
      arr[i] = a3;
    }
    System.out.println(Arrays.toString(arr)); // [1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610]
  }
}
