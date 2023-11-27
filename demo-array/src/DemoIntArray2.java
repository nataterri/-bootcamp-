public class DemoIntArray2 {

  public static void main(String[] args) {
    // int array 10, 8, 6, 4, 2
    int[] arr = new int[] {10, 8, 6, 4, 2};
    // for loop -> sum
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    System.out.println("sum=" + sum);

    // Find the max value
    int max = Integer.MIN_VALUE; // -21xxxxxxxx
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    System.out.println("max=" + max);

    // Find the min value
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    System.out.println("min=" + min);

    // second max value
    int secondMax = Integer.MIN_VALUE;
    max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        secondMax = max;
        max = arr[i];
      } else if (arr[i] > secondMax) {
        secondMax = arr[i];
      }
    }
    System.out.println("Second Max=" + secondMax);
  }
}


